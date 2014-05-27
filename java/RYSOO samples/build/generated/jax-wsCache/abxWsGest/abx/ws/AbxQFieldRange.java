
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQFieldRange complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQFieldRange">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQFieldRange", propOrder = {
    "fromValue",
    "toValue"
})
public class AbxQFieldRange {

    @XmlElement(required = true)
    protected String fromValue;
    @XmlElement(required = true)
    protected String toValue;

    /**
     * Recupera il valore della proprietà fromValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromValue() {
        return fromValue;
    }

    /**
     * Imposta il valore della proprietà fromValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromValue(String value) {
        this.fromValue = value;
    }

    /**
     * Recupera il valore della proprietà toValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToValue() {
        return toValue;
    }

    /**
     * Imposta il valore della proprietà toValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToValue(String value) {
        this.toValue = value;
    }

}
