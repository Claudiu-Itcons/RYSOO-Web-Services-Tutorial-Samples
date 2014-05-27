
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetNewProtocolNumber complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetNewProtocolNumber">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="protocolData" type="{http://ws.abx/}abxProtocolUse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetNewProtocolNumber", propOrder = {
    "sessionId",
    "protocolData"
})
public class GetNewProtocolNumber {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxProtocolUse protocolData;

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
     * Recupera il valore della proprietà protocolData.
     * 
     * @return
     *     possible object is
     *     {@link AbxProtocolUse }
     *     
     */
    public AbxProtocolUse getProtocolData() {
        return protocolData;
    }

    /**
     * Imposta il valore della proprietà protocolData.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocolUse }
     *     
     */
    public void setProtocolData(AbxProtocolUse value) {
        this.protocolData = value;
    }

}
