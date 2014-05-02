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

// project gsoap to generate C++ classes
// http://www.cs.fsu.edu/~engelen/soap.html 
// run:
//      wsdl2h -ttypemap.dat -s -ows.h http://iabx000002.iabx.net/abxWsGestService/abxWsGest?wsdl
//      soapcpp2 -C -j ws.h
// include gsoap library in the project (-lgsoap++) or with ssl support (lgsoapssl++)


#include <cstdlib>
#include "base.h"

using namespace std;

base::base() {
}

base::base(const base& orig) {
}

base::~base() {
}

ns1__IDtype* base::getSessionIDF() {
    return this->sessionIDF;
}

// try to connect on remote server via webservices
bool base::Connect(string srvEndPoint) {
    bool ret = true;

    
    this->endPointURL = srvEndPoint;
    this->endPointURL.append("/abxWsGestService/abxWsGest");
    
    abxWsGestPortBindingProxy *port = new abxWsGestPortBindingProxy(this->endPointURL.c_str());
        
    if (port != NULL) {
        // dummy string used to verify connection
        string testString = "dummy string";

        ns1__Ping in;
        in.In = (char*) testString.c_str();
        ns1__PingResponse result;

        // do ping to server
        port->Ping(&in, &result);

        if (result.return_->result != Ping_OK) {
            // ping is not ok
            ret = false;
        } else {
            if (testString.compare(result.return_->value) == 0) {
                // check if wsdl is changed
                ns1__GetWsdlVersion wsdlreq;
                ns1__GetWsdlVersionResponse wsdlresponse;
                port->GetWsdlVersion(&wsdlreq, &wsdlresponse);
                if (wsdlresponse.return_->result != WsdlVersion_OK){
                    // response ko
                    ret = false;
                }else{
                    if (wsdlversion_ERROR.compare(wsdlresponse.return_->ERRORvalue) != 0){
                        // wsdl is critical different 
                        cerr << "Wsdl is critical different: stop program" << endl;
                        ret = false;
                    }else{
                        if (wsdlversion_WARNING.compare(wsdlresponse.return_->WARNINGvalue) != 0){
                            // wsdl is warning different
                            cerr << "Wsdl is warning different: program can continue" << endl;
                        }
                    }
                }
            }else{
                // strings are not equal
                ret = false;
            }
        }
        delete port;
    }
    if (!ret) {
        cerr << "Connect KO to server: " << srvEndPoint << endl;
    }
    
    return ret;
}

// execute Login
bool base::Login (ns1__abxLoginIdentity *login){
    bool ret = false;
    
    abxWsGestPortBindingProxy *port = new abxWsGestPortBindingProxy(this->endPointURL.c_str());
    
    if (port != NULL){
        ns1__LoginResponse result;
        ns1__Login *inlogin = new ns1__Login();
        inlogin->LoginParam = login;
        
        port->Login(inlogin,&result);
        
        if (result.return_->result == Login_OK_LOGIN){
            this->sessionIDF = result.return_->sessionIDF;
            ret = true;
        }else{
            cerr << "Login KO, error code: " + result.return_->result << endl;
        }
        delete port;
    }
    
    return ret;
}

// execute Logout
bool base::Logout(){
    bool ret = false;
    
    abxWsGestPortBindingProxy *port = new abxWsGestPortBindingProxy(this->endPointURL.c_str());
    
    if (port != NULL){
        ns1__Logout *inlogout = new ns1__Logout();
        ns1__LogoutResponse *result = new ns1__LogoutResponse();
        
        inlogout->SessionId = this->sessionIDF;
        
        port->Logout(inlogout,result);
        
        if (result->return_->result != Logout_OK){
            cerr << "Logout KO, error code: " << result->return_->result << endl;
        }else{
            ret = true;
        }
        delete port;
    }
    
    return ret;
}