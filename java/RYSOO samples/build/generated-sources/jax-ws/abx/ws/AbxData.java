
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per abxData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="protocol" type="{http://ws.abx/}abxProtocolUse"/>
 *         &lt;element name="totRecordFound" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="securityId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="masterDataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detailData" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="detailInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="detailDataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allPermission" type="{http://ws.abx/}abxAllPermission"/>
 *         &lt;element name="creationTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="modifyTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxData", propOrder = {
    "data",
    "protocol",
    "totRecordFound",
    "dataId",
    "securityId",
    "username",
    "masterDataId",
    "detailData",
    "note",
    "allPermission",
    "creationTimeStamp",
    "modifyTimeStamp"
})
public class AbxData {

    @XmlElement(required = true)
    protected List<AbxData.Data> data;
    @XmlElement(required = true)
    protected AbxProtocolUse protocol;
    @XmlElement(required = true)
    protected String totRecordFound;
    @XmlElement(required = true)
    protected String dataId;
    @XmlElement(required = true)
    protected String securityId;
    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String masterDataId;
    @XmlElement(required = true)
    protected List<AbxData.DetailData> detailData;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(required = true)
    protected AbxAllPermission allPermission;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimeStamp;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifyTimeStamp;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxData.Data }
     * 
     * 
     */
    public List<AbxData.Data> getData() {
        if (data == null) {
            data = new ArrayList<AbxData.Data>();
        }
        return this.data;
    }

    /**
     * Recupera il valore della proprietà protocol.
     * 
     * @return
     *     possible object is
     *     {@link AbxProtocolUse }
     *     
     */
    public AbxProtocolUse getProtocol() {
        return protocol;
    }

    /**
     * Imposta il valore della proprietà protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocolUse }
     *     
     */
    public void setProtocol(AbxProtocolUse value) {
        this.protocol = value;
    }

    /**
     * Recupera il valore della proprietà totRecordFound.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotRecordFound() {
        return totRecordFound;
    }

    /**
     * Imposta il valore della proprietà totRecordFound.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotRecordFound(String value) {
        this.totRecordFound = value;
    }

    /**
     * Recupera il valore della proprietà dataId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * Imposta il valore della proprietà dataId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataId(String value) {
        this.dataId = value;
    }

    /**
     * Recupera il valore della proprietà securityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityId() {
        return securityId;
    }

    /**
     * Imposta il valore della proprietà securityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityId(String value) {
        this.securityId = value;
    }

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Recupera il valore della proprietà masterDataId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterDataId() {
        return masterDataId;
    }

    /**
     * Imposta il valore della proprietà masterDataId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterDataId(String value) {
        this.masterDataId = value;
    }

    /**
     * Gets the value of the detailData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detailData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetailData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxData.DetailData }
     * 
     * 
     */
    public List<AbxData.DetailData> getDetailData() {
        if (detailData == null) {
            detailData = new ArrayList<AbxData.DetailData>();
        }
        return this.detailData;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà allPermission.
     * 
     * @return
     *     possible object is
     *     {@link AbxAllPermission }
     *     
     */
    public AbxAllPermission getAllPermission() {
        return allPermission;
    }

    /**
     * Imposta il valore della proprietà allPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxAllPermission }
     *     
     */
    public void setAllPermission(AbxAllPermission value) {
        this.allPermission = value;
    }

    /**
     * Recupera il valore della proprietà creationTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimeStamp() {
        return creationTimeStamp;
    }

    /**
     * Imposta il valore della proprietà creationTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimeStamp(XMLGregorianCalendar value) {
        this.creationTimeStamp = value;
    }

    /**
     * Recupera il valore della proprietà modifyTimeStamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyTimeStamp() {
        return modifyTimeStamp;
    }

    /**
     * Imposta il valore della proprietà modifyTimeStamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyTimeStamp(XMLGregorianCalendar value) {
        this.modifyTimeStamp = value;
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
     *         &lt;element name="field" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "field",
        "value"
    })
    public static class Data {

        @XmlElement(required = true)
        protected String field;
        @XmlElement(required = true)
        protected String value;

        /**
         * Recupera il valore della proprietà field.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getField() {
            return field;
        }

        /**
         * Imposta il valore della proprietà field.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setField(String value) {
            this.field = value;
        }

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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
     *         &lt;element name="detailInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="detailDataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "detailInstanceName",
        "detailDataId"
    })
    public static class DetailData {

        @XmlElement(required = true)
        protected String detailInstanceName;
        @XmlElement(required = true)
        protected String detailDataId;

        /**
         * Recupera il valore della proprietà detailInstanceName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailInstanceName() {
            return detailInstanceName;
        }

        /**
         * Imposta il valore della proprietà detailInstanceName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailInstanceName(String value) {
            this.detailInstanceName = value;
        }

        /**
         * Recupera il valore della proprietà detailDataId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDetailDataId() {
            return detailDataId;
        }

        /**
         * Imposta il valore della proprietà detailDataId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDetailDataId(String value) {
            this.detailDataId = value;
        }

    }

}
