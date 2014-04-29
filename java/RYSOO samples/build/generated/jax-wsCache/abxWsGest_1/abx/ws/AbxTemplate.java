
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxTemplate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxTemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allDescription" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="joinWithType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{http://ws.abx/}abxFieldList"/>
 *         &lt;element name="joinWithName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="revisionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="collation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="expression" type="{http://ws.abx/}abxExpressionList"/>
 *         &lt;element name="barcodePrefix" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="enableProtocol" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permission" type="{http://ws.abx/}abxPermission"/>
 *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dynorgEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxTemplate", propOrder = {
    "name",
    "defaultLanguage",
    "description",
    "allDescription",
    "joinWithType",
    "fields",
    "joinWithName",
    "revisionEnabled",
    "collation",
    "expression",
    "barcodePrefix",
    "enableProtocol",
    "permission",
    "objName",
    "dynorgEnabled"
})
public class AbxTemplate {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(required = true)
    protected List<AbxTemplate.AllDescription> allDescription;
    @XmlElement(required = true)
    protected String joinWithType;
    @XmlElement(required = true)
    protected AbxFieldList fields;
    @XmlElement(required = true)
    protected String joinWithName;
    protected boolean revisionEnabled;
    @XmlElement(required = true)
    protected String collation;
    @XmlElement(required = true)
    protected AbxExpressionList expression;
    @XmlElement(required = true)
    protected String barcodePrefix;
    protected boolean enableProtocol;
    @XmlElement(required = true)
    protected AbxPermission permission;
    @XmlElement(required = true)
    protected String objName;
    protected boolean dynorgEnabled;

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
     * Recupera il valore della proprietà defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Imposta il valore della proprietà defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
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
     * Gets the value of the allDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxTemplate.AllDescription }
     * 
     * 
     */
    public List<AbxTemplate.AllDescription> getAllDescription() {
        if (allDescription == null) {
            allDescription = new ArrayList<AbxTemplate.AllDescription>();
        }
        return this.allDescription;
    }

    /**
     * Recupera il valore della proprietà joinWithType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinWithType() {
        return joinWithType;
    }

    /**
     * Imposta il valore della proprietà joinWithType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinWithType(String value) {
        this.joinWithType = value;
    }

    /**
     * Recupera il valore della proprietà fields.
     * 
     * @return
     *     possible object is
     *     {@link AbxFieldList }
     *     
     */
    public AbxFieldList getFields() {
        return fields;
    }

    /**
     * Imposta il valore della proprietà fields.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFieldList }
     *     
     */
    public void setFields(AbxFieldList value) {
        this.fields = value;
    }

    /**
     * Recupera il valore della proprietà joinWithName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJoinWithName() {
        return joinWithName;
    }

    /**
     * Imposta il valore della proprietà joinWithName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJoinWithName(String value) {
        this.joinWithName = value;
    }

    /**
     * Recupera il valore della proprietà revisionEnabled.
     * 
     */
    public boolean isRevisionEnabled() {
        return revisionEnabled;
    }

    /**
     * Imposta il valore della proprietà revisionEnabled.
     * 
     */
    public void setRevisionEnabled(boolean value) {
        this.revisionEnabled = value;
    }

    /**
     * Recupera il valore della proprietà collation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollation() {
        return collation;
    }

    /**
     * Imposta il valore della proprietà collation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollation(String value) {
        this.collation = value;
    }

    /**
     * Recupera il valore della proprietà expression.
     * 
     * @return
     *     possible object is
     *     {@link AbxExpressionList }
     *     
     */
    public AbxExpressionList getExpression() {
        return expression;
    }

    /**
     * Imposta il valore della proprietà expression.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxExpressionList }
     *     
     */
    public void setExpression(AbxExpressionList value) {
        this.expression = value;
    }

    /**
     * Recupera il valore della proprietà barcodePrefix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcodePrefix() {
        return barcodePrefix;
    }

    /**
     * Imposta il valore della proprietà barcodePrefix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcodePrefix(String value) {
        this.barcodePrefix = value;
    }

    /**
     * Recupera il valore della proprietà enableProtocol.
     * 
     */
    public boolean isEnableProtocol() {
        return enableProtocol;
    }

    /**
     * Imposta il valore della proprietà enableProtocol.
     * 
     */
    public void setEnableProtocol(boolean value) {
        this.enableProtocol = value;
    }

    /**
     * Recupera il valore della proprietà permission.
     * 
     * @return
     *     possible object is
     *     {@link AbxPermission }
     *     
     */
    public AbxPermission getPermission() {
        return permission;
    }

    /**
     * Imposta il valore della proprietà permission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxPermission }
     *     
     */
    public void setPermission(AbxPermission value) {
        this.permission = value;
    }

    /**
     * Recupera il valore della proprietà objName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Imposta il valore della proprietà objName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Recupera il valore della proprietà dynorgEnabled.
     * 
     */
    public boolean isDynorgEnabled() {
        return dynorgEnabled;
    }

    /**
     * Imposta il valore della proprietà dynorgEnabled.
     * 
     */
    public void setDynorgEnabled(boolean value) {
        this.dynorgEnabled = value;
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
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "language",
        "description"
    })
    public static class AllDescription {

        @XmlElement(required = true)
        protected String language;
        @XmlElement(required = true)
        protected String description;

        /**
         * Recupera il valore della proprietà language.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Imposta il valore della proprietà language.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
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

    }

}
