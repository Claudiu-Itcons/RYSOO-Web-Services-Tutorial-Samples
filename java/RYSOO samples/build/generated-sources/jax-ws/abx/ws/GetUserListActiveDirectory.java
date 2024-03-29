
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetUserListActiveDirectory complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetUserListActiveDirectory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="userField" type="{http://ws.abx/}abxUser" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetUserListActiveDirectory", propOrder = {
    "sessionId",
    "userField"
})
public class GetUserListActiveDirectory {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxUser userField;

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
     * Recupera il valore della proprietà userField.
     * 
     * @return
     *     possible object is
     *     {@link AbxUser }
     *     
     */
    public AbxUser getUserField() {
        return userField;
    }

    /**
     * Imposta il valore della proprietà userField.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxUser }
     *     
     */
    public void setUserField(AbxUser value) {
        this.userField = value;
    }

}
