
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertTPFile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertTPFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="dataListInput" type="{http://ws.abx/}abxFileTpList" minOccurs="0"/>
 *         &lt;element name="abxSecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertTPFile", propOrder = {
    "sessionId",
    "dataListInput",
    "abxSecurityId"
})
public class InsertTPFile {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxFileTpList dataListInput;
    protected String abxSecurityId;

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
     * Recupera il valore della proprietà dataListInput.
     * 
     * @return
     *     possible object is
     *     {@link AbxFileTpList }
     *     
     */
    public AbxFileTpList getDataListInput() {
        return dataListInput;
    }

    /**
     * Imposta il valore della proprietà dataListInput.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFileTpList }
     *     
     */
    public void setDataListInput(AbxFileTpList value) {
        this.dataListInput = value;
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

}
