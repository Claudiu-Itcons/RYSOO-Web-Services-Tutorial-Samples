
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertTranslationResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertTranslationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://ws.abx/}abxTranslationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTranslationResponse", propOrder = {
    "_return"
})
public class InsertTranslationResponse {

    @XmlElement(name = "return")
    protected AbxTranslationResult _return;

    /**
     * Recupera il valore della proprietà return.
     * 
     * @return
     *     possible object is
     *     {@link AbxTranslationResult }
     *     
     */
    public AbxTranslationResult getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della proprietà return.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTranslationResult }
     *     
     */
    public void setReturn(AbxTranslationResult value) {
        this._return = value;
    }

}