
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModifyFileDescription complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModifyFileDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="file" type="{http://ws.abx/}abxFile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModifyFileDescription", propOrder = {
    "sessionId",
    "instanceName",
    "dataId",
    "file"
})
public class ModifyFileDescription {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String instanceName;
    protected String dataId;
    protected AbxFile file;

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

    /**
     * Recupera il valore della proprietà dataId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * Imposta il valore della proprietà dataId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataId(String value) {
        this.dataId = value;
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

}