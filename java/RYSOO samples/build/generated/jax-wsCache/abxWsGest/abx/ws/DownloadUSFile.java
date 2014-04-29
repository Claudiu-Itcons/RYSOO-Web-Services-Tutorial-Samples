
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DownloadUSFile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DownloadUSFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="attachmentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dChunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadUSFile", propOrder = {
    "sessionId",
    "attachmentId",
    "dChunk"
})
public class DownloadUSFile {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String attachmentId;
    protected String dChunk;

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

}