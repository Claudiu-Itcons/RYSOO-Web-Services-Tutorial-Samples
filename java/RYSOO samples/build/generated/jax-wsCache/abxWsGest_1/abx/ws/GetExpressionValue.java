
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetExpressionValue complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetExpressionValue">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="dataid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetExpressionValue", propOrder = {
    "sessionId",
    "dataid",
    "instanceName",
    "expressionName"
})
public class GetExpressionValue {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String dataid;
    protected String instanceName;
    protected String expressionName;

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
     * Recupera il valore della proprietà dataid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataid() {
        return dataid;
    }

    /**
     * Imposta il valore della proprietà dataid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataid(String value) {
        this.dataid = value;
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
     * Recupera il valore della proprietà expressionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionName() {
        return expressionName;
    }

    /**
     * Imposta il valore della proprietà expressionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionName(String value) {
        this.expressionName = value;
    }

}