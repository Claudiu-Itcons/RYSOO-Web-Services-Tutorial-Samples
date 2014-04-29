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


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Threading;

namespace RYSOO_samples
{
    class sample1
    {
        public static void run()
        {
            baseOp util = new baseOp();
            
            // try to connect on remote server via webservices
            if (util.Connect("http://iabx000002.iabx.net")) {
                abxws.abxLoginIdentity login = new abxws.abxLoginIdentity();

                // login parameters
                login.archiboxIP = "iabx000002.iabx.net";
                login.domain = "IABX000002";
                login.sourceID = 9999;
                login.username = "test";
                login.languageID = "english";
                login.password = "test";
                login.passphrase = "password";
                login.usernameLogin = true;

                // execute Login
                if (util.Login(login)) {
                    Console.WriteLine("Login OK session: " + util.SessionIDF.SessionID);

                    // wait 1 sec
                    Thread.Sleep(1000);
                    
                    // execute Logout
                    if (util.Logout()){
                        Console.WriteLine("Logout OK session: " + util.SessionIDF.SessionID);
                    }
                }    
            }
        }
    }
}
