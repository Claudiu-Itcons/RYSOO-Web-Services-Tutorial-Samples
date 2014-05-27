
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxLoginResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxLoginResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="sessionIDF" type="{http://ws.abx/}IDtype"/>
 *         &lt;element name="loginInfo" type="{http://ws.abx/}abxLoginInfo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxLoginResult", propOrder = {
    "result",
    "sessionIDF",
    "loginInfo"
})
public class AbxLoginResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected IDtype sessionIDF;
    @XmlElement(required = true)
    protected AbxLoginInfo loginInfo;

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
     * Recupera il valore della proprietà sessionIDF.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getSessionIDF() {
        return sessionIDF;
    }

    /**
     * Imposta il valore della proprietà sessionIDF.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setSessionIDF(IDtype value) {
        this.sessionIDF = value;
    }

    /**
     * Recupera il valore della proprietà loginInfo.
     * 
     * @return
     *     possible object is
     *     {@link AbxLoginInfo }
     *     
     */
    public AbxLoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Imposta il valore della proprietà loginInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxLoginInfo }
     *     
     */
    public void setLoginInfo(AbxLoginInfo value) {
        this.loginInfo = value;
    }

}
