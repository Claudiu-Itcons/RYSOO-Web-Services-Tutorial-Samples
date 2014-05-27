
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxRetQueryResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxRetQueryResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="submittedQuery" type="{http://ws.abx/}abxQexpression"/>
 *         &lt;element name="queryResults" type="{http://ws.abx/}abxResultsList"/>
 *         &lt;element name="queryTotalFound" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxRetQueryResult", propOrder = {
    "result",
    "submittedQuery",
    "queryResults",
    "queryTotalFound"
})
public class AbxRetQueryResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxQexpression submittedQuery;
    @XmlElement(required = true)
    protected AbxResultsList queryResults;
    @XmlSchemaType(name = "unsignedInt")
    protected long queryTotalFound;

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
     * Recupera il valore della proprietà submittedQuery.
     * 
     * @return
     *     possible object is
     *     {@link AbxQexpression }
     *     
     */
    public AbxQexpression getSubmittedQuery() {
        return submittedQuery;
    }

    /**
     * Imposta il valore della proprietà submittedQuery.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQexpression }
     *     
     */
    public void setSubmittedQuery(AbxQexpression value) {
        this.submittedQuery = value;
    }

    /**
     * Recupera il valore della proprietà queryResults.
     * 
     * @return
     *     possible object is
     *     {@link AbxResultsList }
     *     
     */
    public AbxResultsList getQueryResults() {
        return queryResults;
    }

    /**
     * Imposta il valore della proprietà queryResults.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxResultsList }
     *     
     */
    public void setQueryResults(AbxResultsList value) {
        this.queryResults = value;
    }

    /**
     * Recupera il valore della proprietà queryTotalFound.
     * 
     */
    public long getQueryTotalFound() {
        return queryTotalFound;
    }

    /**
     * Imposta il valore della proprietà queryTotalFound.
     * 
     */
    public void setQueryTotalFound(long value) {
        this.queryTotalFound = value;
    }

}
