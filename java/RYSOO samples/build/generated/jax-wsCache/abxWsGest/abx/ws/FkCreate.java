
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Fk_create complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="Fk_create">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="fieldName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fkp" type="{http://ws.abx/}abxFK" minOccurs="0"/>
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
@XmlType(name = "Fk_create", propOrder = {
    "sessionId",
    "fieldName",
    "fkp",
    "optionGetCache",
    "optionSetDesc"
})
public class FkCreate {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    protected String fieldName;
    protected AbxFK fkp;
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
     * Recupera il valore della proprietà fkp.
     * 
     * @return
     *     possible object is
     *     {@link AbxFK }
     *     
     */
    public AbxFK getFkp() {
        return fkp;
    }

    /**
     * Imposta il valore della proprietà fkp.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFK }
     *     
     */
    public void setFkp(AbxFK value) {
        this.fkp = value;
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
