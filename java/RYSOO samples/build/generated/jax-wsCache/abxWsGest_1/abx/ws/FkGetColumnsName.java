
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Fk_getColumnsName complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fk_getColumnsName">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fk" type="{http://ws.abx/}abxFK" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fk_getColumnsName", propOrder = {
    "sessionId",
    "fk"
})
public class FkGetColumnsName {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxFK fk;

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

}