
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Fk_getLocalFieldList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fk_getLocalFieldList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="users" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="groups" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fk_getLocalFieldList", propOrder = {
    "sessionId",
    "users",
    "groups"
})
public class FkGetLocalFieldList {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected boolean users;
    protected boolean groups;

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
     * Recupera il valore della proprietà users.
     * 
     */
    public boolean isUsers() {
        return users;
    }

    /**
     * Imposta il valore della proprietà users.
     * 
     */
    public void setUsers(boolean value) {
        this.users = value;
    }

    /**
     * Recupera il valore della proprietà groups.
     * 
     */
    public boolean isGroups() {
        return groups;
    }

    /**
     * Imposta il valore della proprietà groups.
     * 
     */
    public void setGroups(boolean value) {
        this.groups = value;
    }

}
