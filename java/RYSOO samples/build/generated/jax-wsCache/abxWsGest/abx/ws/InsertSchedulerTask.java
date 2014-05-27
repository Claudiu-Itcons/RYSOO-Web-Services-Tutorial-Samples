
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per InsertSchedulerTask complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="InsertSchedulerTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="abxSchedulerTask" type="{http://ws.abx/}abxSchedulerTask" minOccurs="0"/>
 *         &lt;element name="abxDocuments" type="{http://ws.abx/}abxArchSostDocumentList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsertSchedulerTask", propOrder = {
    "sessionId",
    "abxSchedulerTask",
    "abxDocuments"
})
public class InsertSchedulerTask {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxSchedulerTask abxSchedulerTask;
    protected AbxArchSostDocumentList abxDocuments;

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
     * Recupera il valore della proprietà abxSchedulerTask.
     * 
     * @return
     *     possible object is
     *     {@link AbxSchedulerTask }
     *     
     */
    public AbxSchedulerTask getAbxSchedulerTask() {
        return abxSchedulerTask;
    }

    /**
     * Imposta il valore della proprietà abxSchedulerTask.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSchedulerTask }
     *     
     */
    public void setAbxSchedulerTask(AbxSchedulerTask value) {
        this.abxSchedulerTask = value;
    }

    /**
     * Recupera il valore della proprietà abxDocuments.
     * 
     * @return
     *     possible object is
     *     {@link AbxArchSostDocumentList }
     *     
     */
    public AbxArchSostDocumentList getAbxDocuments() {
        return abxDocuments;
    }

    /**
     * Imposta il valore della proprietà abxDocuments.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxArchSostDocumentList }
     *     
     */
    public void setAbxDocuments(AbxArchSostDocumentList value) {
        this.abxDocuments = value;
    }

}
