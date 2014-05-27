
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQcHead complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQcHead">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="field" type="{http://ws.abx/}abxField"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQcHead", propOrder = {
    "field"
})
public class AbxQcHead {

    @XmlElement(required = true)
    protected AbxField field;

    /**
     * Recupera il valore della proprietà field.
     * 
     * @return
     *     possible object is
     *     {@link AbxField }
     *     
     */
    public AbxField getField() {
        return field;
    }

    /**
     * Imposta il valore della proprietà field.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxField }
     *     
     */
    public void setField(AbxField value) {
        this.field = value;
    }

}
