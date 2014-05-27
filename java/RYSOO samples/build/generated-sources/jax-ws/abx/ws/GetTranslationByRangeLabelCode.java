
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetTranslationByRangeLabelCode complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetTranslationByRangeLabelCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="exLabelCodeFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exLabelCodeTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTranslationByRangeLabelCode", propOrder = {
    "sessionId",
    "exLabelCodeFrom",
    "exLabelCodeTo"
})
public class GetTranslationByRangeLabelCode {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String exLabelCodeFrom;
    protected String exLabelCodeTo;

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
     * Recupera il valore della proprietà exLabelCodeFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExLabelCodeFrom() {
        return exLabelCodeFrom;
    }

    /**
     * Imposta il valore della proprietà exLabelCodeFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExLabelCodeFrom(String value) {
        this.exLabelCodeFrom = value;
    }

    /**
     * Recupera il valore della proprietà exLabelCodeTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExLabelCodeTo() {
        return exLabelCodeTo;
    }

    /**
     * Imposta il valore della proprietà exLabelCodeTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExLabelCodeTo(String value) {
        this.exLabelCodeTo = value;
    }

}
