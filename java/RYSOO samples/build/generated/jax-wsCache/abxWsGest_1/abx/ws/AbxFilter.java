
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per AbxFilter complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="AbxFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instance_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="group_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filter_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instance_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="field_value_description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbxFilter", propOrder = {
    "instanceName",
    "groupName",
    "fieldName",
    "fieldValue",
    "filterName",
    "instanceDescription",
    "fieldDescription",
    "fieldValueDescription"
})
public class AbxFilter {

    @XmlElement(name = "instance_name", required = true)
    protected String instanceName;
    @XmlElement(name = "group_name", required = true)
    protected String groupName;
    @XmlElement(name = "field_name", required = true)
    protected String fieldName;
    @XmlElement(name = "field_value", required = true)
    protected String fieldValue;
    @XmlElement(name = "filter_name", required = true)
    protected String filterName;
    @XmlElement(name = "instance_description", required = true)
    protected String instanceDescription;
    @XmlElement(name = "field_description", required = true)
    protected String fieldDescription;
    @XmlElement(name = "field_value_description", required = true)
    protected String fieldValueDescription;

    /**
     * Recupera il valore della proprietà instanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Imposta il valore della proprietà instanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * Recupera il valore della proprietà groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Imposta il valore della proprietà groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

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
     * Recupera il valore della proprietà fieldValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValue() {
        return fieldValue;
    }

    /**
     * Imposta il valore della proprietà fieldValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValue(String value) {
        this.fieldValue = value;
    }

    /**
     * Recupera il valore della proprietà filterName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterName() {
        return filterName;
    }

    /**
     * Imposta il valore della proprietà filterName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterName(String value) {
        this.filterName = value;
    }

    /**
     * Recupera il valore della proprietà instanceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceDescription() {
        return instanceDescription;
    }

    /**
     * Imposta il valore della proprietà instanceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceDescription(String value) {
        this.instanceDescription = value;
    }

    /**
     * Recupera il valore della proprietà fieldDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Imposta il valore della proprietà fieldDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldDescription(String value) {
        this.fieldDescription = value;
    }

    /**
     * Recupera il valore della proprietà fieldValueDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldValueDescription() {
        return fieldValueDescription;
    }

    /**
     * Imposta il valore della proprietà fieldValueDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldValueDescription(String value) {
        this.fieldValueDescription = value;
    }

}
