
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertLinkContainerToDocument complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertLinkContainerToDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="linkTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceNameFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIdTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceNameTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertLinkContainerToDocument", propOrder = {
    "sessionId",
    "linkTypeName",
    "instanceNameFrom",
    "dataIdTo",
    "instanceNameTo",
    "note"
})
public class InsertLinkContainerToDocument {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String linkTypeName;
    protected String instanceNameFrom;
    protected String dataIdTo;
    protected String instanceNameTo;
    protected String note;

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
     * Recupera il valore della proprietà dataIdTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdTo() {
        return dataIdTo;
    }

    /**
     * Imposta il valore della proprietà dataIdTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdTo(String value) {
        this.dataIdTo = value;
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

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
