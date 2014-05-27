
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKWatchFolder complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKWatchFolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="watchFolderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serverType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="configXML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKWatchFolder", propOrder = {
    "watchFolderId",
    "taskId",
    "serverType",
    "configXML"
})
public class AbxSDKWatchFolder {

    @XmlElement(required = true)
    protected String watchFolderId;
    @XmlElement(required = true)
    protected String taskId;
    @XmlElement(required = true)
    protected String serverType;
    @XmlElement(required = true)
    protected String configXML;

    /**
     * Recupera il valore della proprietà watchFolderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWatchFolderId() {
        return watchFolderId;
    }

    /**
     * Imposta il valore della proprietà watchFolderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWatchFolderId(String value) {
        this.watchFolderId = value;
    }

    /**
     * Recupera il valore della proprietà taskId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Imposta il valore della proprietà taskId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Recupera il valore della proprietà serverType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerType() {
        return serverType;
    }

    /**
     * Imposta il valore della proprietà serverType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerType(String value) {
        this.serverType = value;
    }

    /**
     * Recupera il valore della proprietà configXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigXML() {
        return configXML;
    }

    /**
     * Imposta il valore della proprietà configXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigXML(String value) {
        this.configXML = value;
    }

}
