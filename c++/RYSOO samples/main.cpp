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

#include <cstdlib>
#include <iostream>
#include "sample1.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {


    
//    
//    string url = "http://iabx000002.iabx.net/abxWsGestService/abxWsGest";
//    abxWsGestPortBindingProxy port(url.c_str());
//    
//    ns1__Ping in;
//    in.In = (char*)"ciao";
//    
//    ns1__PingResponse out;
//    
//    int ret = port.Ping(&in,&out);
//    
//    string r;
//    r.assign(out.return_->value);
//    
//    cout << r << endl;
//    
//    ns1__abxLoginIdentity login_param;
//    login_param.archiboxIP = (char*)"iabx000002.iabx.net";
//    login_param.domain = (char*)"IABX000002";
//    login_param.sourceID = 9999;
//    login_param.username = (char*)"test";
//    login_param.languageID = (char*)"english";
//    login_param.password = (char*)"test";
//    login_param.passphrase = (char*)"password";
//    
//    ns1__Login login;
//    login.LoginParam = &login_param;
//    
//    ns1__LoginResponse response;
//    
//    cout << "pre login call" << endl;
//    ret = port.Login(&login,&response);    
//    cout << "post login call" << endl;
//    
//    
//    cout << response.return_->sessionIDF->SessionID << endl;
    
    sample1 *example = new sample1();
    
    example->run();
    
    return 0;

}

