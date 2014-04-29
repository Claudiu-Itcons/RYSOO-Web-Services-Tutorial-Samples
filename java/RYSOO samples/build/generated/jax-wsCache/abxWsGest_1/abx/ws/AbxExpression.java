
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxExpression complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="translationList" type="{http://ws.abx/}abxTranslation"/>
 *         &lt;element name="expressionName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultExpression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="returnWrongKeys">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
@XmlType(name = "abxExpression", propOrder = {
    "id",
    "instanceName",
    "translationList",
    "expressionName",
    "defaultLanguage",
    "defaultExpression",
    "returnWrongKeys"
})
public class AbxExpression {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(required = true)
    protected AbxTranslation translationList;
    @XmlElement(required = true)
    protected String expressionName;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(required = true)
    protected String defaultExpression;
    @XmlElement(required = true)
    protected AbxExpression.ReturnWrongKeys returnWrongKeys;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Recupera il valore della proprietà translationList.
     * 
     * @return
     *     possible object is
     *     {@link AbxTranslation }
     *     
     */
    public AbxTranslation getTranslationList() {
        return translationList;
    }

    /**
     * Imposta il valore della proprietà translationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTranslation }
     *     
     */
    public void setTranslationList(AbxTranslation value) {
        this.translationList = value;
    }

    /**
     * Recupera il valore della proprietà expressionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpressionName() {
        return expressionName;
    }

    /**
     * Imposta il valore della proprietà expressionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpressionName(String value) {
        this.expressionName = value;
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

    /**
     * Recupera il valore della proprietà defaultExpression.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultExpression() {
        return defaultExpression;
    }

    /**
     * Imposta il valore della proprietà defaultExpression.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultExpression(String value) {
        this.defaultExpression = value;
    }

    /**
     * Recupera il valore della proprietà returnWrongKeys.
     * 
     * @return
     *     possible object is
     *     {@link AbxExpression.ReturnWrongKeys }
     *     
     */
    public AbxExpression.ReturnWrongKeys getReturnWrongKeys() {
        return returnWrongKeys;
    }

    /**
     * Imposta il valore della proprietà returnWrongKeys.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxExpression.ReturnWrongKeys }
     *     
     */
    public void setReturnWrongKeys(AbxExpression.ReturnWrongKeys value) {
        this.returnWrongKeys = value;
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
     *         &lt;element name="key" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "key"
    })
    public static class ReturnWrongKeys {

        @XmlElement(required = true)
        protected List<String> key;

        /**
         * Gets the value of the key property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the key property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKey().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getKey() {
            if (key == null) {
                key = new ArrayList<String>();
            }
            return this.key;
        }

    }

}
