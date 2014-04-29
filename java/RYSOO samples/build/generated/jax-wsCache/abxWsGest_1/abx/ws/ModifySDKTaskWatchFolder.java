
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModifySDKTaskWatchFolder complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModifySDKTaskWatchFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="sdkTask" type="{http://ws.abx/}abxSDKTask" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifySDKTaskWatchFolder", propOrder = {
    "sessionId",
    "sdkTask"
})
public class ModifySDKTaskWatchFolder {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxSDKTask sdkTask;

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
     * Recupera il valore della proprietà sdkTask.
     * 
     * @return
     *     possible object is
     *     {@link AbxSDKTask }
     *     
     */
    public AbxSDKTask getSdkTask() {
        return sdkTask;
    }

    /**
     * Imposta il valore della proprietà sdkTask.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSDKTask }
     *     
     */
    public void setSdkTask(AbxSDKTask value) {
        this.sdkTask = value;
    }

}
