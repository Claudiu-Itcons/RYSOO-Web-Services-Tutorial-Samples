
package abx.ws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxAllPermission complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxAllPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="inheritedInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="permissionDef" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="objActionList" type="{http://ws.abx/}abxObjAction"/>
 *                   &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abxAllPermission", propOrder = {
    "list"
})
public class AbxAllPermission {

    @XmlElement(required = true)
    protected java.util.List<AbxAllPermission.List> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxAllPermission.List }
     * 
     * 
     */
    public java.util.List<AbxAllPermission.List> getList() {
        if (list == null) {
            list = new ArrayList<AbxAllPermission.List>();
        }
        return this.list;
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
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="inheritedInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="groupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="inherited" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="spread" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="permissionDef" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="objActionList" type="{http://ws.abx/}abxObjAction"/>
     *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "username",
        "instanceName",
        "inheritedInstanceName",
        "groupName",
        "orderId",
        "inherited",
        "spread",
        "permissionDef",
        "objActionList",
        "objName"
    })
    public static class List {

        @XmlElement(required = true)
        protected String username;
        @XmlElement(required = true)
        protected String instanceName;
        @XmlElement(required = true)
        protected String inheritedInstanceName;
        @XmlElement(required = true)
        protected String groupName;
        @XmlElement(required = true)
        protected String orderId;
        @XmlElement(required = true)
        protected String inherited;
        @XmlElement(required = true)
        protected String spread;
        @XmlElement(required = true)
        protected String permissionDef;
        @XmlElement(required = true)
        protected AbxObjAction objActionList;
        @XmlElement(required = true)
        protected String objName;

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
         * Recupera il valore della proprietà inheritedInstanceName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInheritedInstanceName() {
            return inheritedInstanceName;
        }

        /**
         * Imposta il valore della proprietà inheritedInstanceName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInheritedInstanceName(String value) {
            this.inheritedInstanceName = value;
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
         * Recupera il valore della proprietà orderId.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderId() {
            return orderId;
        }

        /**
         * Imposta il valore della proprietà orderId.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderId(String value) {
            this.orderId = value;
        }

        /**
         * Recupera il valore della proprietà inherited.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInherited() {
            return inherited;
        }

        /**
         * Imposta il valore della proprietà inherited.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInherited(String value) {
            this.inherited = value;
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
         * Recupera il valore della proprietà permissionDef.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPermissionDef() {
            return permissionDef;
        }

        /**
         * Imposta il valore della proprietà permissionDef.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPermissionDef(String value) {
            this.permissionDef = value;
        }

        /**
         * Recupera il valore della proprietà objActionList.
         * 
         * @return
         *     possible object is
         *     {@link AbxObjAction }
         *     
         */
        public AbxObjAction getObjActionList() {
            return objActionList;
        }

        /**
         * Imposta il valore della proprietà objActionList.
         * 
         * @param value
         *     allowed object is
         *     {@link AbxObjAction }
         *     
         */
        public void setObjActionList(AbxObjAction value) {
            this.objActionList = value;
        }

        /**
         * Recupera il valore della proprietà objName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjName() {
            return objName;
        }

        /**
         * Imposta il valore della proprietà objName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjName(String value) {
            this.objName = value;
        }

    }

}
