
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per canCreateRaccoglitore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="canCreateRaccoglitore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="ContainerParentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentDataID" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="container_InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hexDataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "canCreateRaccoglitore", propOrder = {
    "sessionId",
    "containerParentName",
    "parentDataID"
})
public class CanCreateRaccoglitore {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "ContainerParentName")
    protected String containerParentName;
    protected CanCreateRaccoglitore.ParentDataID parentDataID;

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
     * Recupera il valore della proprietà containerParentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerParentName() {
        return containerParentName;
    }

    /**
     * Imposta il valore della proprietà containerParentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerParentName(String value) {
        this.containerParentName = value;
    }

    /**
     * Recupera il valore della proprietà parentDataID.
     * 
     * @return
     *     possible object is
     *     {@link CanCreateRaccoglitore.ParentDataID }
     *     
     */
    public CanCreateRaccoglitore.ParentDataID getParentDataID() {
        return parentDataID;
    }

    /**
     * Imposta il valore della proprietà parentDataID.
     * 
     * @param value
     *     allowed object is
     *     {@link CanCreateRaccoglitore.ParentDataID }
     *     
     */
    public void setParentDataID(CanCreateRaccoglitore.ParentDataID value) {
        this.parentDataID = value;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="container_InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hexDataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "containerInstanceName",
        "hexDataID"
    })
    public static class ParentDataID {

        @XmlElement(name = "container_InstanceName", required = true)
        protected String containerInstanceName;
        @XmlElement(required = true)
        protected String hexDataID;

        /**
         * Recupera il valore della proprietà containerInstanceName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainerInstanceName() {
            return containerInstanceName;
        }

        /**
         * Imposta il valore della proprietà containerInstanceName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainerInstanceName(String value) {
            this.containerInstanceName = value;
        }

        /**
         * Recupera il valore della proprietà hexDataID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHexDataID() {
            return hexDataID;
        }

        /**
         * Imposta il valore della proprietà hexDataID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHexDataID(String value) {
            this.hexDataID = value;
        }

    }

}
