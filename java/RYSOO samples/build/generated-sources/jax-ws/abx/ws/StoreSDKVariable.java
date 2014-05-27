
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StoreSDKVariable complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="StoreSDKVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="variableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoreSDKVariable", propOrder = {
    "sessionId",
    "variableKey",
    "variableValue"
})
public class StoreSDKVariable {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String variableKey;
    protected String variableValue;

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
     * Recupera il valore della proprietà variableKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableKey() {
        return variableKey;
    }

    /**
     * Imposta il valore della proprietà variableKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableKey(String value) {
        this.variableKey = value;
    }

    /**
     * Recupera il valore della proprietà variableValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * Imposta il valore della proprietà variableValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableValue(String value) {
        this.variableValue = value;
    }

}
