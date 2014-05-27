
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQrow complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQrow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rP" type="{http://ws.abx/}abxPermission"/>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="DataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totAttach" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protocol" type="{http://ws.abx/}abxProtocolUse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQrow", propOrder = {
    "rp",
    "c",
    "dataID",
    "totAttach",
    "protocol"
})
public class AbxQrow {

    @XmlElement(name = "rP", required = true)
    protected AbxPermission rp;
    @XmlElement(required = true)
    protected List<String> c;
    @XmlElement(name = "DataID", required = true)
    protected String dataID;
    @XmlElement(required = true)
    protected String totAttach;
    @XmlElement(required = true)
    protected AbxProtocolUse protocol;

    /**
     * Recupera il valore della proprietà rp.
     * 
     * @return
     *     possible object is
     *     {@link AbxPermission }
     *     
     */
    public AbxPermission getRP() {
        return rp;
    }

    /**
     * Imposta il valore della proprietà rp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxPermission }
     *     
     */
    public void setRP(AbxPermission value) {
        this.rp = value;
    }

    /**
     * Gets the value of the c property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the c property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getC() {
        if (c == null) {
            c = new ArrayList<String>();
        }
        return this.c;
    }

    /**
     * Recupera il valore della proprietà dataID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataID() {
        return dataID;
    }

    /**
     * Imposta il valore della proprietà dataID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataID(String value) {
        this.dataID = value;
    }

    /**
     * Recupera il valore della proprietà totAttach.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotAttach() {
        return totAttach;
    }

    /**
     * Imposta il valore della proprietà totAttach.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotAttach(String value) {
        this.totAttach = value;
    }

    /**
     * Recupera il valore della proprietà protocol.
     * 
     * @return
     *     possible object is
     *     {@link AbxProtocolUse }
     *     
     */
    public AbxProtocolUse getProtocol() {
        return protocol;
    }

    /**
     * Imposta il valore della proprietà protocol.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxProtocolUse }
     *     
     */
    public void setProtocol(AbxProtocolUse value) {
        this.protocol = value;
    }

}
