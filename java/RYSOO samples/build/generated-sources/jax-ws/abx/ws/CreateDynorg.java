
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.abxdynaminorg.AbxDynamicorgRuleList;


/**
 * <p>Classe Java per CreateDynorg complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CreateDynorg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="DynorgParam" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgRuleList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDynorg", propOrder = {
    "sessionId",
    "dynorgParam"
})
public class CreateDynorg {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "DynorgParam")
    protected AbxDynamicorgRuleList dynorgParam;

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
     * Recupera il valore della proprietà dynorgParam.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public AbxDynamicorgRuleList getDynorgParam() {
        return dynorgParam;
    }

    /**
     * Imposta il valore della proprietà dynorgParam.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public void setDynorgParam(AbxDynamicorgRuleList value) {
        this.dynorgParam = value;
    }

}
