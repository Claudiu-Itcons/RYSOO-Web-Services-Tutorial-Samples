
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFKFieldMap complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFKFieldMap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remoteField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFKFieldMap", propOrder = {
    "remoteField",
    "localField"
})
public class AbxFKFieldMap {

    @XmlElement(required = true)
    protected String remoteField;
    @XmlElement(required = true)
    protected String localField;

    /**
     * Recupera il valore della proprietà remoteField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteField() {
        return remoteField;
    }

    /**
     * Imposta il valore della proprietà remoteField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteField(String value) {
        this.remoteField = value;
    }

    /**
     * Recupera il valore della proprietà localField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalField() {
        return localField;
    }

    /**
     * Imposta il valore della proprietà localField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalField(String value) {
        this.localField = value;
    }

}
