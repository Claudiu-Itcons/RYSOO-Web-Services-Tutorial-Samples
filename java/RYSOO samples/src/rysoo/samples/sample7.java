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

import abx.ws.AbxData;
import abx.ws.AbxDataList;
import abx.ws.AbxField;
import base.baseOp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 *
 * @author dev
 */
public class sample7 {

    private static String getRandomString() {
        Random r = new Random();
        return Long.toString(r.nextLong(), 36);
    }

    private static String getRandomInt() {
        Random r = new Random();
        return Long.toString((int) r.nextLong());
    }

    private static String getRandomText() {
        return "txt " + getRandomString();
    }

    private static String getRandomDate() {
        Random rnd;
        Date dt;
        long ms;

        // Get a new random instance, seeded from the clock
        rnd = new Random();

        // Get an Epoch value roughly between 1940 and 2010
        // -946771200000L = January 1, 1940
        // Add up to 70 years to it (using modulus on the next long)
        ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(new Date(ms));
    }

    public static docsInbinders run(baseOp util, List<String> binderName, AbxField textFieldName, AbxField intFieldName, AbxField dateFieldName, int documentsQty) {

        docsInbinders ret = new docsInbinders();

        Iterator<String> binderIt = binderName.iterator();
        while (binderIt.hasNext()) {
            String binder = binderIt.next();
            //docsInbinders.docsList el = new docsInbinders.docsList();
            docsList el = new docsList();
            el.setBinderName(binder);

            // for each binder
            for (int i = 0; i < documentsQty; i++) {
                // in this example we insert one document at a time because we have http://ra8.iabx.net:8080/browse/ABX-147
                // documents
                AbxDataList documents = new AbxDataList();
                // we create documentsQty documents
                // documents
                AbxData doc = new AbxData();
                // we set value for each field
                AbxData.Data f1 = new AbxData.Data();
                f1.setField(textFieldName.getName());
                f1.setValue(getRandomText());
                doc.getData().add(f1);
                AbxData.Data f2 = new AbxData.Data();
                f2.setField(intFieldName.getName());
                f2.setValue(getRandomInt());
                doc.getData().add(f2);
                AbxData.Data f3 = new AbxData.Data();
                f3.setField(dateFieldName.getName());
                f3.setValue(getRandomDate());
                doc.getData().add(f3);

                documents.getDataList().add(doc);
                String docId = util.CreateDocument(binder, documents);
                if (docId != null) {
                    System.out.println("Create Document id: " + docId + " OK");
                    el.getDocsID().add(docId);
                } else {
                    break;
                }
            }
            ret.getDocs().add(el);
        }
        return ret;
    }
}
