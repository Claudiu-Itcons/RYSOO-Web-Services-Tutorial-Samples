
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxProtocolUse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxProtocolUse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocolName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberLength" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="resultFormatted" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filters" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numberFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="numberTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="protocolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abxProtocolUse", propOrder = {
    "serverId",
    "protocolId",
    "protocolName",
    "date",
    "number",
    "numberLength",
    "resultFormatted",
    "filters"
})
public class AbxProtocolUse {

    @XmlElement(required = true)
    protected String serverId;
    @XmlElement(required = true)
    protected String protocolId;
    @XmlElement(required = true)
    protected String protocolName;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String number;
    protected int numberLength;
    @XmlElement(required = true)
    protected String resultFormatted;
    @XmlElement(required = true)
    protected List<AbxProtocolUse.Filters> filters;

    /**
     * Recupera il valore della proprietà serverId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerId() {
        return serverId;
    }

    /**
     * Imposta il valore della proprietà serverId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerId(String value) {
        this.serverId = value;
    }

    /**
     * Recupera il valore della proprietà protocolId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolId() {
        return protocolId;
    }

    /**
     * Imposta il valore della proprietà protocolId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolId(String value) {
        this.protocolId = value;
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
     * Recupera il valore della proprietà date.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Imposta il valore della proprietà date.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Recupera il valore della proprietà number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Imposta il valore della proprietà number.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Recupera il valore della proprietà resultFormatted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultFormatted() {
        return resultFormatted;
    }

    /**
     * Imposta il valore della proprietà resultFormatted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultFormatted(String value) {
        this.resultFormatted = value;
    }

    /**
     * Gets the value of the filters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxProtocolUse.Filters }
     * 
     * 
     */
    public List<AbxProtocolUse.Filters> getFilters() {
        if (filters == null) {
            filters = new ArrayList<AbxProtocolUse.Filters>();
        }
        return this.filters;
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
     *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dateTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numberFrom" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="numberTo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="protocolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "serverId",
        "dateFrom",
        "dateTo",
        "numberFrom",
        "numberTo",
        "protocolId"
    })
    public static class Filters {

        @XmlElement(required = true)
        protected String serverId;
        @XmlElement(required = true)
        protected String dateFrom;
        @XmlElement(required = true)
        protected String dateTo;
        @XmlElement(required = true)
        protected String numberFrom;
        @XmlElement(required = true)
        protected String numberTo;
        @XmlElement(required = true)
        protected String protocolId;

        /**
         * Recupera il valore della proprietà serverId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServerId() {
            return serverId;
        }

        /**
         * Imposta il valore della proprietà serverId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServerId(String value) {
            this.serverId = value;
        }

        /**
         * Recupera il valore della proprietà dateFrom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateFrom() {
            return dateFrom;
        }

        /**
         * Imposta il valore della proprietà dateFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateFrom(String value) {
            this.dateFrom = value;
        }

        /**
         * Recupera il valore della proprietà dateTo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateTo() {
            return dateTo;
        }

        /**
         * Imposta il valore della proprietà dateTo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateTo(String value) {
            this.dateTo = value;
        }

        /**
         * Recupera il valore della proprietà numberFrom.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberFrom() {
            return numberFrom;
        }

        /**
         * Imposta il valore della proprietà numberFrom.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberFrom(String value) {
            this.numberFrom = value;
        }

        /**
         * Recupera il valore della proprietà numberTo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberTo() {
            return numberTo;
        }

        /**
         * Imposta il valore della proprietà numberTo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberTo(String value) {
            this.numberTo = value;
        }

        /**
         * Recupera il valore della proprietà protocolId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtocolId() {
            return protocolId;
        }

        /**
         * Imposta il valore della proprietà protocolId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtocolId(String value) {
            this.protocolId = value;
        }

    }

}
