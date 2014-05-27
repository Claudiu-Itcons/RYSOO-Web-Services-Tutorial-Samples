
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxFileResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxFileResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="list" type="{http://ws.abx/}abxFileList"/>
 *         &lt;element name="optionalMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxFileResult", propOrder = {
    "result",
    "list",
    "optionalMessage"
})
public class AbxFileResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxFileList list;
    @XmlElement(required = true)
    protected String optionalMessage;

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
     *     {@link AbxFileList }
     *     
     */
    public AbxFileList getList() {
        return list;
    }

    /**
     * Imposta il valore della proprietà list.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFileList }
     *     
     */
    public void setList(AbxFileList value) {
        this.list = value;
    }

    /**
     * Recupera il valore della proprietà optionalMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalMessage() {
        return optionalMessage;
    }

    /**
     * Imposta il valore della proprietà optionalMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalMessage(String value) {
        this.optionalMessage = value;
    }

}
