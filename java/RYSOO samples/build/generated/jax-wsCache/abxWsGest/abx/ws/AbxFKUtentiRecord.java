
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFKUtentiRecord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFKUtentiRecord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userGroupIdValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldList" type="{http://ws.abx/}abxFKUtentiField" maxOccurs="unbounded"/>
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
@XmlType(name = "abxFKUtentiRecord", propOrder = {
    "userGroupIdValue",
    "fieldList",
    "indexValue",
    "descValue"
})
public class AbxFKUtentiRecord {

    @XmlElement(required = true)
    protected String userGroupIdValue;
    @XmlElement(required = true)
    protected List<AbxFKUtentiField> fieldList;
    @XmlElement(required = true)
    protected String indexValue;
    @XmlElement(required = true)
    protected String descValue;

    /**
     * Recupera il valore della proprietà userGroupIdValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserGroupIdValue() {
        return userGroupIdValue;
    }

    /**
     * Imposta il valore della proprietà userGroupIdValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserGroupIdValue(String value) {
        this.userGroupIdValue = value;
    }

    /**
     * Gets the value of the fieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxFKUtentiField }
     * 
     * 
     */
    public List<AbxFKUtentiField> getFieldList() {
        if (fieldList == null) {
            fieldList = new ArrayList<AbxFKUtentiField>();
        }
        return this.fieldList;
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
