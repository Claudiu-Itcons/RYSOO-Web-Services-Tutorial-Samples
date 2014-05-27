
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxTemplateResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxTemplateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="list" type="{http://ws.abx/}abxTemplateList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxTemplateResult", propOrder = {
    "result",
    "list"
})
public class AbxTemplateResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxTemplateList list;

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
     * Recupera il valore della proprietà list.
     * 
     * @return
     *     possible object is
     *     {@link AbxTemplateList }
     *     
     */
    public AbxTemplateList getList() {
        return list;
    }

    /**
     * Imposta il valore della proprietà list.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTemplateList }
     *     
     */
    public void setList(AbxTemplateList value) {
        this.list = value;
    }

}
