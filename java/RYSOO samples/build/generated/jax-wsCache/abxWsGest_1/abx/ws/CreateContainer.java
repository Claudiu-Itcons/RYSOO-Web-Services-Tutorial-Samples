
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CreateContainer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CreateContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="Container2Update" type="{http://ws.abx/}abxContainer" minOccurs="0"/>
 *         &lt;element name="abxSecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="avl" type="{http://ws.abx/}abxVersioningList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateContainer", propOrder = {
    "sessionId",
    "container2Update",
    "abxSecurityId",
    "avl"
})
public class CreateContainer {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "Container2Update")
    protected AbxContainer container2Update;
    protected String abxSecurityId;
    protected AbxVersioningList avl;

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
     * Recupera il valore della proprietà container2Update.
     * 
     * @return
     *     possible object is
     *     {@link AbxContainer }
     *     
     */
    public AbxContainer getContainer2Update() {
        return container2Update;
    }

    /**
     * Imposta il valore della proprietà container2Update.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxContainer }
     *     
     */
    public void setContainer2Update(AbxContainer value) {
        this.container2Update = value;
    }

    /**
     * Recupera il valore della proprietà abxSecurityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbxSecurityId() {
        return abxSecurityId;
    }

    /**
     * Imposta il valore della proprietà abxSecurityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbxSecurityId(String value) {
        this.abxSecurityId = value;
    }

    /**
     * Recupera il valore della proprietà avl.
     * 
     * @return
     *     possible object is
     *     {@link AbxVersioningList }
     *     
     */
    public AbxVersioningList getAvl() {
        return avl;
    }

    /**
     * Imposta il valore della proprietà avl.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxVersioningList }
     *     
     */
    public void setAvl(AbxVersioningList value) {
        this.avl = value;
    }

}
