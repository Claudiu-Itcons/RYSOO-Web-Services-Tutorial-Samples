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
package rysoo.samples;

import abx.ws.AbxLoginIdentity;
import base.baseOp;

/**
 *
 * @author dev
 */
public class sample1 {

    public static void run() {

        base.baseOp util = new baseOp();

        // try to connect on remote server via webservices
        if (util.Connect("http://iabx000002.iabx.net")) {
            
            AbxLoginIdentity login = new AbxLoginIdentity();

            // login parameters
            login.setArchiboxIP("iabx000002.iabx.net");
            login.setDomain("IABX000002");
            login.setSourceID(9999);
            login.setUsername("test");
            login.setLanguageID("english");
            login.setPassword("test");
            login.setPassphrase("password");
            login.setUsernameLogin(true);

            // execute Login
            if (util.Login(login)) {
                System.out.println("Login OK session: " + util.getSessionIDF().getSessionID());
                
                // wait 1 sec
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                }
                // execute Logout
                if (util.Logout()){
                    System.out.println("Logout OK session: " + util.getSessionIDF().getSessionID());
                }
            }
        }
    }
}
