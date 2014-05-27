
package org.netbeans.xml.schema.abxdynaminorg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxDynamicRuleResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxDynamicRuleResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="rules" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgRuleList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxDynamicRuleResult", propOrder = {
    "result",
    "rules"
})
public class AbxDynamicRuleResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxDynamicorgRuleList rules;

    /**
     * Recupera il valore della proprietà result.
     * 
     */
    public long getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     */
    public void setResult(long value) {
        this.result = value;
    }

    /**
     * Recupera il valore della proprietà rules.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public AbxDynamicorgRuleList getRules() {
        return rules;
    }

    /**
     * Imposta il valore della proprietà rules.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public void setRules(AbxDynamicorgRuleList value) {
        this.rules = value;
    }

}
