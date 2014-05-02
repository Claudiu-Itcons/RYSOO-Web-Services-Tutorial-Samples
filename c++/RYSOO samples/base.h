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

#ifndef BASE_H
#define	BASE_H
#include "soapabxWsGestPortBindingProxy.h"
using namespace std;

    const int Login_OK_LOGIN = 0x00000001;
    const int Logout_OK = 0x00000010;
    const int Ping_OK = 0x00022000;
    const int WsdlVersion_OK = 0x00042020;

    const string wsdlversion_WARNING = "0000000002";    // this value must be equal to value returned from webservices when you compile program
    const string wsdlversion_ERROR = "0000000001";      // this value must be equal to value returned from webservices when you compile program

class base {
private:
     // sessionIDF contain data to identify active user session
    ns1__IDtype *sessionIDF = NULL;
       
    // endPointURL used to talk with server
    string endPointURL;
    
public:

    base();
    base(const base& orig);
    virtual ~base();
    ns1__IDtype *getSessionIDF();
    bool Connect(string srvEndPoint);
    bool Login (ns1__abxLoginIdentity *login);
    bool Logout();
private:

};

#endif	/* BASE_H */

