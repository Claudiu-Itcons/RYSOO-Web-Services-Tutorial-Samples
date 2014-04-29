
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CanInsertLinkDocumentToDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CanInsertLinkDocumentToDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="linkTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceNameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceNameTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CanInsertLinkDocumentToDocument", propOrder = {
    "sessionId",
    "linkTypeName",
    "instanceNameFrom",
    "instanceNameTo"
})
public class CanInsertLinkDocumentToDocument {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String linkTypeName;
    protected String instanceNameFrom;
    protected String instanceNameTo;

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
     * Recupera il valore della proprietà linkTypeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTypeName() {
        return linkTypeName;
    }

    /**
     * Imposta il valore della proprietà linkTypeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTypeName(String value) {
        this.linkTypeName = value;
    }

    /**
     * Recupera il valore della proprietà instanceNameFrom.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceNameFrom() {
        return instanceNameFrom;
    }

    /**
     * Imposta il valore della proprietà instanceNameFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceNameFrom(String value) {
        this.instanceNameFrom = value;
    }

    /**
     * Recupera il valore della proprietà instanceNameTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceNameTo() {
        return instanceNameTo;
    }

    /**
     * Imposta il valore della proprietà instanceNameTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceNameTo(String value) {
        this.instanceNameTo = value;
    }

}
