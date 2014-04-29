
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Fk_WS_insert complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fk_WS_insert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wsdlUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="optionGetCache" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="optionSetDesc" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fk_WS_insert", propOrder = {
    "sessionId",
    "fieldName",
    "fkName",
    "wsdlUrl",
    "user",
    "pwd",
    "optionGetCache",
    "optionSetDesc"
})
public class FkWSInsert {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String fieldName;
    protected String fkName;
    protected String wsdlUrl;
    protected String user;
    protected String pwd;
    protected boolean optionGetCache;
    protected boolean optionSetDesc;

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
     * Recupera il valore della proprietà fieldName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Imposta il valore della proprietà fieldName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Recupera il valore della proprietà fkName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFkName() {
        return fkName;
    }

    /**
     * Imposta il valore della proprietà fkName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFkName(String value) {
        this.fkName = value;
    }

    /**
     * Recupera il valore della proprietà wsdlUrl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsdlUrl() {
        return wsdlUrl;
    }

    /**
     * Imposta il valore della proprietà wsdlUrl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsdlUrl(String value) {
        this.wsdlUrl = value;
    }

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Recupera il valore della proprietà pwd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * Imposta il valore della proprietà pwd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPwd(String value) {
        this.pwd = value;
    }

    /**
     * Recupera il valore della proprietà optionGetCache.
     * 
     */
    public boolean isOptionGetCache() {
        return optionGetCache;
    }

    /**
     * Imposta il valore della proprietà optionGetCache.
     * 
     */
    public void setOptionGetCache(boolean value) {
        this.optionGetCache = value;
    }

    /**
     * Recupera il valore della proprietà optionSetDesc.
     * 
     */
    public boolean isOptionSetDesc() {
        return optionSetDesc;
    }

    /**
     * Imposta il valore della proprietà optionSetDesc.
     * 
     */
    public void setOptionSetDesc(boolean value) {
        this.optionSetDesc = value;
    }

}
