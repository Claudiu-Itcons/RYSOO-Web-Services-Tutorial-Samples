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

import abx.ws.AbxFile;
import base.baseOp;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dev
 */
public class sample9 {

    public static boolean run(baseOp util, docsInbinders binders, String downloadPath) {
        boolean ok = true;

        if (binders != null) {
            Iterator<docsList> it = binders.getDocs().iterator();
            while (it.hasNext()) {
                // for each binder
                docsList binder = it.next();
                if (binder.getDocsID() != null) {
                    Iterator<String> its = binder.getDocsID().iterator();
                    while (its.hasNext()) {
                        // for each document download files
                        String docID = its.next();
                        // get list of files for the document
                        List<AbxFile> files = util.filesInDocument(binder.getBinderName(), docID);
                        if (files != null) {
                            // loop on files list
                            Iterator<AbxFile> itf = files.iterator();
                            while (itf.hasNext()) {
                                AbxFile tmp = itf.next();
                                if (util.downloadFile(downloadPath, binder.getBinderName(), tmp.getFileUniqueCode())){
                                    System.out.println("File: " + tmp.getFilename() + " in " + binder.getBinderName() + " : " + docID + " downloaded OK");
                                }
                                else{
                                    // error
                                    ok = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return ok;
    }
}
