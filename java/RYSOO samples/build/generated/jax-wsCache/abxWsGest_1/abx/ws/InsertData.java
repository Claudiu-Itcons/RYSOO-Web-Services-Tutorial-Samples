
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentRevId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="inputData" type="{http://ws.abx/}abxDataList" minOccurs="0"/>
 *         &lt;element name="masterId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolUseData" type="{http://ws.abx/}abxProtocolUse" minOccurs="0"/>
 *         &lt;element name="abxSecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avl" type="{http://ws.abx/}abxVersioningList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertData", propOrder = {
    "sessionId",
    "instanceName",
    "parentRevId",
    "inputData",
    "masterId",
    "protocolUseData",
    "abxSecurityId",
    "note",
    "avl"
})
public class InsertData {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceName;
    protected long parentRevId;
    protected AbxDataList inputData;
    protected String masterId;
    protected AbxProtocolUse protocolUseData;
    protected String abxSecurityId;
    protected String note;
    protected AbxVersioningList avl;

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
     * Recupera il valore della proprietà parentRevId.
     * 
     */
    public long getParentRevId() {
        return parentRevId;
    }

    /**
     * Imposta il valore della proprietà parentRevId.
     * 
     */
    public void setParentRevId(long value) {
        this.parentRevId = value;
    }

    /**
     * Recupera il valore della proprietà inputData.
     * 
     * @return
     *     possible object is
     *     {@link AbxDataList }
     *     
     */
    public AbxDataList getInputData() {
        return inputData;
    }

    /**
     * Imposta il valore della proprietà inputData.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDataList }
     *     
     */
    public void setInputData(AbxDataList value) {
        this.inputData = value;
    }

    /**
     * Recupera il valore della proprietà masterId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterId() {
        return masterId;
    }

    /**
     * Imposta il valore della proprietà masterId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterId(String value) {
        this.masterId = value;
    }

    /**
     * Recupera il valore della proprietà protocolUseData.
     * 
     * @return
     *     possible object is
     *     {@link AbxProtocolUse }
     *     
     */
    public AbxProtocolUse getProtocolUseData() {
        return protocolUseData;
    }

    /**
     * Imposta il valore della proprietà protocolUseData.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocolUse }
     *     
     */
    public void setProtocolUseData(AbxProtocolUse value) {
        this.protocolUseData = value;
    }

    /**
     * Recupera il valore della proprietà abxSecurityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbxSecurityId() {
        return abxSecurityId;
    }

    /**
     * Imposta il valore della proprietà abxSecurityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbxSecurityId(String value) {
        this.abxSecurityId = value;
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
     * Recupera il valore della proprietà avl.
     * 
     * @return
     *     possible object is
     *     {@link AbxVersioningList }
     *     
     */
    public AbxVersioningList getAvl() {
        return avl;
    }

    /**
     * Imposta il valore della proprietà avl.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxVersioningList }
     *     
     */
    public void setAvl(AbxVersioningList value) {
        this.avl = value;
    }

}
