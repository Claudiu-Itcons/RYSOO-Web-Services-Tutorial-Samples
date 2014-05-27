
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFKTableFields complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFKTableFields">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldPrecision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFKTableFields", propOrder = {
    "fieldName",
    "fieldType",
    "fieldPrecision"
})
public class AbxFKTableFields {

    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String fieldType;
    @XmlElement(required = true)
    protected String fieldPrecision;

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
     * Recupera il valore della proprietà fieldType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * Imposta il valore della proprietà fieldType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldType(String value) {
        this.fieldType = value;
    }

    /**
     * Recupera il valore della proprietà fieldPrecision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldPrecision() {
        return fieldPrecision;
    }

    /**
     * Imposta il valore della proprietà fieldPrecision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldPrecision(String value) {
        this.fieldPrecision = value;
    }

}
