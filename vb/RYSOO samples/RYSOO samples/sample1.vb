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


Imports System.Threading


Public Class sample1
    Public Function run()
        Dim util As baseOp = New baseOp

        ' try to connect on remote server via webservices
        If util.Connect("http://iabx000002.iabx.net") Then
            Dim login As abxws.abxLoginIdentity = New abxws.abxLoginIdentity

            ' login parameters
            login.archiboxIP = "iabx000002.iabx.net"
            login.domain = "IABX000002"
            login.sourceID = 9999
            login.username = "test"
            login.languageID = "english"
            login.password = "test"
            login.passphrase = "password"
            login.usernameLogin = True

            ' execute login
            If util.Login(login) Then
                Console.WriteLine("Login OK session: " + util.SessionIDF.SessionID)

                ' wait 1 sec
                Thread.Sleep(1000)

                ' execute logout
                If util.Logout() Then
                    Console.WriteLine("Logout OK session: " + util.SessionIDF.SessionID)
                End If
            End If
        End If
        Return Nothing

    End Function
End Class
