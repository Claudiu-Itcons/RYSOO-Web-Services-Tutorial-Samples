
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per GetData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="GetData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IDtype_SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetData", propOrder = {
    "iDtypeSessionId",
    "instanceName"
})
public class GetData {

    @XmlElement(name = "IDtype_SessionId")
    protected IDtype iDtypeSessionId;
    protected String instanceName;

    /**
     * Recupera il valore della proprietà iDtypeSessionId.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getIDtypeSessionId() {
        return iDtypeSessionId;
    }

    /**
     * Imposta il valore della proprietà iDtypeSessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setIDtypeSessionId(IDtype value) {
        this.iDtypeSessionId = value;
    }

    /**
     * Recupera il valore della proprietà instanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Imposta il valore della proprietà instanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

}
