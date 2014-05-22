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

import abx.ws.AbxContainer;
import abx.ws.AbxLoginIdentity;
import base.baseOp;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author dev
 */
public class sample2 {

    public static String run(baseOp util) {

        String archiveName = null;

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

                // now we create a new archive
                // we generate random number to have unique archive name
                archiveName = "ArchTest1" + util.getRandomString();

                // we create description list
                List<AbxContainer.AllDescription> descriptions = new ArrayList<>();

                // description in italian 
                AbxContainer.AllDescription d1 = new AbxContainer.AllDescription();
                d1.setLanguage(baseOp.languageItaliano);
                d1.setDescription("Archivio di test: " + archiveName);
                descriptions.add(d1);

                // description in english
                AbxContainer.AllDescription d2 = new AbxContainer.AllDescription();
                d2.setLanguage(baseOp.languageEnglish);
                d2.setDescription("Test archive: " + archiveName);
                descriptions.add(d2);

                // archive creation
                if (util.CreateArchive(archiveName, descriptions, baseOp.languageEnglish)) {
                    System.out.println("Create Archive OK : " + archiveName);
                } else // CreateArchive has failed
                {
                    archiveName = null;
                }
            }
        }
        return archiveName;
    }
}
