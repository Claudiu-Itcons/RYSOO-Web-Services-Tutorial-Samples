
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetProtocolByNameDesc complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetProtocolByNameDesc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="protocolDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="protocolName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetProtocolByNameDesc", propOrder = {
    "sessionId",
    "protocolDesc",
    "protocolName"
})
public class GetProtocolByNameDesc {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String protocolDesc;
    protected String protocolName;

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

}
