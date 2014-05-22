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

import base.baseOp;
import java.util.Iterator;

/**
 *
 * @author dev
 */
public class sample8 {

    public static boolean run(baseOp util, docsInbinders binders, String uploadPath, String filename) {
        
        boolean ok = true;
        
        if (binders != null) {
            Iterator<docsList> it = binders.getDocs().iterator();
            while (it.hasNext()) {
                // for each binder
                docsList binder = it.next();
                if (binder.getDocsID() != null){
                    Iterator<String> its = binder.getDocsID().iterator();
                    while (its.hasNext()){
                        // for each document upload file
                        String docID = its.next();
                        if (!util.attachFile(uploadPath, filename, binder.getBinderName(), docID)){
                            // error
                            ok = false;
                            break;
                        }else{
                            System.out.println("File: " + filename + " uploaded OK in: " + binder.getBinderName() + ":" + docID);
                        }
                    }
                }
            }
        }
        return ok;
    }
}
