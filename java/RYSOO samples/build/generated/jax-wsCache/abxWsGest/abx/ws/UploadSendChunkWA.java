
package abx.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UploadSendChunkWA complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UploadSendChunkWA">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fileCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="chunk" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadSendChunkWA", propOrder = {
    "sessionId",
    "fileCode",
    "chunk"
})
public class UploadSendChunkWA {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String fileCode;
    @XmlElementRef(name = "chunk", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> chunk;

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
     * Recupera il valore della proprietà chunk.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getChunk() {
        return chunk;
    }

    /**
     * Imposta il valore della proprietà chunk.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setChunk(JAXBElement<byte[]> value) {
        this.chunk = value;
    }

}
