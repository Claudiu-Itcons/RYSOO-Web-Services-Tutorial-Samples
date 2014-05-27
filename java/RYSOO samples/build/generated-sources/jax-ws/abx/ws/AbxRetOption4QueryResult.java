
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxRetOption4QueryResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxRetOption4QueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="allFields" type="{http://ws.abx/}abxQFieldList"/>
 *         &lt;element name="allFieldsByObject" type="{http://ws.abx/}abxQobjectList"/>
 *         &lt;element name="allFieldsByTemplate" type="{http://ws.abx/}abxQtemplateList"/>
 *         &lt;element name="commonFields" type="{http://ws.abx/}abxQFieldList"/>
 *         &lt;element name="option4Query" type="{http://ws.abx/}abxOption4Query"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxRetOption4QueryResult", propOrder = {
    "result",
    "allFields",
    "allFieldsByObject",
    "allFieldsByTemplate",
    "commonFields",
    "option4Query"
})
public class AbxRetOption4QueryResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxQFieldList allFields;
    @XmlElement(required = true)
    protected AbxQobjectList allFieldsByObject;
    @XmlElement(required = true)
    protected AbxQtemplateList allFieldsByTemplate;
    @XmlElement(required = true)
    protected AbxQFieldList commonFields;
    @XmlElement(required = true)
    protected AbxOption4Query option4Query;

    /**
     * Recupera il valore della proprietà result.
     * 
     */
    public long getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     */
    public void setResult(long value) {
        this.result = value;
    }

    /**
     * Recupera il valore della proprietà allFields.
     * 
     * @return
     *     possible object is
     *     {@link AbxQFieldList }
     *     
     */
    public AbxQFieldList getAllFields() {
        return allFields;
    }

    /**
     * Imposta il valore della proprietà allFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQFieldList }
     *     
     */
    public void setAllFields(AbxQFieldList value) {
        this.allFields = value;
    }

    /**
     * Recupera il valore della proprietà allFieldsByObject.
     * 
     * @return
     *     possible object is
     *     {@link AbxQobjectList }
     *     
     */
    public AbxQobjectList getAllFieldsByObject() {
        return allFieldsByObject;
    }

    /**
     * Imposta il valore della proprietà allFieldsByObject.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQobjectList }
     *     
     */
    public void setAllFieldsByObject(AbxQobjectList value) {
        this.allFieldsByObject = value;
    }

    /**
     * Recupera il valore della proprietà allFieldsByTemplate.
     * 
     * @return
     *     possible object is
     *     {@link AbxQtemplateList }
     *     
     */
    public AbxQtemplateList getAllFieldsByTemplate() {
        return allFieldsByTemplate;
    }

    /**
     * Imposta il valore della proprietà allFieldsByTemplate.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQtemplateList }
     *     
     */
    public void setAllFieldsByTemplate(AbxQtemplateList value) {
        this.allFieldsByTemplate = value;
    }

    /**
     * Recupera il valore della proprietà commonFields.
     * 
     * @return
     *     possible object is
     *     {@link AbxQFieldList }
     *     
     */
    public AbxQFieldList getCommonFields() {
        return commonFields;
    }

    /**
     * Imposta il valore della proprietà commonFields.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQFieldList }
     *     
     */
    public void setCommonFields(AbxQFieldList value) {
        this.commonFields = value;
    }

    /**
     * Recupera il valore della proprietà option4Query.
     * 
     * @return
     *     possible object is
     *     {@link AbxOption4Query }
     *     
     */
    public AbxOption4Query getOption4Query() {
        return option4Query;
    }

    /**
     * Imposta il valore della proprietà option4Query.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxOption4Query }
     *     
     */
    public void setOption4Query(AbxOption4Query value) {
        this.option4Query = value;
    }

}
