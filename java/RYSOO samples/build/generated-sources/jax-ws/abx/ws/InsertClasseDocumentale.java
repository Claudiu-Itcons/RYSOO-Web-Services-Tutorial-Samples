
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertClasseDocumentale complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertClasseDocumentale">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="classeDocumentale" type="{http://ws.abx/}abxClasseDocumentale" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertClasseDocumentale", propOrder = {
    "sessionId",
    "classeDocumentale"
})
public class InsertClasseDocumentale {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxClasseDocumentale classeDocumentale;

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
     * Recupera il valore della proprietà classeDocumentale.
     * 
     * @return
     *     possible object is
     *     {@link AbxClasseDocumentale }
     *     
     */
    public AbxClasseDocumentale getClasseDocumentale() {
        return classeDocumentale;
    }

    /**
     * Imposta il valore della proprietà classeDocumentale.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxClasseDocumentale }
     *     
     */
    public void setClasseDocumentale(AbxClasseDocumentale value) {
        this.classeDocumentale = value;
    }

}
