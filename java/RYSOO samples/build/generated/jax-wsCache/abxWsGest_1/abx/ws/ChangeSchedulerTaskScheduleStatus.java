
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ChangeSchedulerTaskScheduleStatus complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ChangeSchedulerTaskScheduleStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="scheduleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scheduleType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="scheduleStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeSchedulerTaskScheduleStatus", propOrder = {
    "sessionId",
    "scheduleId",
    "scheduleType",
    "scheduleStatus"
})
public class ChangeSchedulerTaskScheduleStatus {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String scheduleId;
    protected int scheduleType;
    protected int scheduleStatus;

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
     * Recupera il valore della proprietà scheduleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleId() {
        return scheduleId;
    }

    /**
     * Imposta il valore della proprietà scheduleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleId(String value) {
        this.scheduleId = value;
    }

    /**
     * Recupera il valore della proprietà scheduleType.
     * 
     */
    public int getScheduleType() {
        return scheduleType;
    }

    /**
     * Imposta il valore della proprietà scheduleType.
     * 
     */
    public void setScheduleType(int value) {
        this.scheduleType = value;
    }

    /**
     * Recupera il valore della proprietà scheduleStatus.
     * 
     */
    public int getScheduleStatus() {
        return scheduleStatus;
    }

    /**
     * Imposta il valore della proprietà scheduleStatus.
     * 
     */
    public void setScheduleStatus(int value) {
        this.scheduleStatus = value;
    }

}
