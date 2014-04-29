
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFkArchiboxRacc complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFkArchiboxRacc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isRealTableIndex" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="tableDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableIndexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableDescValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordList" type="{http://ws.abx/}abxFKRaccRecord" maxOccurs="unbounded"/>
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
@XmlType(name = "abxFkArchiboxRacc", propOrder = {
    "instanceName",
    "dbName",
    "tableName",
    "tableIndex",
    "isRealTableIndex",
    "tableDesc",
    "tableIndexValue",
    "tableDescValue",
    "recordList",
    "count",
    "multiFKList"
})
public class AbxFkArchiboxRacc {

    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(required = true)
    protected String dbName;
    @XmlElement(required = true)
    protected String tableName;
    @XmlElement(required = true)
    protected String tableIndex;
    protected boolean isRealTableIndex;
    @XmlElement(required = true)
    protected String tableDesc;
    @XmlElement(required = true)
    protected String tableIndexValue;
    @XmlElement(required = true)
    protected String tableDescValue;
    @XmlElement(required = true)
    protected List<AbxFKRaccRecord> recordList;
    @XmlElement(required = true)
    protected String count;
    @XmlElement(required = true)
    protected AbxMultiFKList multiFKList;

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
     * Recupera il valore della proprietà dbName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbName() {
        return dbName;
    }

    /**
     * Imposta il valore della proprietà dbName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**
     * Recupera il valore della proprietà tableName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Imposta il valore della proprietà tableName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Recupera il valore della proprietà tableIndex.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableIndex() {
        return tableIndex;
    }

    /**
     * Imposta il valore della proprietà tableIndex.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableIndex(String value) {
        this.tableIndex = value;
    }

    /**
     * Recupera il valore della proprietà isRealTableIndex.
     * 
     */
    public boolean isIsRealTableIndex() {
        return isRealTableIndex;
    }

    /**
     * Imposta il valore della proprietà isRealTableIndex.
     * 
     */
    public void setIsRealTableIndex(boolean value) {
        this.isRealTableIndex = value;
    }

    /**
     * Recupera il valore della proprietà tableDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDesc() {
        return tableDesc;
    }

    /**
     * Imposta il valore della proprietà tableDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDesc(String value) {
        this.tableDesc = value;
    }

    /**
     * Recupera il valore della proprietà tableIndexValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableIndexValue() {
        return tableIndexValue;
    }

    /**
     * Imposta il valore della proprietà tableIndexValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableIndexValue(String value) {
        this.tableIndexValue = value;
    }

    /**
     * Recupera il valore della proprietà tableDescValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableDescValue() {
        return tableDescValue;
    }

    /**
     * Imposta il valore della proprietà tableDescValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableDescValue(String value) {
        this.tableDescValue = value;
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
     * {@link AbxFKRaccRecord }
     * 
     * 
     */
    public List<AbxFKRaccRecord> getRecordList() {
        if (recordList == null) {
            recordList = new ArrayList<AbxFKRaccRecord>();
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
