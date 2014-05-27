
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per abxLog complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxLog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="eventTypeCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="levelCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxLog", propOrder = {
    "eventTypeCode",
    "levelCode",
    "messageCode",
    "description",
    "username",
    "timestamp"
})
public class AbxLog {

    protected long eventTypeCode;
    protected long levelCode;
    protected long messageCode;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;

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
     * Recupera il valore della proprietà levelCode.
     * 
     */
    public long getLevelCode() {
        return levelCode;
    }

    /**
     * Imposta il valore della proprietà levelCode.
     * 
     */
    public void setLevelCode(long value) {
        this.levelCode = value;
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

}
