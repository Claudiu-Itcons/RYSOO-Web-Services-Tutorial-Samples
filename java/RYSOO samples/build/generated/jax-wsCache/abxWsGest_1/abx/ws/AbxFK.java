
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFK complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFK">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fkDb" type="{http://ws.abx/}abxFkDb"/>
 *         &lt;element name="fkArchiboxRacc" type="{http://ws.abx/}abxFkArchiboxRacc"/>
 *         &lt;element name="fkArchiboxUtenti" type="{http://ws.abx/}abxFkArchiboxUtenti"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFK", propOrder = {
    "fkDb",
    "fkArchiboxRacc",
    "fkArchiboxUtenti",
    "name"
})
public class AbxFK {

    @XmlElement(required = true)
    protected AbxFkDb fkDb;
    @XmlElement(required = true)
    protected AbxFkArchiboxRacc fkArchiboxRacc;
    @XmlElement(required = true)
    protected AbxFkArchiboxUtenti fkArchiboxUtenti;
    @XmlElement(required = true)
    protected String name;

    /**
     * Recupera il valore della proprietà fkDb.
     * 
     * @return
     *     possible object is
     *     {@link AbxFkDb }
     *     
     */
    public AbxFkDb getFkDb() {
        return fkDb;
    }

    /**
     * Imposta il valore della proprietà fkDb.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFkDb }
     *     
     */
    public void setFkDb(AbxFkDb value) {
        this.fkDb = value;
    }

    /**
     * Recupera il valore della proprietà fkArchiboxRacc.
     * 
     * @return
     *     possible object is
     *     {@link AbxFkArchiboxRacc }
     *     
     */
    public AbxFkArchiboxRacc getFkArchiboxRacc() {
        return fkArchiboxRacc;
    }

    /**
     * Imposta il valore della proprietà fkArchiboxRacc.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFkArchiboxRacc }
     *     
     */
    public void setFkArchiboxRacc(AbxFkArchiboxRacc value) {
        this.fkArchiboxRacc = value;
    }

    /**
     * Recupera il valore della proprietà fkArchiboxUtenti.
     * 
     * @return
     *     possible object is
     *     {@link AbxFkArchiboxUtenti }
     *     
     */
    public AbxFkArchiboxUtenti getFkArchiboxUtenti() {
        return fkArchiboxUtenti;
    }

    /**
     * Imposta il valore della proprietà fkArchiboxUtenti.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFkArchiboxUtenti }
     *     
     */
    public void setFkArchiboxUtenti(AbxFkArchiboxUtenti value) {
        this.fkArchiboxUtenti = value;
    }

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
