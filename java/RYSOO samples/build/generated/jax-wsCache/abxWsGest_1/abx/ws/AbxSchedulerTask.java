
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSchedulerTask complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSchedulerTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abxSchedule" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="recurence" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="isOneTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="daysOfTheWeek" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="months" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="daysOfTheMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="lastRun" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="audit_message_code_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="optional_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSchedulerTask", propOrder = {
    "abxSchedule",
    "name",
    "description",
    "type",
    "configXML",
    "id",
    "appTaskId"
})
public class AbxSchedulerTask {

    @XmlElement(required = true)
    protected List<AbxSchedulerTask.AbxSchedule> abxSchedule;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String type;
    @XmlElement(required = true)
    protected String configXML;
    @XmlElement(required = true)
    protected String id;
    protected String appTaskId;

    /**
     * Gets the value of the abxSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the abxSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAbxSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSchedulerTask.AbxSchedule }
     * 
     * 
     */
    public List<AbxSchedulerTask.AbxSchedule> getAbxSchedule() {
        if (abxSchedule == null) {
            abxSchedule = new ArrayList<AbxSchedulerTask.AbxSchedule>();
        }
        return this.abxSchedule;
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
     * Recupera il valore della proprietà configXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigXML() {
        return configXML;
    }

    /**
     * Imposta il valore della proprietà configXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigXML(String value) {
        this.configXML = value;
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
     * Recupera il valore della proprietà appTaskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTaskId() {
        return appTaskId;
    }

    /**
     * Imposta il valore della proprietà appTaskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTaskId(String value) {
        this.appTaskId = value;
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
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="recurence" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="isOneTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="daysOfTheWeek" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="months" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="daysOfTheMonth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="lastRun" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="option" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="audit_message_code_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="optional_message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "id",
        "startDate",
        "recurence",
        "isOneTime",
        "daysOfTheWeek",
        "months",
        "daysOfTheMonth",
        "status",
        "type",
        "lastRun",
        "option",
        "auditMessageCodeId",
        "optionalMessage"
    })
    public static class AbxSchedule {

        @XmlElement(required = true)
        protected String id;
        @XmlElement(required = true)
        protected String startDate;
        protected int recurence;
        protected boolean isOneTime;
        @XmlElement(required = true)
        protected String daysOfTheWeek;
        @XmlElement(required = true)
        protected String months;
        @XmlElement(required = true)
        protected String daysOfTheMonth;
        protected int status;
        protected int type;
        @XmlElement(required = true)
        protected String lastRun;
        @XmlElement(required = true)
        protected String option;
        @XmlElement(name = "audit_message_code_id")
        protected String auditMessageCodeId;
        @XmlElement(name = "optional_message")
        protected String optionalMessage;

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
         * Recupera il valore della proprietà startDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDate() {
            return startDate;
        }

        /**
         * Imposta il valore della proprietà startDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDate(String value) {
            this.startDate = value;
        }

        /**
         * Recupera il valore della proprietà recurence.
         * 
         */
        public int getRecurence() {
            return recurence;
        }

        /**
         * Imposta il valore della proprietà recurence.
         * 
         */
        public void setRecurence(int value) {
            this.recurence = value;
        }

        /**
         * Recupera il valore della proprietà isOneTime.
         * 
         */
        public boolean isIsOneTime() {
            return isOneTime;
        }

        /**
         * Imposta il valore della proprietà isOneTime.
         * 
         */
        public void setIsOneTime(boolean value) {
            this.isOneTime = value;
        }

        /**
         * Recupera il valore della proprietà daysOfTheWeek.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysOfTheWeek() {
            return daysOfTheWeek;
        }

        /**
         * Imposta il valore della proprietà daysOfTheWeek.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysOfTheWeek(String value) {
            this.daysOfTheWeek = value;
        }

        /**
         * Recupera il valore della proprietà months.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonths() {
            return months;
        }

        /**
         * Imposta il valore della proprietà months.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonths(String value) {
            this.months = value;
        }

        /**
         * Recupera il valore della proprietà daysOfTheMonth.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysOfTheMonth() {
            return daysOfTheMonth;
        }

        /**
         * Imposta il valore della proprietà daysOfTheMonth.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysOfTheMonth(String value) {
            this.daysOfTheMonth = value;
        }

        /**
         * Recupera il valore della proprietà status.
         * 
         */
        public int getStatus() {
            return status;
        }

        /**
         * Imposta il valore della proprietà status.
         * 
         */
        public void setStatus(int value) {
            this.status = value;
        }

        /**
         * Recupera il valore della proprietà type.
         * 
         */
        public int getType() {
            return type;
        }

        /**
         * Imposta il valore della proprietà type.
         * 
         */
        public void setType(int value) {
            this.type = value;
        }

        /**
         * Recupera il valore della proprietà lastRun.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastRun() {
            return lastRun;
        }

        /**
         * Imposta il valore della proprietà lastRun.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastRun(String value) {
            this.lastRun = value;
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
         * Recupera il valore della proprietà auditMessageCodeId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuditMessageCodeId() {
            return auditMessageCodeId;
        }

        /**
         * Imposta il valore della proprietà auditMessageCodeId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuditMessageCodeId(String value) {
            this.auditMessageCodeId = value;
        }

        /**
         * Recupera il valore della proprietà optionalMessage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOptionalMessage() {
            return optionalMessage;
        }

        /**
         * Imposta il valore della proprietà optionalMessage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOptionalMessage(String value) {
            this.optionalMessage = value;
        }

    }

}
