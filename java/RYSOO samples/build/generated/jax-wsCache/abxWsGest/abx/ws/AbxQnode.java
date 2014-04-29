
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQnode complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQnode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="operandSX" type="{http://ws.abx/}abxQnode"/>
 *         &lt;element name="operandDX" type="{http://ws.abx/}abxQnode"/>
 *         &lt;element name="field" type="{http://ws.abx/}abxQField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQnode", propOrder = {
    "qOperator",
    "operandSX",
    "operandDX",
    "field"
})
public class AbxQnode {

    @XmlElement(required = true)
    protected String qOperator;
    @XmlElement(required = true)
    protected AbxQnode operandSX;
    @XmlElement(required = true)
    protected AbxQnode operandDX;
    @XmlElement(required = true)
    protected AbxQField field;

    /**
     * Recupera il valore della proprietà qOperator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQOperator() {
        return qOperator;
    }

    /**
     * Imposta il valore della proprietà qOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQOperator(String value) {
        this.qOperator = value;
    }

    /**
     * Recupera il valore della proprietà operandSX.
     * 
     * @return
     *     possible object is
     *     {@link AbxQnode }
     *     
     */
    public AbxQnode getOperandSX() {
        return operandSX;
    }

    /**
     * Imposta il valore della proprietà operandSX.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQnode }
     *     
     */
    public void setOperandSX(AbxQnode value) {
        this.operandSX = value;
    }

    /**
     * Recupera il valore della proprietà operandDX.
     * 
     * @return
     *     possible object is
     *     {@link AbxQnode }
     *     
     */
    public AbxQnode getOperandDX() {
        return operandDX;
    }

    /**
     * Imposta il valore della proprietà operandDX.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQnode }
     *     
     */
    public void setOperandDX(AbxQnode value) {
        this.operandDX = value;
    }

    /**
     * Recupera il valore della proprietà field.
     * 
     * @return
     *     possible object is
     *     {@link AbxQField }
     *     
     */
    public AbxQField getField() {
        return field;
    }

    /**
     * Imposta il valore della proprietà field.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQField }
     *     
     */
    public void setField(AbxQField value) {
        this.field = value;
    }

}
