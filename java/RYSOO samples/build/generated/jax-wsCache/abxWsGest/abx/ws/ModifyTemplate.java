
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModifyTemplate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModifyTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="Template2Update" type="{http://ws.abx/}abxTemplate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyTemplate", propOrder = {
    "sessionId",
    "template2Update"
})
public class ModifyTemplate {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "Template2Update")
    protected AbxTemplate template2Update;

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
     * Recupera il valore della proprietà template2Update.
     * 
     * @return
     *     possible object is
     *     {@link AbxTemplate }
     *     
     */
    public AbxTemplate getTemplate2Update() {
        return template2Update;
    }

    /**
     * Imposta il valore della proprietà template2Update.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTemplate }
     *     
     */
    public void setTemplate2Update(AbxTemplate value) {
        this.template2Update = value;
    }

}
