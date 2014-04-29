
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFkDb complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFkDb">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dbType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dbName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="host" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="poolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="recordList" type="{http://ws.abx/}abxFKDbRecord" maxOccurs="unbounded"/>
 *         &lt;element name="tableIndexValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tableDescValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionGetRecord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="optionSetFkValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fieldMapList" type="{http://ws.abx/}abxFKFieldMap" maxOccurs="unbounded"/>
 *         &lt;element name="tableFieldList" type="{http://ws.abx/}abxFKTableFields" maxOccurs="unbounded"/>
 *         &lt;element name="remoteDatabase" type="{http://ws.abx/}abxRmDatabaseList"/>
 *         &lt;element name="remoteTable" type="{http://ws.abx/}abxRmTableList"/>
 *         &lt;element name="remoteView" type="{http://ws.abx/}abxRmViewList"/>
 *         &lt;element name="remoteField" type="{http://ws.abx/}abxRmFieldList"/>
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
@XmlType(name = "abxFkDb", propOrder = {
    "dbType",
    "dbName",
    "host",
    "user",
    "password",
    "tableName",
    "tableIndex",
    "tableDesc",
    "poolName",
    "resourceName",
    "recordList",
    "tableIndexValue",
    "tableDescValue",
    "optionGetRecord",
    "optionSetFkValue",
    "fieldMapList",
    "tableFieldList",
    "remoteDatabase",
    "remoteTable",
    "remoteView",
    "remoteField",
    "multiFKList"
})
public class AbxFkDb {

    @XmlElement(required = true)
    protected String dbType;
    @XmlElement(required = true)
    protected String dbName;
    @XmlElement(required = true)
    protected String host;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String tableName;
    @XmlElement(required = true)
    protected String tableIndex;
    @XmlElement(required = true)
    protected String tableDesc;
    @XmlElement(required = true)
    protected String poolName;
    @XmlElement(required = true)
    protected String resourceName;
    @XmlElement(required = true)
    protected List<AbxFKDbRecord> recordList;
    @XmlElement(required = true)
    protected String tableIndexValue;
    @XmlElement(required = true)
    protected String tableDescValue;
    @XmlElement(required = true)
    protected String optionGetRecord;
    @XmlElement(required = true)
    protected String optionSetFkValue;
    @XmlElement(required = true)
    protected List<AbxFKFieldMap> fieldMapList;
    @XmlElement(required = true)
    protected List<AbxFKTableFields> tableFieldList;
    @XmlElement(required = true)
    protected AbxRmDatabaseList remoteDatabase;
    @XmlElement(required = true)
    protected AbxRmTableList remoteTable;
    @XmlElement(required = true)
    protected AbxRmViewList remoteView;
    @XmlElement(required = true)
    protected AbxRmFieldList remoteField;
    @XmlElement(required = true)
    protected AbxMultiFKList multiFKList;

    /**
     * Recupera il valore della proprietà dbType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDbType() {
        return dbType;
    }

    /**
     * Imposta il valore della proprietà dbType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDbType(String value) {
        this.dbType = value;
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
     * Recupera il valore della proprietà host.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHost() {
        return host;
    }

    /**
     * Imposta il valore della proprietà host.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHost(String value) {
        this.host = value;
    }

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Recupera il valore della proprietà password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta il valore della proprietà password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Recupera il valore della proprietà poolName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoolName() {
        return poolName;
    }

    /**
     * Imposta il valore della proprietà poolName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoolName(String value) {
        this.poolName = value;
    }

    /**
     * Recupera il valore della proprietà resourceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Imposta il valore della proprietà resourceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
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
     * {@link AbxFKDbRecord }
     * 
     * 
     */
    public List<AbxFKDbRecord> getRecordList() {
        if (recordList == null) {
            recordList = new ArrayList<AbxFKDbRecord>();
        }
        return this.recordList;
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
     * Recupera il valore della proprietà optionGetRecord.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionGetRecord() {
        return optionGetRecord;
    }

    /**
     * Imposta il valore della proprietà optionGetRecord.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionGetRecord(String value) {
        this.optionGetRecord = value;
    }

    /**
     * Recupera il valore della proprietà optionSetFkValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionSetFkValue() {
        return optionSetFkValue;
    }

    /**
     * Imposta il valore della proprietà optionSetFkValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionSetFkValue(String value) {
        this.optionSetFkValue = value;
    }

    /**
     * Gets the value of the fieldMapList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMapList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMapList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxFKFieldMap }
     * 
     * 
     */
    public List<AbxFKFieldMap> getFieldMapList() {
        if (fieldMapList == null) {
            fieldMapList = new ArrayList<AbxFKFieldMap>();
        }
        return this.fieldMapList;
    }

    /**
     * Gets the value of the tableFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxFKTableFields }
     * 
     * 
     */
    public List<AbxFKTableFields> getTableFieldList() {
        if (tableFieldList == null) {
            tableFieldList = new ArrayList<AbxFKTableFields>();
        }
        return this.tableFieldList;
    }

    /**
     * Recupera il valore della proprietà remoteDatabase.
     * 
     * @return
     *     possible object is
     *     {@link AbxRmDatabaseList }
     *     
     */
    public AbxRmDatabaseList getRemoteDatabase() {
        return remoteDatabase;
    }

    /**
     * Imposta il valore della proprietà remoteDatabase.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxRmDatabaseList }
     *     
     */
    public void setRemoteDatabase(AbxRmDatabaseList value) {
        this.remoteDatabase = value;
    }

    /**
     * Recupera il valore della proprietà remoteTable.
     * 
     * @return
     *     possible object is
     *     {@link AbxRmTableList }
     *     
     */
    public AbxRmTableList getRemoteTable() {
        return remoteTable;
    }

    /**
     * Imposta il valore della proprietà remoteTable.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxRmTableList }
     *     
     */
    public void setRemoteTable(AbxRmTableList value) {
        this.remoteTable = value;
    }

    /**
     * Recupera il valore della proprietà remoteView.
     * 
     * @return
     *     possible object is
     *     {@link AbxRmViewList }
     *     
     */
    public AbxRmViewList getRemoteView() {
        return remoteView;
    }

    /**
     * Imposta il valore della proprietà remoteView.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxRmViewList }
     *     
     */
    public void setRemoteView(AbxRmViewList value) {
        this.remoteView = value;
    }

    /**
     * Recupera il valore della proprietà remoteField.
     * 
     * @return
     *     possible object is
     *     {@link AbxRmFieldList }
     *     
     */
    public AbxRmFieldList getRemoteField() {
        return remoteField;
    }

    /**
     * Imposta il valore della proprietà remoteField.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxRmFieldList }
     *     
     */
    public void setRemoteField(AbxRmFieldList value) {
        this.remoteField = value;
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
