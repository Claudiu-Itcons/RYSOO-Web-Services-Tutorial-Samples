
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxField complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxField">
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
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="lenght" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="precision" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OptionDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allOptionDescription" maxOccurs="unbounded">
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
 *         &lt;element name="extended" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="property1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="property2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="property3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="property4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="obbligatorio" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nascosto" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="univoco" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filter" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="filterinterval" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="vistaview" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showInWorkList" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="displayindex" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="permission" type="{http://ws.abx/}abxPermission"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxField", propOrder = {
    "name",
    "defaultLanguage",
    "description",
    "allDescription",
    "type",
    "lenght",
    "precision",
    "option",
    "optionDescription",
    "allOptionDescription",
    "extended",
    "obbligatorio",
    "nascosto",
    "univoco",
    "filter",
    "filterinterval",
    "vistaview",
    "showInWorkList",
    "displayindex",
    "permission"
})
public class AbxField {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(required = true)
    protected List<AbxField.AllDescription> allDescription;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String lenght;
    @XmlElement(required = true)
    protected String precision;
    @XmlElement(required = true)
    protected String option;
    @XmlElement(name = "OptionDescription", required = true)
    protected String optionDescription;
    @XmlElement(required = true)
    protected List<AbxField.AllOptionDescription> allOptionDescription;
    @XmlElement(required = true)
    protected List<AbxField.Extended> extended;
    protected boolean obbligatorio;
    protected boolean nascosto;
    protected boolean univoco;
    protected boolean filter;
    protected boolean filterinterval;
    protected boolean vistaview;
    protected boolean showInWorkList;
    @XmlSchemaType(name = "unsignedInt")
    protected long displayindex;
    @XmlElement(required = true)
    protected AbxPermission permission;

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
     * {@link AbxField.AllDescription }
     * 
     * 
     */
    public List<AbxField.AllDescription> getAllDescription() {
        if (allDescription == null) {
            allDescription = new ArrayList<AbxField.AllDescription>();
        }
        return this.allDescription;
    }

    /**
     * Recupera il valore della proprietà type.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Imposta il valore della proprietà type.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Recupera il valore della proprietà lenght.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLenght() {
        return lenght;
    }

    /**
     * Imposta il valore della proprietà lenght.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLenght(String value) {
        this.lenght = value;
    }

    /**
     * Recupera il valore della proprietà precision.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecision() {
        return precision;
    }

    /**
     * Imposta il valore della proprietà precision.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecision(String value) {
        this.precision = value;
    }

    /**
     * Recupera il valore della proprietà option.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption() {
        return option;
    }

    /**
     * Imposta il valore della proprietà option.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption(String value) {
        this.option = value;
    }

    /**
     * Recupera il valore della proprietà optionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionDescription() {
        return optionDescription;
    }

    /**
     * Imposta il valore della proprietà optionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionDescription(String value) {
        this.optionDescription = value;
    }

    /**
     * Gets the value of the allOptionDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allOptionDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllOptionDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxField.AllOptionDescription }
     * 
     * 
     */
    public List<AbxField.AllOptionDescription> getAllOptionDescription() {
        if (allOptionDescription == null) {
            allOptionDescription = new ArrayList<AbxField.AllOptionDescription>();
        }
        return this.allOptionDescription;
    }

    /**
     * Gets the value of the extended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxField.Extended }
     * 
     * 
     */
    public List<AbxField.Extended> getExtended() {
        if (extended == null) {
            extended = new ArrayList<AbxField.Extended>();
        }
        return this.extended;
    }

    /**
     * Recupera il valore della proprietà obbligatorio.
     * 
     */
    public boolean isObbligatorio() {
        return obbligatorio;
    }

    /**
     * Imposta il valore della proprietà obbligatorio.
     * 
     */
    public void setObbligatorio(boolean value) {
        this.obbligatorio = value;
    }

    /**
     * Recupera il valore della proprietà nascosto.
     * 
     */
    public boolean isNascosto() {
        return nascosto;
    }

    /**
     * Imposta il valore della proprietà nascosto.
     * 
     */
    public void setNascosto(boolean value) {
        this.nascosto = value;
    }

    /**
     * Recupera il valore della proprietà univoco.
     * 
     */
    public boolean isUnivoco() {
        return univoco;
    }

    /**
     * Imposta il valore della proprietà univoco.
     * 
     */
    public void setUnivoco(boolean value) {
        this.univoco = value;
    }

    /**
     * Recupera il valore della proprietà filter.
     * 
     */
    public boolean isFilter() {
        return filter;
    }

    /**
     * Imposta il valore della proprietà filter.
     * 
     */
    public void setFilter(boolean value) {
        this.filter = value;
    }

    /**
     * Recupera il valore della proprietà filterinterval.
     * 
     */
    public boolean isFilterinterval() {
        return filterinterval;
    }

    /**
     * Imposta il valore della proprietà filterinterval.
     * 
     */
    public void setFilterinterval(boolean value) {
        this.filterinterval = value;
    }

    /**
     * Recupera il valore della proprietà vistaview.
     * 
     */
    public boolean isVistaview() {
        return vistaview;
    }

    /**
     * Imposta il valore della proprietà vistaview.
     * 
     */
    public void setVistaview(boolean value) {
        this.vistaview = value;
    }

    /**
     * Recupera il valore della proprietà showInWorkList.
     * 
     */
    public boolean isShowInWorkList() {
        return showInWorkList;
    }

    /**
     * Imposta il valore della proprietà showInWorkList.
     * 
     */
    public void setShowInWorkList(boolean value) {
        this.showInWorkList = value;
    }

    /**
     * Recupera il valore della proprietà displayindex.
     * 
     */
    public long getDisplayindex() {
        return displayindex;
    }

    /**
     * Imposta il valore della proprietà displayindex.
     * 
     */
    public void setDisplayindex(long value) {
        this.displayindex = value;
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
    public static class AllOptionDescription {

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
     *         &lt;element name="property1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="property2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="property3" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="property4" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "property1",
        "property2",
        "property3",
        "property4"
    })
    public static class Extended {

        @XmlElement(required = true)
        protected String property1;
        @XmlElement(required = true)
        protected String property2;
        @XmlElement(required = true)
        protected String property3;
        @XmlElement(required = true)
        protected String property4;

        /**
         * Recupera il valore della proprietà property1.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty1() {
            return property1;
        }

        /**
         * Imposta il valore della proprietà property1.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty1(String value) {
            this.property1 = value;
        }

        /**
         * Recupera il valore della proprietà property2.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty2() {
            return property2;
        }

        /**
         * Imposta il valore della proprietà property2.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty2(String value) {
            this.property2 = value;
        }

        /**
         * Recupera il valore della proprietà property3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty3() {
            return property3;
        }

        /**
         * Imposta il valore della proprietà property3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty3(String value) {
            this.property3 = value;
        }

        /**
         * Recupera il valore della proprietà property4.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty4() {
            return property4;
        }

        /**
         * Imposta il valore della proprietà property4.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty4(String value) {
            this.property4 = value;
        }

    }

}
