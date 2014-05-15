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
import base.baseOp;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dev
 */
public class sample3 {

    public static List<AbxField> run(baseOp util) {

        List<AbxField> ret = new ArrayList<>();
            AbxField tmp = createOnTextField(util);
            if (tmp != null){
                ret.add(tmp);
            }
        return ret;
    }

    public static AbxField createOnTextField(baseOp util) {

        // now we create a new text field
        // we generate random number to have unique field name
        String fieldName = "textfield" + util.getRandomString();

        // we create description list
        List<AbxField.AllDescription> descriptions = new ArrayList<>();

        // description in italian 
        AbxField.AllDescription d1 = new AbxField.AllDescription();
        d1.setLanguage(baseOp.languageItaliano);
        d1.setDescription("Campo di testo di prova: " + fieldName);
        descriptions.add(d1);

        // description in english
        AbxField.AllDescription d2 = new AbxField.AllDescription();
        d2.setLanguage(baseOp.languageEnglish);
        d2.setDescription("Text test field: " + fieldName);
        descriptions.add(d2);

        // archive creation
        AbxField ret = util.CreateTextField(fieldName, "20", descriptions, baseOp.languageEnglish);
        if (ret != null) {
            System.out.println("Create Text Field OK : " + fieldName);
        } 
        return ret;
    }
}
