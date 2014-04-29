
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxComboRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxComboRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idRecord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldTypeId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxComboRecord", propOrder = {
    "idRecord",
    "fieldTypeId",
    "description",
    "_default"
})
public class AbxComboRecord {

    @XmlElement(required = true)
    protected String idRecord;
    @XmlElement(required = true)
    protected String fieldTypeId;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "default")
    protected boolean _default;

    /**
     * Recupera il valore della proprietà idRecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdRecord() {
        return idRecord;
    }

    /**
     * Imposta il valore della proprietà idRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdRecord(String value) {
        this.idRecord = value;
    }

    /**
     * Recupera il valore della proprietà fieldTypeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldTypeId() {
        return fieldTypeId;
    }

    /**
     * Imposta il valore della proprietà fieldTypeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldTypeId(String value) {
        this.fieldTypeId = value;
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
     * Recupera il valore della proprietà default.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Imposta il valore della proprietà default.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

}
