
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per abxFileTp complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFileTp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isLastRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hashType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translationList" type="{http://ws.abx/}abxTranslation"/>
 *         &lt;element name="fileUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filenameSaved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDownload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="idContainer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateNameID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowProcessName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workflowPackageName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userIdCreated" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateLastModify" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="userIdLastModify" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="downloadData" type="{http://ws.abx/}downloadData" maxOccurs="unbounded"/>
 *         &lt;element name="uploadData" type="{http://ws.abx/}uploadData" maxOccurs="unbounded"/>
 *         &lt;element name="bindExcel" type="{http://ws.abx/}bindingExcel" maxOccurs="unbounded"/>
 *         &lt;element name="bindWord" type="{http://ws.abx/}bindingWord" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFileTp", propOrder = {
    "attachmentId",
    "isLastRevision",
    "revisionId",
    "filesize",
    "filename",
    "defaultLanguage",
    "description",
    "hash",
    "hashType",
    "translationList",
    "fileUniqueCode",
    "filepath",
    "filenameSaved",
    "numDownload",
    "idContainer",
    "templateNameID",
    "templateOption",
    "workflowProcessName",
    "workflowPackageName",
    "dateCreated",
    "userIdCreated",
    "dateLastModify",
    "userIdLastModify",
    "timestamp",
    "downloadData",
    "uploadData",
    "bindExcel",
    "bindWord"
})
public class AbxFileTp {

    @XmlElement(required = true)
    protected String attachmentId;
    protected boolean isLastRevision;
    @XmlElement(required = true)
    protected String revisionId;
    @XmlElement(required = true)
    protected String filesize;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String hash;
    @XmlElement(required = true)
    protected String hashType;
    @XmlElement(required = true)
    protected AbxTranslation translationList;
    @XmlElement(required = true)
    protected String fileUniqueCode;
    @XmlElement(required = true)
    protected String filepath;
    @XmlElement(required = true)
    protected String filenameSaved;
    protected int numDownload;
    @XmlElement(required = true)
    protected String idContainer;
    @XmlElement(required = true)
    protected String templateNameID;
    @XmlElement(required = true)
    protected String templateOption;
    @XmlElement(required = true)
    protected String workflowProcessName;
    @XmlElement(required = true)
    protected String workflowPackageName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateCreated;
    @XmlElement(required = true)
    protected String userIdCreated;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLastModify;
    @XmlElement(required = true)
    protected String userIdLastModify;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected List<DownloadData> downloadData;
    @XmlElement(required = true)
    protected List<UploadData> uploadData;
    @XmlElement(required = true)
    protected List<BindingExcel> bindExcel;
    @XmlElement(required = true)
    protected List<BindingWord> bindWord;

    /**
     * Recupera il valore della proprietà attachmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * Imposta il valore della proprietà attachmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentId(String value) {
        this.attachmentId = value;
    }

    /**
     * Recupera il valore della proprietà isLastRevision.
     * 
     */
    public boolean isIsLastRevision() {
        return isLastRevision;
    }

    /**
     * Imposta il valore della proprietà isLastRevision.
     * 
     */
    public void setIsLastRevision(boolean value) {
        this.isLastRevision = value;
    }

    /**
     * Recupera il valore della proprietà revisionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionId() {
        return revisionId;
    }

    /**
     * Imposta il valore della proprietà revisionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionId(String value) {
        this.revisionId = value;
    }

    /**
     * Recupera il valore della proprietà filesize.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilesize() {
        return filesize;
    }

    /**
     * Imposta il valore della proprietà filesize.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilesize(String value) {
        this.filesize = value;
    }

    /**
     * Recupera il valore della proprietà filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Imposta il valore della proprietà filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Recupera il valore della proprietà defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Imposta il valore della proprietà defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Imposta il valore della proprietà hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Recupera il valore della proprietà hashType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashType() {
        return hashType;
    }

    /**
     * Imposta il valore della proprietà hashType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashType(String value) {
        this.hashType = value;
    }

    /**
     * Recupera il valore della proprietà translationList.
     * 
     * @return
     *     possible object is
     *     {@link AbxTranslation }
     *     
     */
    public AbxTranslation getTranslationList() {
        return translationList;
    }

    /**
     * Imposta il valore della proprietà translationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTranslation }
     *     
     */
    public void setTranslationList(AbxTranslation value) {
        this.translationList = value;
    }

    /**
     * Recupera il valore della proprietà fileUniqueCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileUniqueCode() {
        return fileUniqueCode;
    }

    /**
     * Imposta il valore della proprietà fileUniqueCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileUniqueCode(String value) {
        this.fileUniqueCode = value;
    }

    /**
     * Recupera il valore della proprietà filepath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilepath() {
        return filepath;
    }

    /**
     * Imposta il valore della proprietà filepath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilepath(String value) {
        this.filepath = value;
    }

    /**
     * Recupera il valore della proprietà filenameSaved.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilenameSaved() {
        return filenameSaved;
    }

    /**
     * Imposta il valore della proprietà filenameSaved.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilenameSaved(String value) {
        this.filenameSaved = value;
    }

    /**
     * Recupera il valore della proprietà numDownload.
     * 
     */
    public int getNumDownload() {
        return numDownload;
    }

    /**
     * Imposta il valore della proprietà numDownload.
     * 
     */
    public void setNumDownload(int value) {
        this.numDownload = value;
    }

    /**
     * Recupera il valore della proprietà idContainer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdContainer() {
        return idContainer;
    }

    /**
     * Imposta il valore della proprietà idContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdContainer(String value) {
        this.idContainer = value;
    }

    /**
     * Recupera il valore della proprietà templateNameID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateNameID() {
        return templateNameID;
    }

    /**
     * Imposta il valore della proprietà templateNameID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateNameID(String value) {
        this.templateNameID = value;
    }

    /**
     * Recupera il valore della proprietà templateOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateOption() {
        return templateOption;
    }

    /**
     * Imposta il valore della proprietà templateOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateOption(String value) {
        this.templateOption = value;
    }

    /**
     * Recupera il valore della proprietà workflowProcessName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowProcessName() {
        return workflowProcessName;
    }

    /**
     * Imposta il valore della proprietà workflowProcessName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowProcessName(String value) {
        this.workflowProcessName = value;
    }

    /**
     * Recupera il valore della proprietà workflowPackageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowPackageName() {
        return workflowPackageName;
    }

    /**
     * Imposta il valore della proprietà workflowPackageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowPackageName(String value) {
        this.workflowPackageName = value;
    }

    /**
     * Recupera il valore della proprietà dateCreated.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateCreated() {
        return dateCreated;
    }

    /**
     * Imposta il valore della proprietà dateCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateCreated(XMLGregorianCalendar value) {
        this.dateCreated = value;
    }

    /**
     * Recupera il valore della proprietà userIdCreated.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdCreated() {
        return userIdCreated;
    }

    /**
     * Imposta il valore della proprietà userIdCreated.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdCreated(String value) {
        this.userIdCreated = value;
    }

    /**
     * Recupera il valore della proprietà dateLastModify.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLastModify() {
        return dateLastModify;
    }

    /**
     * Imposta il valore della proprietà dateLastModify.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLastModify(XMLGregorianCalendar value) {
        this.dateLastModify = value;
    }

    /**
     * Recupera il valore della proprietà userIdLastModify.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIdLastModify() {
        return userIdLastModify;
    }

    /**
     * Imposta il valore della proprietà userIdLastModify.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIdLastModify(String value) {
        this.userIdLastModify = value;
    }

    /**
     * Recupera il valore della proprietà timestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Imposta il valore della proprietà timestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the downloadData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the downloadData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDownloadData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DownloadData }
     * 
     * 
     */
    public List<DownloadData> getDownloadData() {
        if (downloadData == null) {
            downloadData = new ArrayList<DownloadData>();
        }
        return this.downloadData;
    }

    /**
     * Gets the value of the uploadData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the uploadData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUploadData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UploadData }
     * 
     * 
     */
    public List<UploadData> getUploadData() {
        if (uploadData == null) {
            uploadData = new ArrayList<UploadData>();
        }
        return this.uploadData;
    }

    /**
     * Gets the value of the bindExcel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindExcel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindExcel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingExcel }
     * 
     * 
     */
    public List<BindingExcel> getBindExcel() {
        if (bindExcel == null) {
            bindExcel = new ArrayList<BindingExcel>();
        }
        return this.bindExcel;
    }

    /**
     * Gets the value of the bindWord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bindWord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBindWord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BindingWord }
     * 
     * 
     */
    public List<BindingWord> getBindWord() {
        if (bindWord == null) {
            bindWord = new ArrayList<BindingWord>();
        }
        return this.bindWord;
    }

}
