'
' Copyright (C) 2014 Daniele Vottero http://daniele.vottero.eu/me   
'
' This library is free software; you can redistribute it and/or
' modify it under the terms of the GNU Lesser General Public
' License as published by the Free Software Foundation; either
' version 2.1 of the License, or (at your option) any later version.
'
' This library is distributed in the hope that it will be useful,
' but WITHOUT ANY WARRANTY; without even the implied warranty of
' MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
' Lesser General Public License for more details.
'
' You should have received a copy of the GNU Lesser General Public
' License along with this library; if not, write to the Free Software
' Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
' MA 02110-1301  USA
'


Imports System.ServiceModel
Imports System.IO

Public Class baseOp
    Public Const Login_OK_LOGIN As Integer = &H1
    Public Const Logout_OK As Integer = &H10
    Public Const Ping_OK As Integer = &H22000
    Public Const WsdlVersion_OK As Integer = &H42020

    Public Const wsdlversion_WARNING As String = "0000000002" ' this value must be equal to value returned from webservices when you compile program
    Public Const wsdlversion_ERROR As String = "0000000001" ' this value must be equal to value returned from webservices when you compile program

    ' sessionIDF contain data to identify active user session
    Private _sessionIDF As abxws.IDtype = Nothing

    ' port is used to talk with server
    Private port As abxws.abxWsGest = Nothing

    Public Property SessionIDF As abxws.IDtype
        Get
            Return _sessionIDF
        End Get
        Set(value As abxws.IDtype)

        End Set
    End Property

    Private Function InitWebService(srvEndPoint As String) As abxws.abxWsGestClient
        Dim service As abxws.abxWsGestClient = Nothing
        Dim binding As BasicHttpBinding = New BasicHttpBinding()

        ' In case of deserealization errors we will need to adjust those values 
        binding.ReaderQuotas.MaxArrayLength = 163840
        binding.ReaderQuotas.MaxBytesPerRead = 4096
        binding.ReaderQuotas.MaxDepth = 32
        binding.ReaderQuotas.MaxStringContentLength = 81920
        binding.ReaderQuotas.MaxArrayLength = 163840
        binding.ReaderQuotas.MaxNameTableCharCount = 163840
        binding.MaxReceivedMessageSize = 65536
        binding.MaxBufferSize = 65536
        binding.MaxBufferPoolSize = 524288
        binding.TransferMode = TransferMode.Buffered
        binding.UseDefaultWebProxy = False
        binding.BypassProxyOnLocal = False
        ' binding.ProxyAddress = null

        ' (see http://msdn.microsoft.com/it-it/library/system.net.servicepointmanager.expect100continue(v=vs.110).aspx )
        System.Net.ServicePointManager.Expect100Continue = False

        Dim endpoint As EndpointAddress = New EndpointAddress(New Uri(srvEndPoint + "/abxWsGestService/abxWsGest?wsdl"))

        service = New abxws.abxWsGestClient(binding, endpoint)

        Return service
    End Function

    ' try to connect on remote server via webservices
    Public Function Connect(srvEndPoint As String) As Boolean

        Dim ret As Boolean = True

        Me.port = InitWebService(srvEndPoint)

        Try
            If Me.port IsNot Nothing Then

                ' dummy string used to verify connection
                Dim testString As String = "dummy string"

                ' do ping to server
                Dim request As abxws.PingRequest = New abxws.PingRequest()
                request.In = testString
                Dim response As abxws.PingResponse1 = Me.port.Ping(request)
                If response.return.result <> Ping_OK Then
                    ' ping is not ok
                    ret = False
                ElseIf response.return.value = testString Then
                    ' check if wsdl is changed
                    Dim wsdlreq As abxws.GetWsdlVersionRequest = New abxws.GetWsdlVersionRequest()
                    Dim wsdlresponse As abxws.GetWsdlVersionResponse1 = Me.port.GetWsdlVersion(wsdlreq)
                    If (wsdlresponse.return.result <> WsdlVersion_OK) Then
                        ' response ko
                        ret = False
                    Else
                        If wsdlresponse.return.ERRORvalue <> wsdlversion_ERROR Then
                            ' wsdl is critical different 
                            Dim stdErr As TextWriter = Console.Error
                            stdErr.WriteLine("Wsdl is critical different: stop program")
                            ret = False
                        ElseIf wsdlresponse.return.WARNINGvalue <> wsdlversion_WARNING Then
                            ' wsdl is warning different 
                            Dim stdErr As TextWriter = Console.Error
                            stdErr.WriteLine("Wsdl is warning different: program can continue")
                        End If
                    End If
                Else
                    ' strings are not equal
                    ret = False
                End If
            End If
        Catch
            ' error establishing connection with server
            ret = False
        End Try

        If Not ret Then
            Dim stdErr As TextWriter = Console.Error
            stdErr.WriteLine("Connect KO to server: " + srvEndPoint)
        End If

        Return ret
    End Function

    ' execute login
    Public Function Login(loginparam As abxws.abxLoginIdentity) As Boolean

        Dim ret As Boolean = False

        If Me.port IsNot Nothing Then
            Dim req As abxws.LoginRequest = New abxws.LoginRequest()
            req.LoginParam = loginparam
            Dim response As abxws.LoginResponse1 = Me.port.Login(req)

            If response.return.result = Login_OK_LOGIN Then
                Me._sessionIDF = response.return.sessionIDF
                ret = True
            Else
                Dim stdErr As TextWriter = Console.Error
                stdErr.WriteLine("Login KO, error code: " + response.return.result)
            End If
        End If

        Return ret
    End Function

    ' execute Logout
    Public Function Logout() As Boolean

        Dim ret As Boolean = False

        If Me.port IsNot Nothing Then
            Dim req As abxws.LogoutRequest = New abxws.LogoutRequest()
            req.SessionId = Me._sessionIDF
            Dim response As abxws.LogoutResponse1 = Me.port.Logout(req)

            If response.return.result <> Logout_OK Then
                Dim stdErr As TextWriter = Console.Error
                stdErr.WriteLine("Logout KO, error code: " + response.return.result)
            Else
                ret = True
            End If
        End If

        Return ret
    End Function
End Class

