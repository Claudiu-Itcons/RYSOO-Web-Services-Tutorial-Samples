
package abx.ws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per abxPermission complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="defaultObjActionList" type="{http://ws.abx/}abxObjAction"/>
 *         &lt;element name="editPermission">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="editUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="editCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="editTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="permissionSettings" type="{http://ws.abx/}abxEditPermissionList"/>
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
@XmlType(name = "abxPermission", propOrder = {
    "list",
    "defaultObjActionList",
    "editPermission"
})
public class AbxPermission {

    @XmlElement(required = true)
    protected java.util.List<AbxPermission.List> list;
    @XmlElement(required = true)
    protected AbxObjAction defaultObjActionList;
    @XmlElement(required = true)
    protected AbxPermission.EditPermission editPermission;

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
     * {@link AbxPermission.List }
     * 
     * 
     */
    public java.util.List<AbxPermission.List> getList() {
        if (list == null) {
            list = new ArrayList<AbxPermission.List>();
        }
        return this.list;
    }

    /**
     * Recupera il valore della proprietà defaultObjActionList.
     * 
     * @return
     *     possible object is
     *     {@link AbxObjAction }
     *     
     */
    public AbxObjAction getDefaultObjActionList() {
        return defaultObjActionList;
    }

    /**
     * Imposta il valore della proprietà defaultObjActionList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxObjAction }
     *     
     */
    public void setDefaultObjActionList(AbxObjAction value) {
        this.defaultObjActionList = value;
    }

    /**
     * Recupera il valore della proprietà editPermission.
     * 
     * @return
     *     possible object is
     *     {@link AbxPermission.EditPermission }
     *     
     */
    public AbxPermission.EditPermission getEditPermission() {
        return editPermission;
    }

    /**
     * Imposta il valore della proprietà editPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxPermission.EditPermission }
     *     
     */
    public void setEditPermission(AbxPermission.EditPermission value) {
        this.editPermission = value;
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
     *         &lt;element name="editUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="editCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="editTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="permissionSettings" type="{http://ws.abx/}abxEditPermissionList"/>
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
        "editUserName",
        "editCode",
        "editTimeStamp",
        "permissionSettings"
    })
    public static class EditPermission {

        @XmlElement(required = true)
        protected String editUserName;
        @XmlElement(required = true)
        protected String editCode;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar editTimeStamp;
        @XmlElement(required = true)
        protected AbxEditPermissionList permissionSettings;

        /**
         * Recupera il valore della proprietà editUserName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditUserName() {
            return editUserName;
        }

        /**
         * Imposta il valore della proprietà editUserName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditUserName(String value) {
            this.editUserName = value;
        }

        /**
         * Recupera il valore della proprietà editCode.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEditCode() {
            return editCode;
        }

        /**
         * Imposta il valore della proprietà editCode.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEditCode(String value) {
            this.editCode = value;
        }

        /**
         * Recupera il valore della proprietà editTimeStamp.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEditTimeStamp() {
            return editTimeStamp;
        }

        /**
         * Imposta il valore della proprietà editTimeStamp.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEditTimeStamp(XMLGregorianCalendar value) {
            this.editTimeStamp = value;
        }

        /**
         * Recupera il valore della proprietà permissionSettings.
         * 
         * @return
         *     possible object is
         *     {@link AbxEditPermissionList }
         *     
         */
        public AbxEditPermissionList getPermissionSettings() {
            return permissionSettings;
        }

        /**
         * Imposta il valore della proprietà permissionSettings.
         * 
         * @param value
         *     allowed object is
         *     {@link AbxEditPermissionList }
         *     
         */
        public void setPermissionSettings(AbxEditPermissionList value) {
            this.permissionSettings = value;
        }

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
     *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "actionName",
        "value"
    })
    public static class List {

        @XmlElement(required = true)
        protected String actionName;
        protected boolean value;

        /**
         * Recupera il valore della proprietà actionName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionName() {
            return actionName;
        }

        /**
         * Imposta il valore della proprietà actionName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionName(String value) {
            this.actionName = value;
        }

        /**
         * Recupera il valore della proprietà value.
         * 
         */
        public boolean isValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         */
        public void setValue(boolean value) {
            this.value = value;
        }

    }

}
