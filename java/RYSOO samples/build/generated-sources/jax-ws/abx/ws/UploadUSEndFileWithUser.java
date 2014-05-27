
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per UploadUSEndFileWithUser complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="UploadUSEndFileWithUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="dataListInput" type="{http://ws.abx/}abxFileList" minOccurs="0"/>
 *         &lt;element name="codePreviousVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadUSEndFileWithUser", propOrder = {
    "sessionId",
    "dataListInput",
    "codePreviousVersion",
    "username"
})
public class UploadUSEndFileWithUser {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxFileList dataListInput;
    protected String codePreviousVersion;
    protected String username;

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
     *     {@link AbxFileList }
     *     
     */
    public AbxFileList getDataListInput() {
        return dataListInput;
    }

    /**
     * Imposta il valore della proprietà dataListInput.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFileList }
     *     
     */
    public void setDataListInput(AbxFileList value) {
        this.dataListInput = value;
    }

    /**
     * Recupera il valore della proprietà codePreviousVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodePreviousVersion() {
        return codePreviousVersion;
    }

    /**
     * Imposta il valore della proprietà codePreviousVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodePreviousVersion(String value) {
        this.codePreviousVersion = value;
    }

    /**
     * Recupera il valore della proprietà username.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Imposta il valore della proprietà username.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
