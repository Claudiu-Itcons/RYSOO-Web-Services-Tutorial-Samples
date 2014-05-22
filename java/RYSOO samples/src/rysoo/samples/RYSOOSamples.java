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

import abx.ws.AbxField;
import base.baseOp;
import java.util.List;

/**
 *
 * @author dev
 */
public class RYSOOSamples {



    public static final boolean onlySampleOne = false;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (onlySampleOne) {
            // execute only sample1
            sample1.run();
        } else {
            baseOp util = new baseOp();

            // in sample2 we create an archive
            String archiveName = sample2.run(util);

            if (archiveName != null) {
                
                int bindersQty = 10;
                int documentsQty = 10;
                
                // in sample3 we create a list of text fields
                AbxField textfield = sample3.run(util);
                if (textfield != null) {

                    // in sample4 we create a list of int fields
                    AbxField intfield = sample4.run(util);
                    if (intfield != null) {

                        // in sample5 we create a list of date fields
                        AbxField datefield = sample5.run(util);
                        if (datefield != null) {
                            
                            // in sample sample6 we create a list of binders
                            List<String> bindersName = sample6.run(util, archiveName, textfield, intfield, datefield, bindersQty);
                            if (bindersName != null){
                                
                                // in sample7 we create a list of documents in each binders
                                docsInbinders binders = sample7.run(util, bindersName, textfield, intfield, datefield, documentsQty);
                                
                                if (!binders.getDocs().isEmpty()){
                                    
                                    // in sample 8 we upload e download a file for each document
                                    if (sample8.run(util, binders, "e:\\", "prova.rar")){
                                        
                                        // in sample 9 we download a file
                                        if (sample9.run(util, binders, "e:\\")){
                                            System.out.println("All files downloaded");
                                        }
                                    }
                                }                   
                            }
                        }
                    }
                }
            }
            // execute Logout
            if (util.Logout()) {
                System.out.println("Logout OK session: " + util.getSessionIDF().getSessionID());
            }
        }
    }
}
