
package abx.ws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxObjAction complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxObjAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="list" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="action_in_tree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                   &lt;element name="actionDescription" type="{http://ws.abx/}abxTranslation"/>
 *                   &lt;element name="defaultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xxx" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxObjAction", propOrder = {
    "list",
    "xxx"
})
public class AbxObjAction {

    @XmlElement(required = true)
    protected java.util.List<AbxObjAction.List> list;
    @XmlElement(required = true)
    protected Object xxx;

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
     * {@link AbxObjAction.List }
     * 
     * 
     */
    public java.util.List<AbxObjAction.List> getList() {
        if (list == null) {
            list = new ArrayList<AbxObjAction.List>();
        }
        return this.list;
    }

    /**
     * Recupera il valore della proprietà xxx.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getXxx() {
        return xxx;
    }

    /**
     * Imposta il valore della proprietà xxx.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setXxx(Object value) {
        this.xxx = value;
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
     *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="actionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="action_in_tree" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *         &lt;element name="actionDescription" type="{http://ws.abx/}abxTranslation"/>
     *         &lt;element name="defaultDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "objName",
        "actionName",
        "positionId",
        "value",
        "actionInTree",
        "actionDescription",
        "defaultDescription",
        "defaultLanguage"
    })
    public static class List {

        @XmlElement(required = true)
        protected String objName;
        @XmlElement(required = true)
        protected String actionName;
        @XmlElement(required = true)
        protected String positionId;
        @XmlElement(required = true)
        protected String value;
        @XmlElement(name = "action_in_tree")
        protected boolean actionInTree;
        @XmlElement(required = true)
        protected AbxTranslation actionDescription;
        @XmlElement(required = true)
        protected String defaultDescription;
        @XmlElement(required = true)
        protected String defaultLanguage;

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

        /**
         * Recupera il valore della proprietà actionInTree.
         * 
         */
        public boolean isActionInTree() {
            return actionInTree;
        }

        /**
         * Imposta il valore della proprietà actionInTree.
         * 
         */
        public void setActionInTree(boolean value) {
            this.actionInTree = value;
        }

        /**
         * Recupera il valore della proprietà actionDescription.
         * 
         * @return
         *     possible object is
         *     {@link AbxTranslation }
         *     
         */
        public AbxTranslation getActionDescription() {
            return actionDescription;
        }

        /**
         * Imposta il valore della proprietà actionDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link AbxTranslation }
         *     
         */
        public void setActionDescription(AbxTranslation value) {
            this.actionDescription = value;
        }

        /**
         * Recupera il valore della proprietà defaultDescription.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultDescription() {
            return defaultDescription;
        }

        /**
         * Imposta il valore della proprietà defaultDescription.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultDescription(String value) {
            this.defaultDescription = value;
        }

        /**
         * Recupera il valore della proprietà defaultLanguage.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDefaultLanguage() {
            return defaultLanguage;
        }

        /**
         * Imposta il valore della proprietà defaultLanguage.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDefaultLanguage(String value) {
            this.defaultLanguage = value;
        }

    }

}
