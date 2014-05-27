
package org.netbeans.xml.schema.abxprotocol;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxProtocol complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxProtocol">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="allDescription" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="checkDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="checkSequenceDate" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="annualReset" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idProtocol" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocolDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxProtocol", propOrder = {
    "allDescription",
    "defaultLanguage",
    "messageId",
    "protocolName",
    "checkDate",
    "checkSequenceDate",
    "annualReset",
    "format",
    "note",
    "idProtocol",
    "protocolDesc",
    "numberLength"
})
public class AbxProtocol {

    @XmlElement(required = true)
    protected List<AbxProtocol.AllDescription> allDescription;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(required = true)
    protected String messageId;
    @XmlElement(required = true)
    protected String protocolName;
    protected boolean checkDate;
    protected boolean checkSequenceDate;
    protected boolean annualReset;
    @XmlElement(required = true)
    protected String format;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(required = true)
    protected String idProtocol;
    @XmlElement(required = true)
    protected String protocolDesc;
    protected int numberLength;

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
     * {@link AbxProtocol.AllDescription }
     * 
     * 
     */
    public List<AbxProtocol.AllDescription> getAllDescription() {
        if (allDescription == null) {
            allDescription = new ArrayList<AbxProtocol.AllDescription>();
        }
        return this.allDescription;
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
     * Recupera il valore della proprietà messageId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Imposta il valore della proprietà messageId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Recupera il valore della proprietà protocolName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolName() {
        return protocolName;
    }

    /**
     * Imposta il valore della proprietà protocolName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolName(String value) {
        this.protocolName = value;
    }

    /**
     * Recupera il valore della proprietà checkDate.
     * 
     */
    public boolean isCheckDate() {
        return checkDate;
    }

    /**
     * Imposta il valore della proprietà checkDate.
     * 
     */
    public void setCheckDate(boolean value) {
        this.checkDate = value;
    }

    /**
     * Recupera il valore della proprietà checkSequenceDate.
     * 
     */
    public boolean isCheckSequenceDate() {
        return checkSequenceDate;
    }

    /**
     * Imposta il valore della proprietà checkSequenceDate.
     * 
     */
    public void setCheckSequenceDate(boolean value) {
        this.checkSequenceDate = value;
    }

    /**
     * Recupera il valore della proprietà annualReset.
     * 
     */
    public boolean isAnnualReset() {
        return annualReset;
    }

    /**
     * Imposta il valore della proprietà annualReset.
     * 
     */
    public void setAnnualReset(boolean value) {
        this.annualReset = value;
    }

    /**
     * Recupera il valore della proprietà format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Imposta il valore della proprietà format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
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
     * Recupera il valore della proprietà idProtocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdProtocol() {
        return idProtocol;
    }

    /**
     * Imposta il valore della proprietà idProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdProtocol(String value) {
        this.idProtocol = value;
    }

    /**
     * Recupera il valore della proprietà protocolDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolDesc() {
        return protocolDesc;
    }

    /**
     * Imposta il valore della proprietà protocolDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolDesc(String value) {
        this.protocolDesc = value;
    }

    /**
     * Recupera il valore della proprietà numberLength.
     * 
     */
    public int getNumberLength() {
        return numberLength;
    }

    /**
     * Imposta il valore della proprietà numberLength.
     * 
     */
    public void setNumberLength(int value) {
        this.numberLength = value;
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
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/>
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

        @XmlElement(namespace = "", required = true)
        protected String language;
        @XmlElement(namespace = "", required = true)
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
