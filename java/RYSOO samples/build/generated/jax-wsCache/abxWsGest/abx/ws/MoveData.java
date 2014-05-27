
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per MoveData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="MoveData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceNameDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="document" type="{http://ws.abx/}abxData" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveData", propOrder = {
    "sessionId",
    "instanceName",
    "instanceNameDest",
    "document"
})
public class MoveData {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceName;
    protected String instanceNameDest;
    protected AbxData document;

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
     * Recupera il valore della proprietà instanceNameDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceNameDest() {
        return instanceNameDest;
    }

    /**
     * Imposta il valore della proprietà instanceNameDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceNameDest(String value) {
        this.instanceNameDest = value;
    }

    /**
     * Recupera il valore della proprietà document.
     * 
     * @return
     *     possible object is
     *     {@link AbxData }
     *     
     */
    public AbxData getDocument() {
        return document;
    }

    /**
     * Imposta il valore della proprietà document.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxData }
     *     
     */
    public void setDocument(AbxData value) {
        this.document = value;
    }

}
