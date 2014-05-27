
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per downloadData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="downloadData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="downloadDimTot" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="byteSent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filenameSaved" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codeFile" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="byteReady" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="codeDownload" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "downloadData", propOrder = {
    "downloadDimTot",
    "byteSent",
    "filenameSaved",
    "dataId",
    "instanceId",
    "dbName",
    "codeFile",
    "byteReady",
    "codeDownload"
})
public class DownloadData {

    @XmlElement(required = true)
    protected String downloadDimTot;
    @XmlElement(required = true)
    protected String byteSent;
    @XmlElement(required = true)
    protected String filenameSaved;
    @XmlElement(required = true)
    protected String dataId;
    @XmlElement(required = true)
    protected String instanceId;
    @XmlElement(required = true)
    protected String dbName;
    @XmlElement(required = true)
    protected String codeFile;
    @XmlElement(required = true)
    protected byte[] byteReady;
    @XmlElement(required = true)
    protected String codeDownload;

    /**
     * Recupera il valore della proprietà downloadDimTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadDimTot() {
        return downloadDimTot;
    }

    /**
     * Imposta il valore della proprietà downloadDimTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadDimTot(String value) {
        this.downloadDimTot = value;
    }

    /**
     * Recupera il valore della proprietà byteSent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getByteSent() {
        return byteSent;
    }

    /**
     * Imposta il valore della proprietà byteSent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setByteSent(String value) {
        this.byteSent = value;
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
     * Recupera il valore della proprietà byteReady.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getByteReady() {
        return byteReady;
    }

    /**
     * Imposta il valore della proprietà byteReady.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setByteReady(byte[] value) {
        this.byteReady = value;
    }

    /**
     * Recupera il valore della proprietà codeDownload.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDownload() {
        return codeDownload;
    }

    /**
     * Imposta il valore della proprietà codeDownload.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDownload(String value) {
        this.codeDownload = value;
    }

}
