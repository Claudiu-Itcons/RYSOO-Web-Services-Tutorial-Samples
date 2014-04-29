
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxEditPermission complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxEditPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="permission" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataAttachmentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="permissionSingleList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="todelete" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxEditPermission", propOrder = {
    "sessionId",
    "instanceName",
    "userName",
    "groupName",
    "spread",
    "permission",
    "dataId",
    "dataAttachmentId",
    "permissionSingleList",
    "todelete"
})
public class AbxEditPermission {

    @XmlElement(required = true)
    protected String sessionId;
    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String groupName;
    @XmlElement(required = true)
    protected String spread;
    @XmlElement(required = true)
    protected String permission;
    @XmlElement(required = true)
    protected String dataId;
    @XmlElement(required = true)
    protected String dataAttachmentId;
    @XmlElement(required = true)
    protected List<AbxEditPermission.PermissionSingleList> permissionSingleList;
    @XmlElement(required = true)
    protected String todelete;

    /**
     * Recupera il valore della proprietà sessionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Imposta il valore della proprietà sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
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
     * Recupera il valore della proprietà userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Imposta il valore della proprietà userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Recupera il valore della proprietà groupName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * Imposta il valore della proprietà groupName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupName(String value) {
        this.groupName = value;
    }

    /**
     * Recupera il valore della proprietà spread.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpread() {
        return spread;
    }

    /**
     * Imposta il valore della proprietà spread.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpread(String value) {
        this.spread = value;
    }

    /**
     * Recupera il valore della proprietà permission.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermission() {
        return permission;
    }

    /**
     * Imposta il valore della proprietà permission.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermission(String value) {
        this.permission = value;
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
     * Recupera il valore della proprietà dataAttachmentId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataAttachmentId() {
        return dataAttachmentId;
    }

    /**
     * Imposta il valore della proprietà dataAttachmentId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataAttachmentId(String value) {
        this.dataAttachmentId = value;
    }

    /**
     * Gets the value of the permissionSingleList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permissionSingleList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermissionSingleList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxEditPermission.PermissionSingleList }
     * 
     * 
     */
    public List<AbxEditPermission.PermissionSingleList> getPermissionSingleList() {
        if (permissionSingleList == null) {
            permissionSingleList = new ArrayList<AbxEditPermission.PermissionSingleList>();
        }
        return this.permissionSingleList;
    }

    /**
     * Recupera il valore della proprietà todelete.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTodelete() {
        return todelete;
    }

    /**
     * Imposta il valore della proprietà todelete.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTodelete(String value) {
        this.todelete = value;
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
     *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "positionId",
        "value"
    })
    public static class PermissionSingleList {

        @XmlElement(required = true)
        protected String positionId;
        @XmlElement(required = true)
        protected String value;

        /**
         * Recupera il valore della proprietà positionId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPositionId() {
            return positionId;
        }

        /**
         * Imposta il valore della proprietà positionId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPositionId(String value) {
            this.positionId = value;
        }

        /**
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
