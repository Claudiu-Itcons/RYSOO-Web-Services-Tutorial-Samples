
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Fk_getAllRecordByIndex complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fk_getAllRecordByIndex">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fk" type="{http://ws.abx/}abxFK" minOccurs="0"/>
 *         &lt;element name="numTotRecord" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="directionDesc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fk_getAllRecordByIndex", propOrder = {
    "sessionId",
    "fk",
    "numTotRecord",
    "directionDesc",
    "instanceName"
})
public class FkGetAllRecordByIndex {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxFK fk;
    protected int numTotRecord;
    protected boolean directionDesc;
    @XmlElement(name = "InstanceName")
    protected String instanceName;

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
     * Recupera il valore della proprietà fk.
     * 
     * @return
     *     possible object is
     *     {@link AbxFK }
     *     
     */
    public AbxFK getFk() {
        return fk;
    }

    /**
     * Imposta il valore della proprietà fk.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFK }
     *     
     */
    public void setFk(AbxFK value) {
        this.fk = value;
    }

    /**
     * Recupera il valore della proprietà numTotRecord.
     * 
     */
    public int getNumTotRecord() {
        return numTotRecord;
    }

    /**
     * Imposta il valore della proprietà numTotRecord.
     * 
     */
    public void setNumTotRecord(int value) {
        this.numTotRecord = value;
    }

    /**
     * Recupera il valore della proprietà directionDesc.
     * 
     */
    public boolean isDirectionDesc() {
        return directionDesc;
    }

    /**
     * Imposta il valore della proprietà directionDesc.
     * 
     */
    public void setDirectionDesc(boolean value) {
        this.directionDesc = value;
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

}
