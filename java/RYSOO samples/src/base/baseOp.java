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
package base;

import abx.ws.AbxLoginIdentity;
import abx.ws.AbxLoginResult;
import abx.ws.AbxWsGest;
import abx.ws.AbxWsGestService;
import abx.ws.AbxPingResult;
import abx.ws.IDtype;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author dev
 */
public class baseOp {

    public static final int Login_OK_LOGIN = 0x00000001;
    public static final int Logout_OK = 0x00000010;
    public static final int Ping_OK = 0x00022000;

    // sessionIDF contain data to identify active user session
    private IDtype sessionIDF = null;

    // port is used to talk with server
    private AbxWsGest port = null;

    public IDtype getSessionIDF() {
        return sessionIDF;
    }

    // try to connect on remote server via webservices
    public boolean Connect(String srvEndPoint) {
        boolean ret = true;

        AbxWsGestService ws = new AbxWsGestService();
        port = ws.getAbxWsGestPort();
        BindingProvider bp = (BindingProvider) port;
        try {
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, srvEndPoint + "/abxWsGestService/abxWsGest");

            if (port != null) {
                // dummy string used to verify connection
                String testString = "dummy string";

                // do ping to server
                AbxPingResult result = port.ping(testString);
                if (result.getResult() != Ping_OK) {
                    // ping is not ok
                    ret = false;
                } else {
                    if (result.getValue().compareTo(testString) != 0) {
                        // strings are not equal
                        ret = false;
                    }
                }
            }
        } catch (Exception e) {
            // error establishing connection with server
            ret = false;
        }
        if (!ret) {
            System.err.println("Connect KO to server: " + srvEndPoint);
        }
        return ret;
    }

    // execute Login
    public boolean Login(AbxLoginIdentity login) {

        boolean ret = false;

        if (port != null) {
            AbxLoginResult result = port.login(login);
            if (result.getResult() == Login_OK_LOGIN) {
                this.sessionIDF = result.getSessionIDF();
                ret = true;
            } else {
                System.err.println("Login KO, error code: " + result.getResult());
            }
        }
        return ret;
    }

    // execute Logout
    public boolean Logout() {

        boolean ret = false;

        if (port != null) {
            AbxLoginResult result = port.logout(this.sessionIDF);
            if (result.getResult() != Logout_OK) {
                System.err.println("Logout KO, error code: " + result.getResult());
            } else {
                ret = true;
            }
        }
        return ret;
    }
}
