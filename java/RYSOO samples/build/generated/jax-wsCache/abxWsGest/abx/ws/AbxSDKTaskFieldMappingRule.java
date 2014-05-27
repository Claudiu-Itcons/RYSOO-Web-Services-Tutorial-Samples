
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskFieldMappingRule complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskFieldMappingRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldMappingRuleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parametersXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskFieldMappingRule", propOrder = {
    "fieldMappingRuleId",
    "ruleId",
    "ruleName",
    "parametersXML"
})
public class AbxSDKTaskFieldMappingRule {

    @XmlElement(required = true)
    protected String fieldMappingRuleId;
    @XmlElement(required = true)
    protected String ruleId;
    @XmlElement(required = true)
    protected String ruleName;
    @XmlElement(required = true)
    protected String parametersXML;

    /**
     * Recupera il valore della proprietà fieldMappingRuleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldMappingRuleId() {
        return fieldMappingRuleId;
    }

    /**
     * Imposta il valore della proprietà fieldMappingRuleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldMappingRuleId(String value) {
        this.fieldMappingRuleId = value;
    }

    /**
     * Recupera il valore della proprietà ruleId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleId() {
        return ruleId;
    }

    /**
     * Imposta il valore della proprietà ruleId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleId(String value) {
        this.ruleId = value;
    }

    /**
     * Recupera il valore della proprietà ruleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Imposta il valore della proprietà ruleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Recupera il valore della proprietà parametersXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametersXML() {
        return parametersXML;
    }

    /**
     * Imposta il valore della proprietà parametersXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametersXML(String value) {
        this.parametersXML = value;
    }

}
