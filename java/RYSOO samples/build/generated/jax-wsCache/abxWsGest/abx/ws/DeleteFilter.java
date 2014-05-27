
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per DeleteFilter complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="DeleteFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="filters" type="{http://ws.abx/}AbxFilterList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteFilter", propOrder = {
    "sessionId",
    "filters"
})
public class DeleteFilter {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected AbxFilterList filters;

    /**
     * Recupera il valore della proprietà sessionId.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getSessionId() {
        return sessionId;
    }

    /**
     * Imposta il valore della proprietà sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setSessionId(IDtype value) {
        this.sessionId = value;
    }

    /**
     * Recupera il valore della proprietà filters.
     * 
     * @return
     *     possible object is
     *     {@link AbxFilterList }
     *     
     */
    public AbxFilterList getFilters() {
        return filters;
    }

    /**
     * Imposta il valore della proprietà filters.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFilterList }
     *     
     */
    public void setFilters(AbxFilterList value) {
        this.filters = value;
    }

}
