
package org.netbeans.xml.schema.abxdynaminorg;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxDynorgTypeResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxDynorgTypeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="types" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgTypeList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxDynorgTypeResult", propOrder = {
    "result",
    "types"
})
public class AbxDynorgTypeResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxDynamicorgTypeList types;

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
     * Recupera il valore della proprietà types.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynamicorgTypeList }
     *     
     */
    public AbxDynamicorgTypeList getTypes() {
        return types;
    }

    /**
     * Imposta il valore della proprietà types.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynamicorgTypeList }
     *     
     */
    public void setTypes(AbxDynamicorgTypeList value) {
        this.types = value;
    }

}
