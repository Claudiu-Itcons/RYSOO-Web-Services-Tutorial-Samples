
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.abxdynaminorg.AbxDynorgTypeResult;


/**
 * <p>Classe Java per GetDynorgTypeListResponse complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetDynorgTypeListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynorgTypeResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDynorgTypeListResponse", propOrder = {
    "_return"
})
public class GetDynorgTypeListResponse {

    @XmlElement(name = "return")
    protected AbxDynorgTypeResult _return;

    /**
     * Recupera il valore della proprietà return.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynorgTypeResult }
     *     
     */
    public AbxDynorgTypeResult getReturn() {
        return _return;
    }

    /**
     * Imposta il valore della proprietà return.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynorgTypeResult }
     *     
     */
    public void setReturn(AbxDynorgTypeResult value) {
        this._return = value;
    }

}
