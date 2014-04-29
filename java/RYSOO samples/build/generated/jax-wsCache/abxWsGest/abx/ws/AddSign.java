
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AddSign complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AddSign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="aw" type="{http://ws.abx/}abxWorkflow" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddSign", propOrder = {
    "sessionId",
    "aw"
})
public class AddSign {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxWorkflow aw;

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
     * Recupera il valore della proprietà aw.
     * 
     * @return
     *     possible object is
     *     {@link AbxWorkflow }
     *     
     */
    public AbxWorkflow getAw() {
        return aw;
    }

    /**
     * Imposta il valore della proprietà aw.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxWorkflow }
     *     
     */
    public void setAw(AbxWorkflow value) {
        this.aw = value;
    }

}
