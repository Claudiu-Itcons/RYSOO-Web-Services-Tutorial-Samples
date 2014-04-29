
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per uploadData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="uploadData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hashTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="securityLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="uploadDimChunk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filepath" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dimFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="byteReceived" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filenameSaved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "uploadData", propOrder = {
    "hash",
    "hashTypeId",
    "securityLevel",
    "timestamp",
    "uploadDimChunk",
    "codeFile",
    "filename",
    "filepath",
    "dimFile",
    "byteReceived",
    "filenameSaved",
    "dataId",
    "instanceId",
    "dbName"
})
public class UploadData {

    @XmlElement(required = true)
    protected String hash;
    @XmlElement(required = true)
    protected String hashTypeId;
    @XmlElement(required = true)
    protected String securityLevel;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlElement(required = true)
    protected String uploadDimChunk;
    @XmlElement(required = true)
    protected String codeFile;
    @XmlElement(required = true)
    protected String filename;
    @XmlElement(required = true)
    protected String filepath;
    @XmlElement(required = true)
    protected String dimFile;
    @XmlElement(required = true)
    protected String byteReceived;
    @XmlElement(required = true)
    protected String filenameSaved;
    @XmlElement(required = true)
    protected String dataId;
    @XmlElement(required = true)
    protected String instanceId;
    @XmlElement(required = true)
    protected String dbName;

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
     * Recupera il valore della proprietà hashTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashTypeId() {
        return hashTypeId;
    }

    /**
     * Imposta il valore della proprietà hashTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashTypeId(String value) {
        this.hashTypeId = value;
    }

    /**
     * Recupera il valore della proprietà securityLevel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    /**
     * Imposta il valore della proprietà securityLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityLevel(String value) {
        this.securityLevel = value;
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
     * Recupera il valore della proprietà uploadDimChunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUploadDimChunk() {
        return uploadDimChunk;
    }

    /**
     * Imposta il valore della proprietà uploadDimChunk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUploadDimChunk(String value) {
        this.uploadDimChunk = value;
    }

    /**
     * Recupera il valore della proprietà codeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeFile() {
        return codeFile;
    }

    /**
     * Imposta il valore della proprietà codeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeFile(String value) {
        this.codeFile = value;
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
     * Recupera il valore della proprietà dimFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimFile() {
        return dimFile;
    }

    /**
     * Imposta il valore della proprietà dimFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimFile(String value) {
        this.dimFile = value;
    }

    /**
     * Recupera il valore della proprietà byteReceived.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByteReceived() {
        return byteReceived;
    }

    /**
     * Imposta il valore della proprietà byteReceived.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByteReceived(String value) {
        this.byteReceived = value;
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
     * Recupera il valore della proprietà instanceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * Imposta il valore della proprietà instanceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceId(String value) {
        this.instanceId = value;
    }

    /**
     * Recupera il valore della proprietà dbName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Imposta il valore della proprietà dbName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

}
