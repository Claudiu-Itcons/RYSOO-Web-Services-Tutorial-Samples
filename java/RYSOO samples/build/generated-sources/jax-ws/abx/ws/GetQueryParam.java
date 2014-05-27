
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetQueryParam complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetQueryParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="option4query" type="{http://ws.abx/}abxOption4Query" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetQueryParam", propOrder = {
    "sessionId",
    "option4Query"
})
public class GetQueryParam {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "option4query")
    protected AbxOption4Query option4Query;

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
     * Recupera il valore della proprietà option4Query.
     * 
     * @return
     *     possible object is
     *     {@link AbxOption4Query }
     *     
     */
    public AbxOption4Query getOption4Query() {
        return option4Query;
    }

    /**
     * Imposta il valore della proprietà option4Query.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxOption4Query }
     *     
     */
    public void setOption4Query(AbxOption4Query value) {
        this.option4Query = value;
    }

}
