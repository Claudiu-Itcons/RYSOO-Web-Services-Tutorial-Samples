
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxArchSostRule complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxArchSostRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abxArchSostRuleFilters" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolDateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolDateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolNumFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolNumTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fromValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="toValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="shiftFromValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="shiftToValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="replaceDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="abxArchSostRuleMap" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mapId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="metadataClasseDocumentaleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="classeDocumentaleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="getSignedFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="zipFile" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxArchSostRule", propOrder = {
    "abxArchSostRuleFilters",
    "abxArchSostRuleMap",
    "id",
    "name",
    "instanceName",
    "classeDocumentaleName",
    "getSignedFile",
    "zipFile"
})
public class AbxArchSostRule {

    @XmlElement(required = true)
    protected List<AbxArchSostRule.AbxArchSostRuleFilters> abxArchSostRuleFilters;
    @XmlElement(required = true)
    protected List<AbxArchSostRule.AbxArchSostRuleMap> abxArchSostRuleMap;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(required = true)
    protected String classeDocumentaleName;
    protected boolean getSignedFile;
    protected boolean zipFile;

    /**
     * Gets the value of the abxArchSostRuleFilters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abxArchSostRuleFilters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbxArchSostRuleFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxArchSostRule.AbxArchSostRuleFilters }
     * 
     * 
     */
    public List<AbxArchSostRule.AbxArchSostRuleFilters> getAbxArchSostRuleFilters() {
        if (abxArchSostRuleFilters == null) {
            abxArchSostRuleFilters = new ArrayList<AbxArchSostRule.AbxArchSostRuleFilters>();
        }
        return this.abxArchSostRuleFilters;
    }

    /**
     * Gets the value of the abxArchSostRuleMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abxArchSostRuleMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbxArchSostRuleMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxArchSostRule.AbxArchSostRuleMap }
     * 
     * 
     */
    public List<AbxArchSostRule.AbxArchSostRuleMap> getAbxArchSostRuleMap() {
        if (abxArchSostRuleMap == null) {
            abxArchSostRuleMap = new ArrayList<AbxArchSostRule.AbxArchSostRuleMap>();
        }
        return this.abxArchSostRuleMap;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

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
     * Recupera il valore della proprietà classeDocumentaleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClasseDocumentaleName() {
        return classeDocumentaleName;
    }

    /**
     * Imposta il valore della proprietà classeDocumentaleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClasseDocumentaleName(String value) {
        this.classeDocumentaleName = value;
    }

    /**
     * Recupera il valore della proprietà getSignedFile.
     * 
     */
    public boolean isGetSignedFile() {
        return getSignedFile;
    }

    /**
     * Imposta il valore della proprietà getSignedFile.
     * 
     */
    public void setGetSignedFile(boolean value) {
        this.getSignedFile = value;
    }

    /**
     * Recupera il valore della proprietà zipFile.
     * 
     */
    public boolean isZipFile() {
        return zipFile;
    }

    /**
     * Imposta il valore della proprietà zipFile.
     * 
     */
    public void setZipFile(boolean value) {
        this.zipFile = value;
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
     *         &lt;element name="filterId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolDateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolDateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolNumFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolNumTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fromValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="toValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="shiftFromValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="shiftToValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="replaceDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "filterId",
        "ruleId",
        "fieldName",
        "protocolID",
        "protocolDateFrom",
        "protocolDateTo",
        "protocolNumFrom",
        "protocolNumTo",
        "fromValue",
        "toValue",
        "shiftFromValue",
        "shiftToValue",
        "replaceDate"
    })
    public static class AbxArchSostRuleFilters {

        @XmlElement(required = true)
        protected String filterId;
        @XmlElement(required = true)
        protected String ruleId;
        @XmlElement(required = true)
        protected String fieldName;
        @XmlElement(required = true)
        protected String protocolID;
        @XmlElement(required = true)
        protected String protocolDateFrom;
        @XmlElement(required = true)
        protected String protocolDateTo;
        @XmlElement(required = true)
        protected String protocolNumFrom;
        @XmlElement(required = true)
        protected String protocolNumTo;
        @XmlElement(required = true)
        protected String fromValue;
        @XmlElement(required = true)
        protected String toValue;
        protected int shiftFromValue;
        protected int shiftToValue;
        protected boolean replaceDate;

        /**
         * Recupera il valore della proprietà filterId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFilterId() {
            return filterId;
        }

        /**
         * Imposta il valore della proprietà filterId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFilterId(String value) {
            this.filterId = value;
        }

        /**
         * Recupera il valore della proprietà ruleId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleId() {
            return ruleId;
        }

        /**
         * Imposta il valore della proprietà ruleId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleId(String value) {
            this.ruleId = value;
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
         * Recupera il valore della proprietà protocolID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolID() {
            return protocolID;
        }

        /**
         * Imposta il valore della proprietà protocolID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolID(String value) {
            this.protocolID = value;
        }

        /**
         * Recupera il valore della proprietà protocolDateFrom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolDateFrom() {
            return protocolDateFrom;
        }

        /**
         * Imposta il valore della proprietà protocolDateFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolDateFrom(String value) {
            this.protocolDateFrom = value;
        }

        /**
         * Recupera il valore della proprietà protocolDateTo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolDateTo() {
            return protocolDateTo;
        }

        /**
         * Imposta il valore della proprietà protocolDateTo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolDateTo(String value) {
            this.protocolDateTo = value;
        }

        /**
         * Recupera il valore della proprietà protocolNumFrom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolNumFrom() {
            return protocolNumFrom;
        }

        /**
         * Imposta il valore della proprietà protocolNumFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolNumFrom(String value) {
            this.protocolNumFrom = value;
        }

        /**
         * Recupera il valore della proprietà protocolNumTo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolNumTo() {
            return protocolNumTo;
        }

        /**
         * Imposta il valore della proprietà protocolNumTo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolNumTo(String value) {
            this.protocolNumTo = value;
        }

        /**
         * Recupera il valore della proprietà fromValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromValue() {
            return fromValue;
        }

        /**
         * Imposta il valore della proprietà fromValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromValue(String value) {
            this.fromValue = value;
        }

        /**
         * Recupera il valore della proprietà toValue.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToValue() {
            return toValue;
        }

        /**
         * Imposta il valore della proprietà toValue.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToValue(String value) {
            this.toValue = value;
        }

        /**
         * Recupera il valore della proprietà shiftFromValue.
         * 
         */
        public int getShiftFromValue() {
            return shiftFromValue;
        }

        /**
         * Imposta il valore della proprietà shiftFromValue.
         * 
         */
        public void setShiftFromValue(int value) {
            this.shiftFromValue = value;
        }

        /**
         * Recupera il valore della proprietà shiftToValue.
         * 
         */
        public int getShiftToValue() {
            return shiftToValue;
        }

        /**
         * Imposta il valore della proprietà shiftToValue.
         * 
         */
        public void setShiftToValue(int value) {
            this.shiftToValue = value;
        }

        /**
         * Recupera il valore della proprietà replaceDate.
         * 
         */
        public boolean isReplaceDate() {
            return replaceDate;
        }

        /**
         * Imposta il valore della proprietà replaceDate.
         * 
         */
        public void setReplaceDate(boolean value) {
            this.replaceDate = value;
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
     *         &lt;element name="mapId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ruleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="metadataClasseDocumentaleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "mapId",
        "ruleId",
        "fieldName",
        "isProtocol",
        "metadataClasseDocumentaleName"
    })
    public static class AbxArchSostRuleMap {

        @XmlElement(required = true)
        protected String mapId;
        @XmlElement(required = true)
        protected String ruleId;
        @XmlElement(required = true)
        protected String fieldName;
        protected boolean isProtocol;
        @XmlElement(required = true)
        protected String metadataClasseDocumentaleName;

        /**
         * Recupera il valore della proprietà mapId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMapId() {
            return mapId;
        }

        /**
         * Imposta il valore della proprietà mapId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMapId(String value) {
            this.mapId = value;
        }

        /**
         * Recupera il valore della proprietà ruleId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleId() {
            return ruleId;
        }

        /**
         * Imposta il valore della proprietà ruleId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleId(String value) {
            this.ruleId = value;
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
         * Recupera il valore della proprietà isProtocol.
         * 
         */
        public boolean isIsProtocol() {
            return isProtocol;
        }

        /**
         * Imposta il valore della proprietà isProtocol.
         * 
         */
        public void setIsProtocol(boolean value) {
            this.isProtocol = value;
        }

        /**
         * Recupera il valore della proprietà metadataClasseDocumentaleName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadataClasseDocumentaleName() {
            return metadataClasseDocumentaleName;
        }

        /**
         * Imposta il valore della proprietà metadataClasseDocumentaleName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadataClasseDocumentaleName(String value) {
            this.metadataClasseDocumentaleName = value;
        }

    }

}
