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

#include "sample1.h"
#include "base.h"

sample1::sample1() {
}

sample1::sample1(const sample1& orig) {
}

sample1::~sample1() {
}

void sample1::run() {
    base *util = new base();

    // try to connect on remote server via webservices
    if (util->Connect("http://iabx000002.iabx.net")) {
        
        ns1__abxLoginIdentity *login = new ns1__abxLoginIdentity();

        // login parameters
        login->archiboxIP = (char*)"iabx000002.iabx.net";
        login->domain = (char*)"IABX000002";
        login->sourceID = 9999;
        login->username = (char*)"test";
        login->languageID = (char*)"english";
        login->password = (char*)"test";
        login->passphrase = (char*)"password";
        login->usernameLogin = true;
        
        // execute Login
        if (util->Login(login)){
            
            string session = util->getSessionIDF()->SessionID;
            cout << "Login OK session: " + session << endl;
            
            // wait 1 sec
            sleep(1);
            
            // execute Logout
            if (util->Logout()){
                cout << "Logout OK session: " + session << endl;
            }
        }
    }
}
