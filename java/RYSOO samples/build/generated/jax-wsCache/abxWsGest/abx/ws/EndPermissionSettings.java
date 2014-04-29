
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per EndPermissionSettings complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EndPermissionSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="permissionToSet" type="{http://ws.abx/}abxPermission" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndPermissionSettings", propOrder = {
    "sessionId",
    "permissionToSet"
})
public class EndPermissionSettings {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxPermission permissionToSet;

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
     * Recupera il valore della proprietà permissionToSet.
     * 
     * @return
     *     possible object is
     *     {@link AbxPermission }
     *     
     */
    public AbxPermission getPermissionToSet() {
        return permissionToSet;
    }

    /**
     * Imposta il valore della proprietà permissionToSet.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxPermission }
     *     
     */
    public void setPermissionToSet(AbxPermission value) {
        this.permissionToSet = value;
    }

}
