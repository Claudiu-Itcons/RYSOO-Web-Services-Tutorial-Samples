
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxDomain complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxDomain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="domain_hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="domain_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxDomain", propOrder = {
    "domainHash",
    "domainName"
})
public class AbxDomain {

    @XmlElement(name = "domain_hash", required = true)
    protected String domainHash;
    @XmlElement(name = "domain_name", required = true)
    protected String domainName;

    /**
     * Recupera il valore della proprietà domainHash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainHash() {
        return domainHash;
    }

    /**
     * Imposta il valore della proprietà domainHash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainHash(String value) {
        this.domainHash = value;
    }

    /**
     * Recupera il valore della proprietà domainName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainName() {
        return domainName;
    }

    /**
     * Imposta il valore della proprietà domainName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainName(String value) {
        this.domainName = value;
    }

}
