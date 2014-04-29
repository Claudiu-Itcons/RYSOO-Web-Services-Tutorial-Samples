
package org.netbeans.xml.schema.abxdynaminorg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxDynamicorgRuleElement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxDynamicorgRuleElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxDynamicorgRuleElement", propOrder = {
    "ruleTypeName",
    "description",
    "orderId",
    "option"
})
public class AbxDynamicorgRuleElement {

    @XmlElement(required = true)
    protected String ruleTypeName;
    @XmlElement(name = "Description", required = true)
    protected String description;
    protected int orderId;
    @XmlElement(required = true)
    protected String option;

    /**
     * Recupera il valore della proprietà ruleTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleTypeName() {
        return ruleTypeName;
    }

    /**
     * Imposta il valore della proprietà ruleTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleTypeName(String value) {
        this.ruleTypeName = value;
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
     * Recupera il valore della proprietà orderId.
     * 
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * Imposta il valore della proprietà orderId.
     * 
     */
    public void setOrderId(int value) {
        this.orderId = value;
    }

    /**
     * Recupera il valore della proprietà option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Imposta il valore della proprietà option.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

}
