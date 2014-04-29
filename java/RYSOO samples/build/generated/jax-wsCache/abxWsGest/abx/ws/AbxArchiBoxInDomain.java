
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxArchiBoxInDomain complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxArchiBoxInDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abxId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="domainId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="matricola" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="release" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxArchiBoxInDomain", propOrder = {
    "abxId",
    "domainId",
    "matricola",
    "description",
    "ipAddress",
    "location",
    "release",
    "serverId",
    "status",
    "requestId"
})
public class AbxArchiBoxInDomain {

    protected long abxId;
    protected long domainId;
    @XmlElement(required = true)
    protected String matricola;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String ipAddress;
    @XmlElement(required = true)
    protected String location;
    @XmlElement(required = true)
    protected String release;
    protected int serverId;
    @XmlElement(required = true)
    protected String status;
    protected int requestId;

    /**
     * Recupera il valore della proprietà abxId.
     * 
     */
    public long getAbxId() {
        return abxId;
    }

    /**
     * Imposta il valore della proprietà abxId.
     * 
     */
    public void setAbxId(long value) {
        this.abxId = value;
    }

    /**
     * Recupera il valore della proprietà domainId.
     * 
     */
    public long getDomainId() {
        return domainId;
    }

    /**
     * Imposta il valore della proprietà domainId.
     * 
     */
    public void setDomainId(long value) {
        this.domainId = value;
    }

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
     * Recupera il valore della proprietà ipAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * Imposta il valore della proprietà ipAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddress(String value) {
        this.ipAddress = value;
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
     * Recupera il valore della proprietà serverId.
     * 
     */
    public int getServerId() {
        return serverId;
    }

    /**
     * Imposta il valore della proprietà serverId.
     * 
     */
    public void setServerId(int value) {
        this.serverId = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà requestId.
     * 
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * Imposta il valore della proprietà requestId.
     * 
     */
    public void setRequestId(int value) {
        this.requestId = value;
    }

}
