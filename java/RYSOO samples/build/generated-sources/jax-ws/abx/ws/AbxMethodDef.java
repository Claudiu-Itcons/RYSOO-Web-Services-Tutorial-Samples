
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxMethodDef complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxMethodDef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elmethod" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abxMethodDef", propOrder = {
    "elmethod",
    "xxx"
})
public class AbxMethodDef {

    @XmlElement(required = true)
    protected List<AbxMethodDef.Elmethod> elmethod;
    @XmlElement(required = true)
    protected Object xxx;

    /**
     * Gets the value of the elmethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elmethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElmethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxMethodDef.Elmethod }
     * 
     * 
     */
    public List<AbxMethodDef.Elmethod> getElmethod() {
        if (elmethod == null) {
            elmethod = new ArrayList<AbxMethodDef.Elmethod>();
        }
        return this.elmethod;
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
     *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "methodName",
        "description"
    })
    public static class Elmethod {

        @XmlElement(required = true)
        protected String methodName;
        @XmlElement(required = true)
        protected String description;

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

    }

}
