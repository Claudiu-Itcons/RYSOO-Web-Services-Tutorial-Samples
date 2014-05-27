
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertTranslationDecimalCode complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertTranslationDecimalCode">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="transLang" type="{http://ws.abx/}abxTranslation" minOccurs="0"/>
 *         &lt;element name="decimalLabelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exArchiboxSourceSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTranslationDecimalCode", propOrder = {
    "sessionId",
    "transLang",
    "decimalLabelCode",
    "exArchiboxSourceSuffix"
})
public class InsertTranslationDecimalCode {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxTranslation transLang;
    protected String decimalLabelCode;
    protected String exArchiboxSourceSuffix;

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
     * Recupera il valore della proprietà transLang.
     * 
     * @return
     *     possible object is
     *     {@link AbxTranslation }
     *     
     */
    public AbxTranslation getTransLang() {
        return transLang;
    }

    /**
     * Imposta il valore della proprietà transLang.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTranslation }
     *     
     */
    public void setTransLang(AbxTranslation value) {
        this.transLang = value;
    }

    /**
     * Recupera il valore della proprietà decimalLabelCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecimalLabelCode() {
        return decimalLabelCode;
    }

    /**
     * Imposta il valore della proprietà decimalLabelCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecimalLabelCode(String value) {
        this.decimalLabelCode = value;
    }

    /**
     * Recupera il valore della proprietà exArchiboxSourceSuffix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExArchiboxSourceSuffix() {
        return exArchiboxSourceSuffix;
    }

    /**
     * Imposta il valore della proprietà exArchiboxSourceSuffix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExArchiboxSourceSuffix(String value) {
        this.exArchiboxSourceSuffix = value;
    }

}
