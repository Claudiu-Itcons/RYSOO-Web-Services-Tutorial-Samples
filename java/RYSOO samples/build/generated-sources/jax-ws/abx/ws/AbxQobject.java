
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQobject complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQobject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObjName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fields" type="{http://ws.abx/}abxQFieldList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxQobject", propOrder = {
    "objName",
    "fields"
})
public class AbxQobject {

    @XmlElement(name = "ObjName", required = true)
    protected String objName;
    @XmlElement(required = true)
    protected AbxQFieldList fields;

    /**
     * Recupera il valore della proprietà objName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Imposta il valore della proprietà objName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Recupera il valore della proprietà fields.
     * 
     * @return
     *     possible object is
     *     {@link AbxQFieldList }
     *     
     */
    public AbxQFieldList getFields() {
        return fields;
    }

    /**
     * Imposta il valore della proprietà fields.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQFieldList }
     *     
     */
    public void setFields(AbxQFieldList value) {
        this.fields = value;
    }

}
