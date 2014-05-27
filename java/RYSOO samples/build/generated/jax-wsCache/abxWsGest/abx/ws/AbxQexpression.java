
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQexpression complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQexpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="expression" type="{http://ws.abx/}abxQnode"/>
 *         &lt;element name="option4Query" type="{http://ws.abx/}abxOption4Query"/>
 *         &lt;element name="queryType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryTypeDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryLimit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="queryOffset" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQexpression", propOrder = {
    "expression",
    "option4Query",
    "queryType",
    "queryTypeDetail",
    "queryLimit",
    "queryOffset"
})
public class AbxQexpression {

    @XmlElement(required = true)
    protected AbxQnode expression;
    @XmlElement(required = true)
    protected AbxOption4Query option4Query;
    @XmlElement(required = true)
    protected String queryType;
    @XmlElement(required = true)
    protected String queryTypeDetail;
    @XmlElement(required = true)
    protected String queryLimit;
    @XmlElement(required = true)
    protected String queryOffset;

    /**
     * Recupera il valore della proprietà expression.
     * 
     * @return
     *     possible object is
     *     {@link AbxQnode }
     *     
     */
    public AbxQnode getExpression() {
        return expression;
    }

    /**
     * Imposta il valore della proprietà expression.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQnode }
     *     
     */
    public void setExpression(AbxQnode value) {
        this.expression = value;
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

    /**
     * Recupera il valore della proprietà queryType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryType() {
        return queryType;
    }

    /**
     * Imposta il valore della proprietà queryType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryType(String value) {
        this.queryType = value;
    }

    /**
     * Recupera il valore della proprietà queryTypeDetail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryTypeDetail() {
        return queryTypeDetail;
    }

    /**
     * Imposta il valore della proprietà queryTypeDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryTypeDetail(String value) {
        this.queryTypeDetail = value;
    }

    /**
     * Recupera il valore della proprietà queryLimit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryLimit() {
        return queryLimit;
    }

    /**
     * Imposta il valore della proprietà queryLimit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryLimit(String value) {
        this.queryLimit = value;
    }

    /**
     * Recupera il valore della proprietà queryOffset.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryOffset() {
        return queryOffset;
    }

    /**
     * Imposta il valore della proprietà queryOffset.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryOffset(String value) {
        this.queryOffset = value;
    }

}
