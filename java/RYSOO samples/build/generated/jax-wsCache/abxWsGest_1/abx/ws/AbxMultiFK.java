
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxMultiFK complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxMultiFK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abxFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="abxFKFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxMultiFK", propOrder = {
    "abxFieldName",
    "abxFKFieldName"
})
public class AbxMultiFK {

    @XmlElement(required = true)
    protected String abxFieldName;
    @XmlElement(required = true)
    protected String abxFKFieldName;

    /**
     * Recupera il valore della proprietà abxFieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbxFieldName() {
        return abxFieldName;
    }

    /**
     * Imposta il valore della proprietà abxFieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbxFieldName(String value) {
        this.abxFieldName = value;
    }

    /**
     * Recupera il valore della proprietà abxFKFieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbxFKFieldName() {
        return abxFKFieldName;
    }

    /**
     * Imposta il valore della proprietà abxFKFieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbxFKFieldName(String value) {
        this.abxFKFieldName = value;
    }

}
