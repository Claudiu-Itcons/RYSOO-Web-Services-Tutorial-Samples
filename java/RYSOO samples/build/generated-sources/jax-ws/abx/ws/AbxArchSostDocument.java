
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxArchSostDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxArchSostDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedulerDailyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedulerWeeklyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schedulerMonthlyId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tdocDocumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxArchSostDocument", propOrder = {
    "id",
    "schedulerDailyId",
    "schedulerWeeklyId",
    "schedulerMonthlyId",
    "instanceName",
    "dataId",
    "tdocDocumentId"
})
public class AbxArchSostDocument {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String schedulerDailyId;
    @XmlElement(required = true)
    protected String schedulerWeeklyId;
    @XmlElement(required = true)
    protected String schedulerMonthlyId;
    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(required = true)
    protected String dataId;
    @XmlElement(required = true)
    protected String tdocDocumentId;

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
     * Recupera il valore della proprietà schedulerDailyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerDailyId() {
        return schedulerDailyId;
    }

    /**
     * Imposta il valore della proprietà schedulerDailyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerDailyId(String value) {
        this.schedulerDailyId = value;
    }

    /**
     * Recupera il valore della proprietà schedulerWeeklyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerWeeklyId() {
        return schedulerWeeklyId;
    }

    /**
     * Imposta il valore della proprietà schedulerWeeklyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerWeeklyId(String value) {
        this.schedulerWeeklyId = value;
    }

    /**
     * Recupera il valore della proprietà schedulerMonthlyId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchedulerMonthlyId() {
        return schedulerMonthlyId;
    }

    /**
     * Imposta il valore della proprietà schedulerMonthlyId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchedulerMonthlyId(String value) {
        this.schedulerMonthlyId = value;
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
     * Recupera il valore della proprietà tdocDocumentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTdocDocumentId() {
        return tdocDocumentId;
    }

    /**
     * Imposta il valore della proprietà tdocDocumentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTdocDocumentId(String value) {
        this.tdocDocumentId = value;
    }

}
