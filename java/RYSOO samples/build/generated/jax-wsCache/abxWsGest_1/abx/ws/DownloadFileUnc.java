
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DownloadFileUnc complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DownloadFileUnc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="UNCPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "DownloadFileUnc", propOrder = {
    "sessionId",
    "uncPath",
    "dChunk"
})
public class DownloadFileUnc {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "UNCPath")
    protected String uncPath;
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
     * Recupera il valore della proprietà uncPath.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNCPath() {
        return uncPath;
    }

    /**
     * Imposta il valore della proprietà uncPath.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNCPath(String value) {
        this.uncPath = value;
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
