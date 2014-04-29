
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per IDtype complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="IDtype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CryptSessionHash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="privilegedUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDtype", propOrder = {
    "sessionID",
    "cryptSessionHash",
    "privilegedUser"
})
public class IDtype {

    @XmlElement(name = "SessionID", required = true)
    protected String sessionID;
    @XmlElement(name = "CryptSessionHash", required = true)
    protected String cryptSessionHash;
    protected boolean privilegedUser;

    /**
     * Recupera il valore della proprietà sessionID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Imposta il valore della proprietà sessionID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Recupera il valore della proprietà cryptSessionHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCryptSessionHash() {
        return cryptSessionHash;
    }

    /**
     * Imposta il valore della proprietà cryptSessionHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCryptSessionHash(String value) {
        this.cryptSessionHash = value;
    }

    /**
     * Recupera il valore della proprietà privilegedUser.
     * 
     */
    public boolean isPrivilegedUser() {
        return privilegedUser;
    }

    /**
     * Imposta il valore della proprietà privilegedUser.
     * 
     */
    public void setPrivilegedUser(boolean value) {
        this.privilegedUser = value;
    }

}
