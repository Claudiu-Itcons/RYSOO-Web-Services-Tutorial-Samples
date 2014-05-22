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
package base;

import abx.ws.AbxContainer;
import abx.ws.AbxContainerResult;
import abx.ws.AbxDataList;
import abx.ws.AbxDataResult;
import abx.ws.AbxField;
import abx.ws.AbxFieldList;
import abx.ws.AbxFieldResult;
import abx.ws.AbxFile;
import abx.ws.AbxFileList;
import abx.ws.AbxFileResult;
import abx.ws.AbxLoginIdentity;
import abx.ws.AbxLoginResult;
import abx.ws.AbxPingResult;
import abx.ws.AbxRaccoglitoreResult;
import abx.ws.AbxTemplate;
import abx.ws.AbxTranslation;
import abx.ws.AbxTranslationList;
import abx.ws.AbxWsGest;
import abx.ws.AbxWsGestService;
import abx.ws.AbxWsdlResult;
import abx.ws.DownloadData;
import abx.ws.IDtype;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

/**
 *
 * @author dev
 */
public class baseOp {

    public static final String wsdlversion_WARNING = "0000000002";    // this value must be equal to value returned from webservices when you compile program
    public static final String wsdlversion_ERROR = "0000000001";      // this value must be equal to value returned from webservices when you compile program
    public static final String objArchivio = "archivio";
    public static final String objRaccoglitore = "raccoglitore";
    public static final String objAllegato = "allegato";
    public static final String archiveContainerObjName = "contenitore_archivi";
    public static final String folderContainerObjName = "contenitore dei fascicoli";
    public static final String folderContainerObjNamePrefix = "_contenitore dei fascicoli_";
    public static final String defaultSecurity = "7";
    public static final String containerColor = "1";
    public static final String languageItaliano = "italiano";
    public static final String languageEnglish = "english";
    public static final String fieldType_sTesto = "testo";
    public static final String fieldType_sNumericoMedium = "numericomedium";                // MediumInt: The signed range is –8388608 to 8388607
    public static final String fieldType_sNumericoBig = "numericobig";                      // BigInt: The signed range is –9223372036854775808 to 9223372036854775807
    public static final String fieldType_sVirgolaMobileDecimal = "virgolamobiledecimal";    // Decimal (l,d): The maximum range of DECIMAL values is the same as for DOUBLE, but the actual range for a given DECIMAL column may be constrained by the choice of Length and Decimals
    public static final String fieldType_sVirgolaMobileDouble = "virgolamobiledouble";      // Double: Ranges are -1.7976931348623157E+308 to -2.2250738585072014E-308
    public static final String fieldType_sDatetime = "datetime";                            // DateTime: The supported range is ‘1000-01-01 00:00:00’ to ‘9999-12-31 23:59:59’
    public static final String fieldType_sBit = "bit";                                      // Boolean: 
    public static final String templateJoinWithType = "container";
    public static final String templateCollation = "utf8_general_ci";
    public static final String templateobjDocumento = "documento";
    public static final long dataRevisionNotused = 0L;

    // sessionIDF contain data to identify active user session
    private IDtype sessionIDF = null;

    // port is used to talk with server
    private AbxWsGest port = null;

    public IDtype getSessionIDF() {
        return sessionIDF;
    }

    public String getRandomString() {
        Random r = new Random();
        return Long.toString(r.nextLong(), 36);
    }

    public String getRandomInt() {
        Random r = new Random();
        return Long.toString((int) r.nextLong());
    }

    // try to connect on remote server via webservices
    public boolean Connect(String srvEndPoint) {
        boolean ret = true;

        AbxWsGestService ws = new AbxWsGestService();
        port = ws.getAbxWsGestPort();
        BindingProvider bp = (BindingProvider) port;
        try {
            bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, srvEndPoint + "/abxWsGestService/abxWsGest");

            if (port != null) {
                // dummy string used to verify connection
                String testString = "dummy string";

                // do ping to server
                AbxPingResult result = port.ping(testString);
                if (result.getResult() != abxMessages.Ping_OK) {
                    // ping is not ok
                    ret = false;
                } else {
                    if (result.getValue().compareTo(testString) == 0) {
                        // check if wsdl is changed
                        AbxWsdlResult wsdlresponse = port.getWsdlVersion();
                        if (wsdlresponse.getResult() != abxMessages.WsdlVersion_OK) {
                            // response ko
                            ret = false;
                        } else {
                            if (wsdlresponse.getERRORvalue().compareTo(wsdlversion_ERROR) != 0) {
                                // wsdl is critical different 
                                System.err.println("Wsdl is critical different: stop program");
                                ret = false;
                            } else {
                                if (wsdlresponse.getWARNINGvalue().compareTo(wsdlversion_WARNING) != 0) {
                                    // wsdl is warning different
                                    System.err.println("Wsdl is warning different: program can continue");
                                }
                            }
                        }
                    } else {
                        // strings are not equal
                        ret = false;
                    }
                }
            }
        } catch (Exception e) {
            // error establishing connection with server
            ret = false;
        }
        if (!ret) {
            System.err.println("Connect KO to server: " + srvEndPoint);
        }
        return ret;
    }

    // execute Login
    public boolean Login(AbxLoginIdentity login) {

        boolean ret = false;

        if (port != null) {
            AbxLoginResult result = port.login(login);
            if (result.getResult() == abxMessages.Login_OK_LOGIN) {
                this.sessionIDF = result.getSessionIDF();
                ret = true;
            } else {
                System.err.println("Login KO, error code: " + result.getResult());
            }
        }
        return ret;
    }

    // execute Logout
    public boolean Logout() {

        boolean ret = false;

        if (port != null) {
            AbxLoginResult result = port.logout(this.sessionIDF);
            if (result.getResult() != abxMessages.Logout_OK) {
                System.err.println("Logout KO, error code: " + result.getResult());
            } else {
                ret = true;
            }
        }
        return ret;
    }

    // execute create Archive
    public boolean CreateArchive(String archiveName, List<AbxContainer.AllDescription> descriptions, String defaultLanguage) {

        boolean ret = false;

        AbxContainer newcont = new AbxContainer();
        newcont.setName(archiveName);
        newcont.setObjName(objArchivio);
        newcont.setParentContainerName(archiveContainerObjName);
        newcont.setRevisionEnabled(false);
        newcont.setTemplateName("");
        newcont.setColorDisplay(containerColor);
        newcont.setFileAutoOverwrite(false);
        newcont.setHideContainer(false);

        // copy all descriptions
        Iterator<AbxContainer.AllDescription> it1 = descriptions.iterator();
        while (it1.hasNext()) {
            newcont.getAllDescription().add(it1.next());
        }

        // set default language
        newcont.setDefaultLanguage(defaultLanguage);

        // create archive container
        AbxContainerResult res1 = port.createContainer(this.sessionIDF, newcont, defaultSecurity, null);
        if (res1.getResult() == abxMessages.CreateContainer_OK) {

            AbxContainer newcontfolder = new AbxContainer();
            newcontfolder.setName(folderContainerObjNamePrefix + archiveName);
            newcontfolder.setObjName(folderContainerObjName);
            newcontfolder.setParentContainerName(newcont.getName());
            newcontfolder.setRevisionEnabled(false);
            newcontfolder.setTemplateName("");

            // copy all descriptions
            Iterator<AbxContainer.AllDescription> it2 = descriptions.iterator();
            while (it2.hasNext()) {
                AbxContainer.AllDescription descr = it2.next();
                descr.setDescription(descr.getDescription() + " : " + newcontfolder.getName());
                newcontfolder.getAllDescription().add(descr);
            }

            // set default language
            newcontfolder.setDefaultLanguage(defaultLanguage);
            newcontfolder.setColorDisplay(containerColor);
            newcontfolder.setFileAutoOverwrite(false);
            newcontfolder.setHideContainer(false);

            // create new container that will contain folders
            AbxContainerResult res2 = port.createContainer(this.sessionIDF, newcontfolder, defaultSecurity, null);
            if (res2.getResult() == abxMessages.CreateContainer_OK) {
                ret = true;
            } else {
                // delete archive created before
                AbxContainerResult res = port.deleteContainer(this.sessionIDF, archiveName);
                if (res.getResult() == abxMessages.DeleteContainer_OK) {
                    ret = true;
                }
            }
        }
        return ret;
    }

    // create a text field
    public AbxField CreateTextField(String fieldName, String lenght, List<AbxField.AllDescription> descriptions, String defaultLanguage) {

        AbxField ret = null;

        AbxField field = new AbxField();
        field.setName(fieldName);
        field.setLenght(lenght);
        field.setType(fieldType_sTesto);
        field.setFilter(true);
        field.setFilterinterval(true);
        field.setDefaultLanguage(defaultLanguage);
        Iterator<AbxField.AllDescription> it = descriptions.iterator();
        while (it.hasNext()) {
            field.getAllDescription().add(it.next());
        }

        AbxFieldResult res = port.createField(this.sessionIDF, field, null, null, false, false);
        if (res.getResult() == abxMessages.CreateField_OK) {
            // return field create
            ret = res.getList().getField().get(0);
        }
        return ret;
    }

    // create int field
    public AbxField CreateIntField(String fieldName, List<AbxField.AllDescription> descriptions, String defaultLanguage) {

        AbxField ret = null;

        AbxField field = new AbxField();
        field.setName(fieldName);
        field.setType(fieldType_sNumericoMedium);

        field.setLenght("0"); // questo parametro lo lascio solo per gestione il bugs http://ra8.iabx.net:8080/browse/ABX-146 

        field.setFilter(true);
        field.setFilterinterval(true);
        field.setDefaultLanguage(defaultLanguage);
        Iterator<AbxField.AllDescription> it = descriptions.iterator();
        while (it.hasNext()) {
            field.getAllDescription().add(it.next());
        }

        AbxFieldResult res = port.createField(this.sessionIDF, field, null, null, false, false);
        if (res.getResult() == abxMessages.CreateField_OK) {
            // return field create
            ret = res.getList().getField().get(0);
        }
        return ret;
    }

    // create date field
    public AbxField CreateDateField(String fieldName, List<AbxField.AllDescription> descriptions, String defaultLanguage) {

        AbxField ret = null;

        AbxField field = new AbxField();
        field.setName(fieldName);
        field.setType(fieldType_sDatetime);
        field.setFilter(true);
        field.setFilterinterval(true);
        field.setDefaultLanguage(defaultLanguage);
        Iterator<AbxField.AllDescription> it = descriptions.iterator();
        while (it.hasNext()) {
            field.getAllDescription().add(it.next());
        }

        AbxFieldResult res = port.createField(this.sessionIDF, field, null, null, false, false);
        if (res.getResult() == abxMessages.CreateField_OK) {
            // return field create
            ret = res.getList().getField().get(0);
        }
        return ret;
    }

    // create binder
    public boolean CreateBinder(String BinderName, String archiveName, List<AbxField> fields, List<AbxContainer.AllDescription> descriptions, String defaultLanguage) {

        boolean ret = false;

        // container section        
        AbxContainer container = new AbxContainer();
        container.setName(BinderName);
        container.setObjName(objRaccoglitore);
        container.setParentContainerName(archiveName);
        container.setRevisionEnabled(false);
        container.setTemplateName(BinderName);
        container.setColorDisplay(containerColor);
        container.setFileAutoOverwrite(false);
        container.setHideContainer(false);
        container.setDefaultLanguage(languageEnglish);

        // template section
        AbxTemplate template = new AbxTemplate();
        template.setName(BinderName);
        template.setEnableProtocol(false);
        template.setObjName(templateobjDocumento);
        template.setRevisionEnabled(false);
        template.setDefaultLanguage(defaultLanguage);
        template.setJoinWithType(templateJoinWithType);
        template.setJoinWithName(BinderName);
        template.setDefaultLanguage(languageEnglish);

        AbxFieldList flist = new AbxFieldList();
        Iterator<AbxField> fit = fields.iterator();
        while (fit.hasNext()) {
            flist.getField().add(fit.next());
        }
        template.setFields(flist);

        Iterator<AbxContainer.AllDescription> tit = descriptions.iterator();
        while (tit.hasNext()) {
            AbxContainer.AllDescription tmp1 = tit.next();
            AbxTemplate.AllDescription tmp2 = new AbxTemplate.AllDescription();
            tmp2.setDescription("template: " + tmp1.getDescription());
            tmp2.setLanguage(tmp1.getLanguage());
            // set descriptions for template
            template.getAllDescription().add(tmp2);
            // set descriptions for container
            container.getAllDescription().add(tmp1);
        }

        AbxRaccoglitoreResult res = port.createRaccoglitore(sessionIDF, template, container, null, defaultSecurity, null, null);
        if (res.getResult() == abxMessages.CreateRaccoglitore_OK) {
            ret = true;
        }
        return ret;
    }

    // create document
    public String CreateDocument(String binderName, AbxDataList documents) {

        String ret = null;

        AbxDataResult res = port.insertData(sessionIDF, binderName, dataRevisionNotused, documents, "", null, defaultSecurity, "", null);
        if (res.getResult() == abxMessages.InsertData_INSERTOK) {
            ret = res.getList().getDataList().get(0).getDataId();
        }
        return ret;
    }

    private String getFileHash(File f, String hashType) throws Exception {
        MessageDigest digest = MessageDigest.getInstance(hashType);
        FileInputStream is = new FileInputStream(f);
        byte[] buffer = new byte[100 * 1024];
        int read;
        String ret = "";
        try {
            while ((read = is.read(buffer)) > 0) {
                digest.update(buffer, 0, read);
            }
            byte[] sum = digest.digest();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sum.length; i++) {
                String hex = Integer.toHexString(0xff & sum[i]);
                if (hex.length() == 1) {
                    sb.append('0');
                }
                sb.append(hex);
            }
            ret = sb.toString();
        } catch (IOException e) {
        } finally {
            try {
                is.close();
            } catch (IOException e) {
            }
        }
        return ret;
    }

    // return MD5 of a file
    private String getMD5(String filename) {
        String ret = "";
        try {
            ret = getFileHash(new File(filename), "MD5");
        } catch (Exception ex) {
        }
        return ret;
    }

    // return filesize
    private String getFileSize(String filename) {

        File f = new File(filename);
        Long length = f.length();

        return length.toString();
    }

    // return file lastmodified datetime
    private XMLGregorianCalendar getFileStamp(String filename) {

        File f = new File(filename);
        Calendar ftimestamp = Calendar.getInstance();
        ftimestamp.setTimeInMillis(f.lastModified());

        XMLGregorianCalendar ret = null;
        try {
            ret = DatatypeFactory.newInstance().newXMLGregorianCalendar();
        } catch (DatatypeConfigurationException e) {
        }
        if (ret != null) {
            ret.setYear(ftimestamp.get(Calendar.YEAR));
            ret.setMonth(ftimestamp.get(Calendar.MONTH) + 1);
            ret.setDay(ftimestamp.get(Calendar.DAY_OF_MONTH));
            ret.setTime(ftimestamp.get(Calendar.HOUR_OF_DAY), ftimestamp.get(Calendar.MINUTE), ftimestamp.get(Calendar.SECOND));
        }
        return ret;
    }

    // loop to upload a file
    private boolean uploadFile(int chunkSize, String fileUniqueCode, String completeFilename) {

        boolean ok = true;
        InputStream ifile = null;
        try {
            // open file      
            ifile = Files.newInputStream(Paths.get(completeFilename));

            File file = new File(completeFilename);
            long chunk = 0;
            while (chunk < file.length()) {
                int dim;
                long flen = file.length();
                long remains = flen - chunk;
                if (remains < chunkSize) {
                    dim = (int) remains;
                } else {
                    dim = chunkSize;
                }
                byte[] buffer = new byte[dim];
                chunk += ifile.read(buffer, 0, dim);
                AbxFileResult res = port.uploadSendChunk(sessionIDF, fileUniqueCode, buffer);
                if (res.getResult() != abxMessages.UploadSendChunk_UPLOADSENDCHUNKOK) {
                    // error
                    ok = false;
                    break;
                }
            }
        } catch (IOException e) {
            ok = false;
        } finally {
            try {
                if (ifile != null) {
                    ifile.close();
                }
            } catch (IOException e) {
            }
        }
        return ok;
    }

    // upload file
    public boolean uploadFile(String uploadPath, String fileName, String binderName, String docID) {

        boolean ret = true;

        String completeFilename = uploadPath + "\\" + fileName;

        // file info
        AbxFile abxFile = new AbxFile();
        abxFile.setDataId(docID);
        abxFile.setFilesize(getFileSize(completeFilename));
        abxFile.setFilename(fileName);
        abxFile.setFileUniqueCode("");
        abxFile.setTimestamp(getFileStamp(completeFilename));
        abxFile.setHash(getMD5(completeFilename));

        // list of file to upload
        AbxFileList filesList = new AbxFileList();

        // add file info to the list
        filesList.getDataList().add(abxFile);

        // ask to upload a file
        boolean dacapireacosaserve = false;
        AbxFileResult ask = port.insertFile(sessionIDF, binderName, objAllegato, filesList, dacapireacosaserve);

        if (ask.getResult() == abxMessages.InsertFile_INSERTOK) {
            Iterator<AbxFile> it = ask.getList().getDataList().iterator();
            while (it.hasNext()) {
                AbxFile el = it.next();
                String fileUniqueCode = el.getFileUniqueCode();  // see Unique File ID: http://www.rysoo.com/oggetti-struttura-ddms/ 
                String previousVersionCode = el.getPreviousFileUniqueCode();
                int chunkSize = Integer.decode(el.getUploadData().get(0).getUploadDimChunk());  // file will be uploaded in more chunks of this size
                if (chunkSize <= 0) {
                    // error, you can't upload file
                    ret = false;
                    break;
                }
                if (baseOp.this.uploadFile(chunkSize, fileUniqueCode, completeFilename)) {
                    // file uploaded
                    AbxTranslationList translationsList = new AbxTranslationList();
                    AbxTranslation translations = new AbxTranslation();

                    // italian description
                    AbxTranslation.AllDescription ita = new AbxTranslation.AllDescription();
                    ita.setLanguage("italiano");
                    ita.setDescription("descrizione: " + fileName);
                    translations.getAllDescription().add(ita);

                    // english description
                    AbxTranslation.AllDescription eng = new AbxTranslation.AllDescription();
                    eng.setLanguage("english");
                    eng.setDescription("description: " + fileName);
                    translations.getAllDescription().add(eng);

                    // all descriptions
                    translationsList.getDataList().add(translations);
                    el.setTranslationList(translations);

                    el.setDefaultLanguage("english");
                    filesList.getDataList().clear();
                    filesList.getDataList().add(el);

                    // close upload operations
                    AbxFileResult end = port.uploadEndFile(sessionIDF, binderName, objAllegato, filesList, previousVersionCode, "");
                    if (end.getResult() != abxMessages.UploadEndFile_UPLOADOK) {
                        // error 
                        ret = false;
                        break;
                    }
                } else {
                    ret = false;
                }
            }
        }
        return ret;
    }

    // list of files in a document
    public List<AbxFile> filesInDocument(String binderName, String docID) {

        AbxFileResult res = port.getDataFileList(sessionIDF, binderName, docID);
        if (res.getResult() == abxMessages.GetDataFileList_GETOK) {
            return res.getList().getDataList();
        } else {
            return null;
        }
    }

    // download file
    public boolean downloadFile(String downloadPath, String binderName, String uniqueFileID) {

        boolean ret = false;
        
        int chunkSize = 120 * 1024; // we ask to download file in more chunks of this size

        // ask to download file
        AbxFileResult ask = port.downloadFileByFileUniqueCode(sessionIDF, binderName, uniqueFileID, String.valueOf(chunkSize));
        if (ask.getResult() == abxMessages.DownloadFileByFileUniqueCode_OK) {
            // ok we can download file
            AbxFileList download = ask.getList();
            if (!download.getDataList().isEmpty()) {

                // get file info
                AbxFile fileInfo = download.getDataList().get(0);
                String completeFilename = downloadPath + fileInfo.getFilename();

                // delete file if already exist
                File file = new File(completeFilename);
                file.delete();

                // get download session id
                String downloadSessionID = fileInfo.getDownloadData().get(0).getCodeDownload();

                boolean byteToDownload = true;     // value set to enter the loop

                // loop to download file
                while (byteToDownload) {
                    // download next bytes
                    AbxFileResult result = port.downloadGetNext(sessionIDF, downloadSessionID);
                    if ((result.getResult() == abxMessages.DownloadGetNext_OK) || (result.getResult() == abxMessages.DownloadGetNext_OKEND)) {
                        try {
                            // AbxFile downloaded
                            // open file in append mode
                            try (FileOutputStream fos = new FileOutputStream(completeFilename, true)) {
                                // AbxFile downloaded
                                AbxFile fileDownloaded = result.getList().getDataList().get(0);
                                // stream downloaded
                                DownloadData downloadedStream = fileDownloaded.getDownloadData().get(0);
                                // write stream to file
                                fos.write(downloadedStream.getByteReady(), 0, downloadedStream.getByteReady().length);
                                fos.flush();
                            }
                        } catch (FileNotFoundException ex) {
                            // error
                            break;
                        } catch (IOException ex1) {
                            // error
                            break;
                        }
                        if (result.getResult() == abxMessages.DownloadGetNext_OKEND) {
                            // file completely downloaded, exit loop
                            ret = true;
                            byteToDownload = false;
                        }
                    } else {
                        // error
                        break;
                    }
                }
            }
        }
        return ret;
    }
}
