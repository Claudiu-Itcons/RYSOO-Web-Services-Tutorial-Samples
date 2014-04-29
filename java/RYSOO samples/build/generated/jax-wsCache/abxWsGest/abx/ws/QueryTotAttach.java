
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per QueryTotAttach complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="QueryTotAttach">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="option4query" type="{http://ws.abx/}abxQexpression" minOccurs="0"/>
 *         &lt;element name="protuse" type="{http://ws.abx/}abxProtocolUse" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryTotAttach", propOrder = {
    "sessionId",
    "option4Query",
    "protuse"
})
public class QueryTotAttach {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "option4query")
    protected AbxQexpression option4Query;
    protected AbxProtocolUse protuse;

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

    /**
     * Recupera il valore della proprietà protuse.
     * 
     * @return
     *     possible object is
     *     {@link AbxProtocolUse }
     *     
     */
    public AbxProtocolUse getProtuse() {
        return protuse;
    }

    /**
     * Imposta il valore della proprietà protuse.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocolUse }
     *     
     */
    public void setProtuse(AbxProtocolUse value) {
        this.protuse = value;
    }

}
