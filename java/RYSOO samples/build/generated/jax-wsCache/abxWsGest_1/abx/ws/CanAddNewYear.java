
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.abxprotocol.AbxProtocol;


/**
 * <p>Classe Java per CanAddNewYear complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CanAddNewYear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="protocolData" type="{http://xml.netbeans.org/schema/abxProtocol}abxProtocol" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanAddNewYear", propOrder = {
    "sessionId",
    "protocolData"
})
public class CanAddNewYear {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxProtocol protocolData;

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
     *     {@link AbxProtocol }
     *     
     */
    public AbxProtocol getProtocolData() {
        return protocolData;
    }

    /**
     * Imposta il valore della proprietà protocolData.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocol }
     *     
     */
    public void setProtocolData(AbxProtocol value) {
        this.protocolData = value;
    }

}
