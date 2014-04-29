
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DownloadFilePreview complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DownloadFilePreview">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataAttachmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dChunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="previewType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadFilePreview", propOrder = {
    "sessionId",
    "instanceName",
    "dataAttachmentId",
    "dChunk",
    "previewType"
})
public class DownloadFilePreview {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceName;
    protected String dataAttachmentId;
    protected String dChunk;
    protected Integer previewType;

    /**
     * Recupera il valore della proprietà sessionId.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getSessionId() {
        return sessionId;
    }

    /**
     * Imposta il valore della proprietà sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setSessionId(IDtype value) {
        this.sessionId = value;
    }

    /**
     * Recupera il valore della proprietà instanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Imposta il valore della proprietà instanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * Recupera il valore della proprietà dataAttachmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAttachmentId() {
        return dataAttachmentId;
    }

    /**
     * Imposta il valore della proprietà dataAttachmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAttachmentId(String value) {
        this.dataAttachmentId = value;
    }

    /**
     * Recupera il valore della proprietà dChunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDChunk() {
        return dChunk;
    }

    /**
     * Imposta il valore della proprietà dChunk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDChunk(String value) {
        this.dChunk = value;
    }

    /**
     * Recupera il valore della proprietà previewType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPreviewType() {
        return previewType;
    }

    /**
     * Imposta il valore della proprietà previewType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPreviewType(Integer value) {
        this.previewType = value;
    }

}
