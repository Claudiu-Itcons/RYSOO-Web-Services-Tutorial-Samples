
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddLogSDK complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddLogSDK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="eventTypeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="levelInfoCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddLogSDK", propOrder = {
    "sessionId",
    "eventTypeCode",
    "levelInfoCode",
    "messageCode",
    "description"
})
public class AddLogSDK {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected long eventTypeCode;
    protected long levelInfoCode;
    protected long messageCode;
    protected String description;

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
     * Recupera il valore della proprietà eventTypeCode.
     * 
     */
    public long getEventTypeCode() {
        return eventTypeCode;
    }

    /**
     * Imposta il valore della proprietà eventTypeCode.
     * 
     */
    public void setEventTypeCode(long value) {
        this.eventTypeCode = value;
    }

    /**
     * Recupera il valore della proprietà levelInfoCode.
     * 
     */
    public long getLevelInfoCode() {
        return levelInfoCode;
    }

    /**
     * Imposta il valore della proprietà levelInfoCode.
     * 
     */
    public void setLevelInfoCode(long value) {
        this.levelInfoCode = value;
    }

    /**
     * Recupera il valore della proprietà messageCode.
     * 
     */
    public long getMessageCode() {
        return messageCode;
    }

    /**
     * Imposta il valore della proprietà messageCode.
     * 
     */
    public void setMessageCode(long value) {
        this.messageCode = value;
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

}
