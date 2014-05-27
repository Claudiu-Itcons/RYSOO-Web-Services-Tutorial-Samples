
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxClasseDocumentale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxClasseDocumentale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Metadata" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="preserveMaxAge" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="preserveNumDays" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="automaticallySigned" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="automaticallyTimestamped" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="makeISO" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxClasseDocumentale", propOrder = {
    "metadata",
    "name",
    "company",
    "preserveMaxAge",
    "preserveNumDays",
    "automaticallySigned",
    "automaticallyTimestamped",
    "makeISO"
})
public class AbxClasseDocumentale {

    @XmlElement(name = "Metadata", required = true)
    protected List<AbxClasseDocumentale.Metadata> metadata;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String company;
    protected long preserveMaxAge;
    protected long preserveNumDays;
    protected boolean automaticallySigned;
    protected boolean automaticallyTimestamped;
    protected boolean makeISO;

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxClasseDocumentale.Metadata }
     * 
     * 
     */
    public List<AbxClasseDocumentale.Metadata> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<AbxClasseDocumentale.Metadata>();
        }
        return this.metadata;
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
     * Recupera il valore della proprietà company.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Imposta il valore della proprietà company.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Recupera il valore della proprietà preserveMaxAge.
     * 
     */
    public long getPreserveMaxAge() {
        return preserveMaxAge;
    }

    /**
     * Imposta il valore della proprietà preserveMaxAge.
     * 
     */
    public void setPreserveMaxAge(long value) {
        this.preserveMaxAge = value;
    }

    /**
     * Recupera il valore della proprietà preserveNumDays.
     * 
     */
    public long getPreserveNumDays() {
        return preserveNumDays;
    }

    /**
     * Imposta il valore della proprietà preserveNumDays.
     * 
     */
    public void setPreserveNumDays(long value) {
        this.preserveNumDays = value;
    }

    /**
     * Recupera il valore della proprietà automaticallySigned.
     * 
     */
    public boolean isAutomaticallySigned() {
        return automaticallySigned;
    }

    /**
     * Imposta il valore della proprietà automaticallySigned.
     * 
     */
    public void setAutomaticallySigned(boolean value) {
        this.automaticallySigned = value;
    }

    /**
     * Recupera il valore della proprietà automaticallyTimestamped.
     * 
     */
    public boolean isAutomaticallyTimestamped() {
        return automaticallyTimestamped;
    }

    /**
     * Imposta il valore della proprietà automaticallyTimestamped.
     * 
     */
    public void setAutomaticallyTimestamped(boolean value) {
        this.automaticallyTimestamped = value;
    }

    /**
     * Recupera il valore della proprietà makeISO.
     * 
     */
    public boolean isMakeISO() {
        return makeISO;
    }

    /**
     * Imposta il valore della proprietà makeISO.
     * 
     */
    public void setMakeISO(boolean value) {
        this.makeISO = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="optional" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "name",
        "type",
        "index",
        "optional"
    })
    public static class Metadata {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String type;
        protected long index;
        protected boolean optional;

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
         * Recupera il valore della proprietà index.
         * 
         */
        public long getIndex() {
            return index;
        }

        /**
         * Imposta il valore della proprietà index.
         * 
         */
        public void setIndex(long value) {
            this.index = value;
        }

        /**
         * Recupera il valore della proprietà optional.
         * 
         */
        public boolean isOptional() {
            return optional;
        }

        /**
         * Imposta il valore della proprietà optional.
         * 
         */
        public void setOptional(boolean value) {
            this.optional = value;
        }

    }

}
