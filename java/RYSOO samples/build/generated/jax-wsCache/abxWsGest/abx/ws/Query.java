
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Query complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Query">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="option4query" type="{http://ws.abx/}abxQexpression" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Query", propOrder = {
    "sessionId",
    "option4Query"
})
public class Query {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "option4query")
    protected AbxQexpression option4Query;

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
     *     {@link AbxQexpression }
     *     
     */
    public AbxQexpression getOption4Query() {
        return option4Query;
    }

    /**
     * Imposta il valore della proprietà option4Query.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQexpression }
     *     
     */
    public void setOption4Query(AbxQexpression value) {
        this.option4Query = value;
    }

}
