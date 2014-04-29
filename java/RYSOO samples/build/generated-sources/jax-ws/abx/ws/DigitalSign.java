
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DigitalSign complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DigitalSign">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIds" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fileCodes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="signUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="signType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalSign", propOrder = {
    "sessionId",
    "instanceName",
    "dataIds",
    "fileCodes",
    "signUsername",
    "signPassword",
    "signType"
})
public class DigitalSign {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceName;
    @XmlElement(nillable = true)
    protected List<String> dataIds;
    @XmlElement(nillable = true)
    protected List<String> fileCodes;
    protected String signUsername;
    protected String signPassword;
    protected Integer signType;

    /**
     * Recupera il valore della proprietà sessionId.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getSessionId() {
        return sessionId;
    }

    /**
     * Imposta il valore della proprietà sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setSessionId(IDtype value) {
        this.sessionId = value;
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
     * Gets the value of the dataIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDataIds() {
        if (dataIds == null) {
            dataIds = new ArrayList<String>();
        }
        return this.dataIds;
    }

    /**
     * Gets the value of the fileCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fileCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFileCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFileCodes() {
        if (fileCodes == null) {
            fileCodes = new ArrayList<String>();
        }
        return this.fileCodes;
    }

    /**
     * Recupera il valore della proprietà signUsername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignUsername() {
        return signUsername;
    }

    /**
     * Imposta il valore della proprietà signUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignUsername(String value) {
        this.signUsername = value;
    }

    /**
     * Recupera il valore della proprietà signPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignPassword() {
        return signPassword;
    }

    /**
     * Imposta il valore della proprietà signPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignPassword(String value) {
        this.signPassword = value;
    }

    /**
     * Recupera il valore della proprietà signType.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSignType() {
        return signType;
    }

    /**
     * Imposta il valore della proprietà signType.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSignType(Integer value) {
        this.signType = value;
    }

}
