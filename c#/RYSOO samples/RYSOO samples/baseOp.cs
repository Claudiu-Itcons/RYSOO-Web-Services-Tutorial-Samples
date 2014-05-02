
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
using System.IO;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;

namespace RYSOO_samples
{
    class baseOp
    {
        public static int Login_OK_LOGIN = 0x00000001;
        public static int Logout_OK = 0x00000010;
        public static int Ping_OK = 0x00022000;
        public static int WsdlVersion_OK = 0x00042020;

        public static String wsdlversion_WARNING = "0000000002";    // this value must be equal to value returned from webservices when you compile program
        public static String wsdlversion_ERROR = "0000000001";      // this value must be equal to value returned from webservices when you compile program
        
        // sessionIDF contain data to identify active user session
        private abxws.IDtype _sessionIDF = null;

        // port is used to talk with server
        private abxws.abxWsGest port = null;

        public abxws.IDtype SessionIDF
        {
            // get value
            get { return this._sessionIDF; }
        }

        private abxws.abxWsGestClient InitWebService(String srvEndPoint)
        {
            abxws.abxWsGestClient service=null;

            BasicHttpBinding binding = new BasicHttpBinding();

            // In case of deserealization errors we will need to adjust those values 
            binding.ReaderQuotas.MaxArrayLength = 163840;
            binding.ReaderQuotas.MaxBytesPerRead = 4096;
            binding.ReaderQuotas.MaxDepth = 32;
            binding.ReaderQuotas.MaxStringContentLength = 81920;
            binding.ReaderQuotas.MaxArrayLength = 163840;
            binding.ReaderQuotas.MaxNameTableCharCount = 163840;
            binding.MaxReceivedMessageSize = 65536;
            binding.MaxBufferSize = 65536;
            binding.MaxBufferPoolSize = 524288;
            binding.TransferMode = TransferMode.Buffered;
            binding.UseDefaultWebProxy = false;
            binding.BypassProxyOnLocal = false;
            //binding.ProxyAddress = null;


            // (see http://msdn.microsoft.com/it-it/library/system.net.servicepointmanager.expect100continue(v=vs.110).aspx )
            System.Net.ServicePointManager.Expect100Continue = false;

            EndpointAddress endpoint = new EndpointAddress(new Uri(srvEndPoint + "/abxWsGestService/abxWsGest?wsdl"));

            service = new abxws.abxWsGestClient(binding, endpoint);

            return service;
        }

        // try to connect on remote server via webservices
        public bool Connect(String srvEndPoint)
        {
            bool ret = true;
            
            this.port = InitWebService(srvEndPoint);

            try
            {
                if (this.port != null)
                {
                    // dummy string used to verify connection
                    String testString = "dummy string";

                    // do ping to server
                    abxws.PingRequest request = new abxws.PingRequest();
                    request.In = testString;
                    abxws.PingResponse1 response = this.port.Ping(request);
                    if (response.@return.result != Ping_OK)
                    {
                        // ping is not ok
                        ret = false;
                    }
                    else
                    {
                        if (response.@return.value == testString)
                        {
                            // check if wsdl is changed
                            abxws.GetWsdlVersionRequest wsdlreq = new abxws.GetWsdlVersionRequest();
                            abxws.GetWsdlVersionResponse1 wsdlresponse = this.port.GetWsdlVersion(wsdlreq);
                            if (wsdlresponse.@return.result != WsdlVersion_OK)
                            {
                                // response ko
                                ret = false;
                            }
                            else
                            {
                                if (wsdlresponse.@return.ERRORvalue != wsdlversion_ERROR)
                                {
                                    // wsdl is critical different 
                                    TextWriter stdErr = Console.Error;
                                    stdErr.WriteLine("Wsdl is critical different: stop program");
                                    ret = false;
                                }
                                else
                                {
                                    if (wsdlresponse.@return.WARNINGvalue != wsdlversion_WARNING)
                                    {
                                        // wsdl is warning different 
                                        TextWriter stdErr = Console.Error;
                                        stdErr.WriteLine("Wsdl is warning different: program can continue");
                                    }
                                }
                            }
                        }
                        else
                        {
                            // strings are not equal
                            ret = false;
                        }
                    }
                }
            }
            catch (Exception e)
            {
                // error establishing connection with server
                ret = false;
            }
            if (!ret)
            {
                TextWriter stdErr = Console.Error;
                stdErr.WriteLine("Connect KO to server: " + srvEndPoint);
            }
            return ret;
        }

        // execute Login
        public bool Login(abxws.abxLoginIdentity login)
        {

            bool ret = false;

            if (this.port != null)
            {
                abxws.LoginRequest req = new abxws.LoginRequest();
                req.LoginParam = login;
                abxws.LoginResponse1 response = this.port.Login(req); 
                
                if (response.@return.result == Login_OK_LOGIN)
                {
                    this._sessionIDF = response.@return.sessionIDF;
                    ret = true;
                }
                else
                {
                    TextWriter stdErr = Console.Error;
                    stdErr.WriteLine("Login KO, error code: " + response.@return.result);
                }
            }
            return ret;
        }

        // execute Logout
        public bool Logout()
        {
            bool ret = false;

            if (this.port != null)
            {
                abxws.LogoutRequest req = new abxws.LogoutRequest();
                req.SessionId = this._sessionIDF;
                abxws.LogoutResponse1 response = this.port.Logout(req);
                if (response.@return.result != Logout_OK)
                {
                    TextWriter stdErr = Console.Error;
                    stdErr.WriteLine("Logout KO, error code: " + response.@return.result);
                }
                else
                {
                    ret = true;
                }
            }
            return ret;
        }
    }
}
