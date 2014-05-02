
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxLoginIdentity complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxLoginIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passphrase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="archiboxIP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="languageID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sourceID" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="usernameLogin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxLoginIdentity", propOrder = {
    "username",
    "password",
    "passphrase",
    "domain",
    "archiboxIP",
    "languageID",
    "sourceID",
    "usernameLogin"
})
public class AbxLoginIdentity {

    @XmlElement(required = true)
    protected String username;
    @XmlElement(required = true)
    protected String password;
    @XmlElement(required = true)
    protected String passphrase;
    @XmlElement(required = true)
    protected String domain;
    @XmlElement(required = true)
    protected String archiboxIP;
    @XmlElement(required = true)
    protected String languageID;
    @XmlSchemaType(name = "unsignedInt")
    protected long sourceID;
    protected boolean usernameLogin;

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Recupera il valore della proprietà password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Imposta il valore della proprietà password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Recupera il valore della proprietà passphrase.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * Imposta il valore della proprietà passphrase.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassphrase(String value) {
        this.passphrase = value;
    }

    /**
     * Recupera il valore della proprietà domain.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomain() {
        return domain;
    }

    /**
     * Imposta il valore della proprietà domain.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomain(String value) {
        this.domain = value;
    }

    /**
     * Recupera il valore della proprietà archiboxIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArchiboxIP() {
        return archiboxIP;
    }

    /**
     * Imposta il valore della proprietà archiboxIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArchiboxIP(String value) {
        this.archiboxIP = value;
    }

    /**
     * Recupera il valore della proprietà languageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageID() {
        return languageID;
    }

    /**
     * Imposta il valore della proprietà languageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageID(String value) {
        this.languageID = value;
    }

    /**
     * Recupera il valore della proprietà sourceID.
     * 
     */
    public long getSourceID() {
        return sourceID;
    }

    /**
     * Imposta il valore della proprietà sourceID.
     * 
     */
    public void setSourceID(long value) {
        this.sourceID = value;
    }

    /**
     * Recupera il valore della proprietà usernameLogin.
     * 
     */
    public boolean isUsernameLogin() {
        return usernameLogin;
    }

    /**
     * Imposta il valore della proprietà usernameLogin.
     * 
     */
    public void setUsernameLogin(boolean value) {
        this.usernameLogin = value;
    }

}
