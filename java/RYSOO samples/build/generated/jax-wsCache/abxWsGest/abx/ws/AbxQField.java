
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQField complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldProperties" type="{http://ws.abx/}abxField"/>
 *         &lt;element name="fieldTypeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="range" type="{http://ws.abx/}abxQFieldRange"/>
 *         &lt;element name="fOperator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQField", propOrder = {
    "fieldName",
    "fieldProperties",
    "fieldTypeName",
    "value",
    "range",
    "fOperator"
})
public class AbxQField {

    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected AbxField fieldProperties;
    @XmlElement(required = true)
    protected String fieldTypeName;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected AbxQFieldRange range;
    @XmlElement(required = true)
    protected String fOperator;

    /**
     * Recupera il valore della proprietà fieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Imposta il valore della proprietà fieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Recupera il valore della proprietà fieldProperties.
     * 
     * @return
     *     possible object is
     *     {@link AbxField }
     *     
     */
    public AbxField getFieldProperties() {
        return fieldProperties;
    }

    /**
     * Imposta il valore della proprietà fieldProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxField }
     *     
     */
    public void setFieldProperties(AbxField value) {
        this.fieldProperties = value;
    }

    /**
     * Recupera il valore della proprietà fieldTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldTypeName() {
        return fieldTypeName;
    }

    /**
     * Imposta il valore della proprietà fieldTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldTypeName(String value) {
        this.fieldTypeName = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Recupera il valore della proprietà range.
     * 
     * @return
     *     possible object is
     *     {@link AbxQFieldRange }
     *     
     */
    public AbxQFieldRange getRange() {
        return range;
    }

    /**
     * Imposta il valore della proprietà range.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQFieldRange }
     *     
     */
    public void setRange(AbxQFieldRange value) {
        this.range = value;
    }

    /**
     * Recupera il valore della proprietà fOperator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOperator() {
        return fOperator;
    }

    /**
     * Imposta il valore della proprietà fOperator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOperator(String value) {
        this.fOperator = value;
    }

}
