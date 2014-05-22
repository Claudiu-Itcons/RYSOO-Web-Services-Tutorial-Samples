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
import abx.ws.AbxField;
import abx.ws.AbxTemplate;
import base.baseOp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dev
 */
public class sample6 {

    public static List<String> run(baseOp util, String archiveName, AbxField textfield, AbxField intfield, AbxField datefield, int bindersQty) {

        List<String> ret = new ArrayList<>();

        List<AbxField> fields = new ArrayList<>();
        fields.add(textfield);
        fields.add(intfield);
        fields.add(datefield);
        for (int i = 0; i < bindersQty; i++) {
            String tmp = createBinder(util, archiveName, fields);
            if (tmp != null) {
                ret.add(tmp);
            }
        }

        return ret;
    }

    public static String createBinder(baseOp util, String archiveName, List<AbxField> fields) {

        // now we create a new binder
        // we generate random number to have unique binder name
        String binderName = "binder" + util.getRandomString();

        // we create description list
        List<AbxContainer.AllDescription> descriptions = new ArrayList<>();

        // description in italian 
        AbxContainer.AllDescription d1 = new AbxContainer.AllDescription();
        d1.setLanguage(baseOp.languageItaliano);
        d1.setDescription("Raccoglitore di prova: " + binderName);
        descriptions.add(d1);

        // description in english
        AbxContainer.AllDescription d2 = new AbxContainer.AllDescription();
        d2.setLanguage(baseOp.languageEnglish);
        d2.setDescription("Test binder: " + binderName);
        descriptions.add(d2);

        // archive creation
        if (util.CreateBinder(binderName, archiveName, fields, descriptions, baseOp.languageEnglish)) {
            System.out.println("Create Binder OK : " + binderName);
        } else {
            binderName = null;
        }
        return binderName;
    }
}
