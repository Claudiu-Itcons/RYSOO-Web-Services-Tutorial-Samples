
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per CopyFile complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CopyFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceNameSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIdSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{http://ws.abx/}abxFile" minOccurs="0"/>
 *         &lt;element name="instanceNameDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataIdDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CopyFile", propOrder = {
    "sessionId",
    "instanceNameSource",
    "dataIdSource",
    "file",
    "instanceNameDest",
    "dataIdDest"
})
public class CopyFile {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceNameSource;
    protected String dataIdSource;
    protected AbxFile file;
    protected String instanceNameDest;
    protected String dataIdDest;

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
     * Recupera il valore della proprietà instanceNameSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceNameSource() {
        return instanceNameSource;
    }

    /**
     * Imposta il valore della proprietà instanceNameSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceNameSource(String value) {
        this.instanceNameSource = value;
    }

    /**
     * Recupera il valore della proprietà dataIdSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdSource() {
        return dataIdSource;
    }

    /**
     * Imposta il valore della proprietà dataIdSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdSource(String value) {
        this.dataIdSource = value;
    }

    /**
     * Recupera il valore della proprietà file.
     * 
     * @return
     *     possible object is
     *     {@link AbxFile }
     *     
     */
    public AbxFile getFile() {
        return file;
    }

    /**
     * Imposta il valore della proprietà file.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFile }
     *     
     */
    public void setFile(AbxFile value) {
        this.file = value;
    }

    /**
     * Recupera il valore della proprietà instanceNameDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceNameDest() {
        return instanceNameDest;
    }

    /**
     * Imposta il valore della proprietà instanceNameDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceNameDest(String value) {
        this.instanceNameDest = value;
    }

    /**
     * Recupera il valore della proprietà dataIdDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIdDest() {
        return dataIdDest;
    }

    /**
     * Imposta il valore della proprietà dataIdDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIdDest(String value) {
        this.dataIdDest = value;
    }

}
