
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskFieldMapping complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskFieldMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldMappingId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="previewXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldMappingRules" type="{http://ws.abx/}abxSDKTaskFieldMappingRule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskFieldMapping", propOrder = {
    "fieldMappingId",
    "fieldName",
    "previewXML",
    "fieldMappingRules"
})
public class AbxSDKTaskFieldMapping {

    @XmlElement(required = true)
    protected String fieldMappingId;
    @XmlElement(required = true)
    protected String fieldName;
    @XmlElement(required = true)
    protected String previewXML;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskFieldMappingRule> fieldMappingRules;

    /**
     * Recupera il valore della proprietà fieldMappingId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldMappingId() {
        return fieldMappingId;
    }

    /**
     * Imposta il valore della proprietà fieldMappingId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldMappingId(String value) {
        this.fieldMappingId = value;
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
     * Recupera il valore della proprietà previewXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviewXML() {
        return previewXML;
    }

    /**
     * Imposta il valore della proprietà previewXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviewXML(String value) {
        this.previewXML = value;
    }

    /**
     * Gets the value of the fieldMappingRules property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMappingRules property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMappingRules().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskFieldMappingRule }
     * 
     * 
     */
    public List<AbxSDKTaskFieldMappingRule> getFieldMappingRules() {
        if (fieldMappingRules == null) {
            fieldMappingRules = new ArrayList<AbxSDKTaskFieldMappingRule>();
        }
        return this.fieldMappingRules;
    }

}
