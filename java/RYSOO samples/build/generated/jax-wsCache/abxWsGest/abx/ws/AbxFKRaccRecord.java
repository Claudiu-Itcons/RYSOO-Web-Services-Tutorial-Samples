
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFKRaccRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFKRaccRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataIdValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="descValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFKRaccRecord", propOrder = {
    "dataIdValue",
    "indexValue",
    "descValue"
})
public class AbxFKRaccRecord {

    @XmlElement(required = true)
    protected String dataIdValue;
    @XmlElement(required = true)
    protected String indexValue;
    @XmlElement(required = true)
    protected String descValue;

    /**
     * Recupera il valore della proprietà dataIdValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdValue() {
        return dataIdValue;
    }

    /**
     * Imposta il valore della proprietà dataIdValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdValue(String value) {
        this.dataIdValue = value;
    }

    /**
     * Recupera il valore della proprietà indexValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexValue() {
        return indexValue;
    }

    /**
     * Imposta il valore della proprietà indexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexValue(String value) {
        this.indexValue = value;
    }

    /**
     * Recupera il valore della proprietà descValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescValue() {
        return descValue;
    }

    /**
     * Imposta il valore della proprietà descValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescValue(String value) {
        this.descValue = value;
    }

}
