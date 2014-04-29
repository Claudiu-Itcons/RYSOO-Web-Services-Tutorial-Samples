
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
 * <p>Classe Java per abxFile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isLastRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="revisionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filesize" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hashType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="containerId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="downloadData" type="{http://ws.abx/}downloadData" maxOccurs="unbounded"/>
 *         &lt;element name="uploadData" type="{http://ws.abx/}uploadData" maxOccurs="unbounded"/>
 *         &lt;element name="translationList" type="{http://ws.abx/}abxTranslation"/>
 *         &lt;element name="fileUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previousFileUniqueCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filenameSaved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numDownload" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="templateNameID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allPermission" type="{http://ws.abx/}abxAllPermission"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeGroupVersion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="signatureOwner" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signatureTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="linkedFiles" type="{http://ws.abx/}abxFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFile", propOrder = {
    "attachmentId",
    "dataId",
    "isLastRevision",
    "revisionId",
    "filesize",
    "filename",
    "defaultLanguage",
    "description",
    "timestamp",
    "hash",
    "hashType",
    "containerId",
    "downloadData",
    "uploadData",
    "translationList",
    "fileUniqueCode",
    "previousFileUniqueCode",
    "filepath",
    "filenameSaved",
    "numDownload",
    "templateNameID",
    "allPermission",
    "username",
    "codeGroupVersion",
    "enabled",
    "signatureOwner",
    "signatureTimestamp",
    "linkedFiles"
})
public class AbxFile {

    @XmlElement(required = true)
    protected String attachmentId;
    @XmlElement(required = true)
    protected String dataId;
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
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String hash;
    @XmlElement(required = true)
    protected String hashType;
    @XmlElement(required = true)
    protected String containerId;
    @XmlElement(required = true)
    protected List<DownloadData> downloadData;
    @XmlElement(required = true)
    protected List<UploadData> uploadData;
    @XmlElement(required = true)
    protected AbxTranslation translationList;
    @XmlElement(required = true)
    protected String fileUniqueCode;
    protected String previousFileUniqueCode;
    @XmlElement(required = true)
    protected String filepath;
    @XmlElement(required = true)
    protected String filenameSaved;
    protected int numDownload;
    @XmlElement(required = true)
    protected String templateNameID;
    @XmlElement(required = true)
    protected AbxAllPermission allPermission;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String codeGroupVersion;
    @XmlElement(required = true)
    protected byte[] enabled;
    @XmlElement(required = true)
    protected String signatureOwner;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar signatureTimestamp;
    @XmlElement(nillable = true)
    protected List<AbxFile> linkedFiles;

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
     * Recupera il valore della proprietà dataId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * Imposta il valore della proprietà dataId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataId(String value) {
        this.dataId = value;
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
     * Recupera il valore della proprietà containerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerId() {
        return containerId;
    }

    /**
     * Imposta il valore della proprietà containerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerId(String value) {
        this.containerId = value;
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
     * Recupera il valore della proprietà previousFileUniqueCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousFileUniqueCode() {
        return previousFileUniqueCode;
    }

    /**
     * Imposta il valore della proprietà previousFileUniqueCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousFileUniqueCode(String value) {
        this.previousFileUniqueCode = value;
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
     * Recupera il valore della proprietà allPermission.
     * 
     * @return
     *     possible object is
     *     {@link AbxAllPermission }
     *     
     */
    public AbxAllPermission getAllPermission() {
        return allPermission;
    }

    /**
     * Imposta il valore della proprietà allPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxAllPermission }
     *     
     */
    public void setAllPermission(AbxAllPermission value) {
        this.allPermission = value;
    }

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Recupera il valore della proprietà codeGroupVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeGroupVersion() {
        return codeGroupVersion;
    }

    /**
     * Imposta il valore della proprietà codeGroupVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeGroupVersion(String value) {
        this.codeGroupVersion = value;
    }

    /**
     * Recupera il valore della proprietà enabled.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getEnabled() {
        return enabled;
    }

    /**
     * Imposta il valore della proprietà enabled.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setEnabled(byte[] value) {
        this.enabled = value;
    }

    /**
     * Recupera il valore della proprietà signatureOwner.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureOwner() {
        return signatureOwner;
    }

    /**
     * Imposta il valore della proprietà signatureOwner.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureOwner(String value) {
        this.signatureOwner = value;
    }

    /**
     * Recupera il valore della proprietà signatureTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSignatureTimestamp() {
        return signatureTimestamp;
    }

    /**
     * Imposta il valore della proprietà signatureTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSignatureTimestamp(XMLGregorianCalendar value) {
        this.signatureTimestamp = value;
    }

    /**
     * Gets the value of the linkedFiles property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkedFiles property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkedFiles().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxFile }
     * 
     * 
     */
    public List<AbxFile> getLinkedFiles() {
        if (linkedFiles == null) {
            linkedFiles = new ArrayList<AbxFile>();
        }
        return this.linkedFiles;
    }

}
