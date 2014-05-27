
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModifyArchSostRule complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModifyArchSostRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="archSostRule" type="{http://ws.abx/}abxArchSostRule" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyArchSostRule", propOrder = {
    "sessionId",
    "archSostRule"
})
public class ModifyArchSostRule {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxArchSostRule archSostRule;

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
     * Recupera il valore della proprietà archSostRule.
     * 
     * @return
     *     possible object is
     *     {@link AbxArchSostRule }
     *     
     */
    public AbxArchSostRule getArchSostRule() {
        return archSostRule;
    }

    /**
     * Imposta il valore della proprietà archSostRule.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxArchSostRule }
     *     
     */
    public void setArchSostRule(AbxArchSostRule value) {
        this.archSostRule = value;
    }

}
