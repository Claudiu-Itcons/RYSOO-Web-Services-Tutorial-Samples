
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per ModifyField complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="ModifyField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="Field2Update" type="{http://ws.abx/}abxField" minOccurs="0"/>
 *         &lt;element name="recordsArray" type="{http://ws.abx/}abxCombo" minOccurs="0"/>
 *         &lt;element name="fk" type="{http://ws.abx/}abxFK" minOccurs="0"/>
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
@XmlType(name = "ModifyField", propOrder = {
    "sessionId",
    "field2Update",
    "recordsArray",
    "fk",
    "optionGetCache",
    "optionSetDesc"
})
public class ModifyField {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "Field2Update")
    protected AbxField field2Update;
    protected AbxCombo recordsArray;
    protected AbxFK fk;
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
     * Recupera il valore della proprietà field2Update.
     * 
     * @return
     *     possible object is
     *     {@link AbxField }
     *     
     */
    public AbxField getField2Update() {
        return field2Update;
    }

    /**
     * Imposta il valore della proprietà field2Update.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxField }
     *     
     */
    public void setField2Update(AbxField value) {
        this.field2Update = value;
    }

    /**
     * Recupera il valore della proprietà recordsArray.
     * 
     * @return
     *     possible object is
     *     {@link AbxCombo }
     *     
     */
    public AbxCombo getRecordsArray() {
        return recordsArray;
    }

    /**
     * Imposta il valore della proprietà recordsArray.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxCombo }
     *     
     */
    public void setRecordsArray(AbxCombo value) {
        this.recordsArray = value;
    }

    /**
     * Recupera il valore della proprietà fk.
     * 
     * @return
     *     possible object is
     *     {@link AbxFK }
     *     
     */
    public AbxFK getFk() {
        return fk;
    }

    /**
     * Imposta il valore della proprietà fk.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxFK }
     *     
     */
    public void setFk(AbxFK value) {
        this.fk = value;
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
