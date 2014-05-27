
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DownloadGetChunkWA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DownloadGetChunkWA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dimChunk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadGetChunkWA", propOrder = {
    "sessionId",
    "fileCode",
    "dimChunk",
    "offset"
})
public class DownloadGetChunkWA {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String fileCode;
    protected String dimChunk;
    protected String offset;

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
     * Recupera il valore della proprietà fileCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCode() {
        return fileCode;
    }

    /**
     * Imposta il valore della proprietà fileCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCode(String value) {
        this.fileCode = value;
    }

    /**
     * Recupera il valore della proprietà dimChunk.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimChunk() {
        return dimChunk;
    }

    /**
     * Imposta il valore della proprietà dimChunk.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimChunk(String value) {
        this.dimChunk = value;
    }

    /**
     * Recupera il valore della proprietà offset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffset() {
        return offset;
    }

    /**
     * Imposta il valore della proprietà offset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffset(String value) {
        this.offset = value;
    }

}
