
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxQtemplate complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxQtemplate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abxQtemplate", propOrder = {
    "templateName",
    "fields"
})
public class AbxQtemplate {

    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected AbxQFieldList fields;

    /**
     * Recupera il valore della proprietà templateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Imposta il valore della proprietà templateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
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
