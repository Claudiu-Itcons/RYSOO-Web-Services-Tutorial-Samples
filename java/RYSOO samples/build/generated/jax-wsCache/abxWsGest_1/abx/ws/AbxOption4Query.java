
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxOption4Query complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxOption4Query">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rootContainerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="deepLevel" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="fieldList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="selectOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sortFieldList" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isDataId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxOption4Query", propOrder = {
    "rootContainerName",
    "deepLevel",
    "fieldList",
    "selectOption",
    "masterID",
    "sortFieldList"
})
public class AbxOption4Query {

    @XmlElement(required = true)
    protected String rootContainerName;
    @XmlSchemaType(name = "unsignedInt")
    protected long deepLevel;
    @XmlElement(required = true)
    protected List<AbxOption4Query.FieldList> fieldList;
    @XmlElement(required = true)
    protected String selectOption;
    @XmlElement(required = true)
    protected String masterID;
    @XmlElement(nillable = true)
    protected List<AbxOption4Query.SortFieldList> sortFieldList;

    /**
     * Recupera il valore della proprietà rootContainerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootContainerName() {
        return rootContainerName;
    }

    /**
     * Imposta il valore della proprietà rootContainerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootContainerName(String value) {
        this.rootContainerName = value;
    }

    /**
     * Recupera il valore della proprietà deepLevel.
     * 
     */
    public long getDeepLevel() {
        return deepLevel;
    }

    /**
     * Imposta il valore della proprietà deepLevel.
     * 
     */
    public void setDeepLevel(long value) {
        this.deepLevel = value;
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
     * {@link AbxOption4Query.FieldList }
     * 
     * 
     */
    public List<AbxOption4Query.FieldList> getFieldList() {
        if (fieldList == null) {
            fieldList = new ArrayList<AbxOption4Query.FieldList>();
        }
        return this.fieldList;
    }

    /**
     * Recupera il valore della proprietà selectOption.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectOption() {
        return selectOption;
    }

    /**
     * Imposta il valore della proprietà selectOption.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectOption(String value) {
        this.selectOption = value;
    }

    /**
     * Recupera il valore della proprietà masterID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterID() {
        return masterID;
    }

    /**
     * Imposta il valore della proprietà masterID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterID(String value) {
        this.masterID = value;
    }

    /**
     * Gets the value of the sortFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxOption4Query.SortFieldList }
     * 
     * 
     */
    public List<AbxOption4Query.SortFieldList> getSortFieldList() {
        if (sortFieldList == null) {
            sortFieldList = new ArrayList<AbxOption4Query.SortFieldList>();
        }
        return this.sortFieldList;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fieldName"
    })
    public static class FieldList {

        @XmlElement(required = true)
        protected String fieldName;

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

    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isDataId" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="sortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fieldName",
        "isDataId",
        "sortOrder"
    })
    public static class SortFieldList {

        @XmlElement(required = true)
        protected String fieldName;
        protected boolean isDataId;
        @XmlElement(required = true)
        protected String sortOrder;

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
         * Recupera il valore della proprietà isDataId.
         * 
         */
        public boolean isIsDataId() {
            return isDataId;
        }

        /**
         * Imposta il valore della proprietà isDataId.
         * 
         */
        public void setIsDataId(boolean value) {
            this.isDataId = value;
        }

        /**
         * Recupera il valore della proprietà sortOrder.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSortOrder() {
            return sortOrder;
        }

        /**
         * Imposta il valore della proprietà sortOrder.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSortOrder(String value) {
            this.sortOrder = value;
        }

    }

}
