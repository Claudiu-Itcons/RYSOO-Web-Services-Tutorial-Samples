<?php

/*
 * Copyright (C) 2014 Daniele Vottero http://daniele.vottero.eu/me   
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */

# classes generated with wsdl2phpgenerator ( https://code.google.com/p/wsdl2phpgenerator/ )
# remember to use the option --singleElementArrays 
# ex: ./wsdl2php  --singleElementArrays -i http://iabx000002.iabx.net/abxWsGestService/abxWsGest?wsdl -o ../ws
# (note: on my experience wsdl2php run well on linux platform)

include './ws/abxWsGestService.php';

class baseOp {

    const Login_OK_LOGIN = 0x00000001;
    const Logout_OK = 0x00000010;
    const Ping_OK = 0x00022000;
    const WsdlVersion_OK = 0x00042020;
    
    const wsdlversion_WARNING = "0000000002";    // this value must be equal to value returned from webservices when you compile program
    const wsdlversion_ERROR = "0000000001";      // this value must be equal to value returned from webservices when you compile program

    // sessionIDF contain data to identify active user session
    private $sessionIDF;
    // port is used to talk with server
    private $port;

    public function getSessionIDF() {
        return $this->sessionIDF;
    }

    // try to connect on remote server via webservices
    public function Connect($srvEndPoint) {
        
        $ret = true;
        
        $options = array();
        $wsdl = $srvEndPoint . '/abxWsGestService/abxWsGest?wsdl';
        $this->port = new abxWsGestService($options, $wsdl);

        // dummy string used to verify connection
        $testString = "dummy string";
        $l = new Ping();
        $l->In = $testString;

        // do ping to server
        if ($this->port != null) {
            $result = $this->port->Ping($l);
            if ($result->return->result != self::Ping_OK){
                // ping is not ok
                $ret = false;
            }else{
                if ($result->return->value == $testString){
                    // check if wsdl is changed
                    $wsdlreq = new GetWsdlVersion();
                    $wsdlresponse = $this->port->GetWsdlVersion($wsdlreq);
                    if ($wsdlresponse->return->result != self::WsdlVersion_OK){
                        // response ko
                        $ret = false;
                    }else{
                        if ($wsdlresponse->return->ERRORvalue != self::wsdlversion_ERROR){
                            // wsdl is critical different 
                            echo "Wsdl is critical different: stop program\n";
                            $ret = false;
                        }else{
                            if ($wsdlresponse->return->WARNINGvalue != self::wsdlversion_WARNING){
                                // wsdl is warning different
                                echo "Wsdl is warning different: program can continue\n";
                            }
                        }
                    }
                }else{
                    // strings are not equal
                    $ret = false;
                }
            }
        }
        return $ret;
    }

    // execute Login
    public function Login($login) {

        $ret = false;

        if ($this->port != null) {
            
            $l = new Login();
            $l->LoginParam = $login;
            
            $result = $this->port->Login($l);
                  
            if ($result->return->result == self::Login_OK_LOGIN) {
                $this->sessionIDF = $result->return->sessionIDF;
                $ret = true;
            } else {
                echo "Login KO, error code: " . $result->return->result;
            }
        }
        return $ret;
    }

    // execute Logout
    public function Logout() {

        $ret = false;

        if ($this->port != null) {
            
            $l = new Logout();
            $l->SessionId = $this->sessionIDF;
            $result = $this->port->Logout($l);
            
            if ($result->return->result != self::Logout_OK) {
                echo "Logout KO, error code: " . $result->return->result;
            } else {
                $ret = true;
            }
        }
        return $ret;
    }
}
