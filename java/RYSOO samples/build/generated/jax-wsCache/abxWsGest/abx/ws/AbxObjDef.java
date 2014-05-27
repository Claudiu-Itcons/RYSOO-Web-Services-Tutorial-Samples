
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxObjDef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxObjDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elobj" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="methods" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "abxObjDef", propOrder = {
    "elobj",
    "xxx"
})
public class AbxObjDef {

    @XmlElement(required = true)
    protected List<AbxObjDef.Elobj> elobj;
    @XmlElement(required = true)
    protected Object xxx;

    /**
     * Gets the value of the elobj property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elobj property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElobj().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxObjDef.Elobj }
     * 
     * 
     */
    public List<AbxObjDef.Elobj> getElobj() {
        if (elobj == null) {
            elobj = new ArrayList<AbxObjDef.Elobj>();
        }
        return this.elobj;
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
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="methods" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    @XmlType(name = "", propOrder = {
        "objName",
        "description",
        "methods"
    })
    public static class Elobj {

        @XmlElement(required = true)
        protected String objName;
        @XmlElement(required = true)
        protected String description;
        @XmlElement(required = true)
        protected List<AbxObjDef.Elobj.Methods> methods;

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
         * Recupera il valore della proprietà description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Imposta il valore della proprietà description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the methods property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the methods property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMethods().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AbxObjDef.Elobj.Methods }
         * 
         * 
         */
        public List<AbxObjDef.Elobj.Methods> getMethods() {
            if (methods == null) {
                methods = new ArrayList<AbxObjDef.Elobj.Methods>();
            }
            return this.methods;
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
         *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "methodName"
        })
        public static class Methods {

            @XmlElement(required = true)
            protected String methodName;

            /**
             * Recupera il valore della proprietà methodName.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethodName() {
                return methodName;
            }

            /**
             * Imposta il valore della proprietà methodName.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethodName(String value) {
                this.methodName = value;
            }

        }

    }

}
