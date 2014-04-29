
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxLoginInfo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxLoginInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matricola" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipaddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="activeDirectoryEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxLoginInfo", propOrder = {
    "matricola",
    "description",
    "ipaddress",
    "location",
    "release",
    "serverid",
    "activeDirectoryEnabled",
    "username"
})
public class AbxLoginInfo {

    @XmlElement(required = true)
    protected String matricola;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String ipaddress;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String release;
    protected int serverid;
    protected boolean activeDirectoryEnabled;
    @XmlElement(required = true)
    protected String username;

    /**
     * Recupera il valore della proprietà matricola.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricola() {
        return matricola;
    }

    /**
     * Imposta il valore della proprietà matricola.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricola(String value) {
        this.matricola = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Recupera il valore della proprietà ipaddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpaddress() {
        return ipaddress;
    }

    /**
     * Imposta il valore della proprietà ipaddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpaddress(String value) {
        this.ipaddress = value;
    }

    /**
     * Recupera il valore della proprietà location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Imposta il valore della proprietà location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Recupera il valore della proprietà release.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelease() {
        return release;
    }

    /**
     * Imposta il valore della proprietà release.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelease(String value) {
        this.release = value;
    }

    /**
     * Recupera il valore della proprietà serverid.
     * 
     */
    public int getServerid() {
        return serverid;
    }

    /**
     * Imposta il valore della proprietà serverid.
     * 
     */
    public void setServerid(int value) {
        this.serverid = value;
    }

    /**
     * Recupera il valore della proprietà activeDirectoryEnabled.
     * 
     */
    public boolean isActiveDirectoryEnabled() {
        return activeDirectoryEnabled;
    }

    /**
     * Imposta il valore della proprietà activeDirectoryEnabled.
     * 
     */
    public void setActiveDirectoryEnabled(boolean value) {
        this.activeDirectoryEnabled = value;
    }

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

}
