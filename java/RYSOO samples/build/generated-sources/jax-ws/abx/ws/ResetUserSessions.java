
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ResetUserSessions complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ResetUserSessions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LoginParam" type="{http://ws.abx/}abxLoginIdentity" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetUserSessions", propOrder = {
    "loginParam"
})
public class ResetUserSessions {

    @XmlElement(name = "LoginParam")
    protected AbxLoginIdentity loginParam;

    /**
     * Recupera il valore della proprietà loginParam.
     * 
     * @return
     *     possible object is
     *     {@link AbxLoginIdentity }
     *     
     */
    public AbxLoginIdentity getLoginParam() {
        return loginParam;
    }

    /**
     * Imposta il valore della proprietà loginParam.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxLoginIdentity }
     *     
     */
    public void setLoginParam(AbxLoginIdentity value) {
        this.loginParam = value;
    }

}
