
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFkArchiboxUtenti complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFkArchiboxUtenti">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="groupIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupIndexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupDescValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userIndexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userDescValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="localFields" type="{http://ws.abx/}abxRmFieldList"/>
 *         &lt;element name="recordList" type="{http://ws.abx/}abxFKUtentiRecord" maxOccurs="unbounded"/>
 *         &lt;element name="count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="multiFKList" type="{http://ws.abx/}abxMultiFKList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFkArchiboxUtenti", propOrder = {
    "groupIndex",
    "groupDesc",
    "userIndex",
    "userDesc",
    "groupIndexValue",
    "groupDescValue",
    "userIndexValue",
    "userDescValue",
    "localFields",
    "recordList",
    "count",
    "multiFKList"
})
public class AbxFkArchiboxUtenti {

    @XmlElement(required = true)
    protected String groupIndex;
    @XmlElement(required = true)
    protected String groupDesc;
    @XmlElement(required = true)
    protected String userIndex;
    @XmlElement(required = true)
    protected String userDesc;
    @XmlElement(required = true)
    protected String groupIndexValue;
    @XmlElement(required = true)
    protected String groupDescValue;
    @XmlElement(required = true)
    protected String userIndexValue;
    @XmlElement(required = true)
    protected String userDescValue;
    @XmlElement(required = true)
    protected AbxRmFieldList localFields;
    @XmlElement(required = true)
    protected List<AbxFKUtentiRecord> recordList;
    @XmlElement(required = true)
    protected String count;
    @XmlElement(required = true)
    protected AbxMultiFKList multiFKList;

    /**
     * Recupera il valore della proprietà groupIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIndex() {
        return groupIndex;
    }

    /**
     * Imposta il valore della proprietà groupIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIndex(String value) {
        this.groupIndex = value;
    }

    /**
     * Recupera il valore della proprietà groupDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDesc() {
        return groupDesc;
    }

    /**
     * Imposta il valore della proprietà groupDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDesc(String value) {
        this.groupDesc = value;
    }

    /**
     * Recupera il valore della proprietà userIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIndex() {
        return userIndex;
    }

    /**
     * Imposta il valore della proprietà userIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIndex(String value) {
        this.userIndex = value;
    }

    /**
     * Recupera il valore della proprietà userDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDesc() {
        return userDesc;
    }

    /**
     * Imposta il valore della proprietà userDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDesc(String value) {
        this.userDesc = value;
    }

    /**
     * Recupera il valore della proprietà groupIndexValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIndexValue() {
        return groupIndexValue;
    }

    /**
     * Imposta il valore della proprietà groupIndexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIndexValue(String value) {
        this.groupIndexValue = value;
    }

    /**
     * Recupera il valore della proprietà groupDescValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupDescValue() {
        return groupDescValue;
    }

    /**
     * Imposta il valore della proprietà groupDescValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupDescValue(String value) {
        this.groupDescValue = value;
    }

    /**
     * Recupera il valore della proprietà userIndexValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIndexValue() {
        return userIndexValue;
    }

    /**
     * Imposta il valore della proprietà userIndexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIndexValue(String value) {
        this.userIndexValue = value;
    }

    /**
     * Recupera il valore della proprietà userDescValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDescValue() {
        return userDescValue;
    }

    /**
     * Imposta il valore della proprietà userDescValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDescValue(String value) {
        this.userDescValue = value;
    }

    /**
     * Recupera il valore della proprietà localFields.
     * 
     * @return
     *     possible object is
     *     {@link AbxRmFieldList }
     *     
     */
    public AbxRmFieldList getLocalFields() {
        return localFields;
    }

    /**
     * Imposta il valore della proprietà localFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxRmFieldList }
     *     
     */
    public void setLocalFields(AbxRmFieldList value) {
        this.localFields = value;
    }

    /**
     * Gets the value of the recordList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxFKUtentiRecord }
     * 
     * 
     */
    public List<AbxFKUtentiRecord> getRecordList() {
        if (recordList == null) {
            recordList = new ArrayList<AbxFKUtentiRecord>();
        }
        return this.recordList;
    }

    /**
     * Recupera il valore della proprietà count.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {
        return count;
    }

    /**
     * Imposta il valore della proprietà count.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {
        this.count = value;
    }

    /**
     * Recupera il valore della proprietà multiFKList.
     * 
     * @return
     *     possible object is
     *     {@link AbxMultiFKList }
     *     
     */
    public AbxMultiFKList getMultiFKList() {
        return multiFKList;
    }

    /**
     * Imposta il valore della proprietà multiFKList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxMultiFKList }
     *     
     */
    public void setMultiFKList(AbxMultiFKList value) {
        this.multiFKList = value;
    }

}
