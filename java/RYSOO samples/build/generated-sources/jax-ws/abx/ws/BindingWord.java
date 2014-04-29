
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bindingWord complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bindingWord">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContainerField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentFieldType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingWord", propOrder = {
    "containerField",
    "documentField",
    "documentFieldType",
    "userField"
})
public class BindingWord {

    @XmlElement(name = "ContainerField", required = true)
    protected String containerField;
    @XmlElement(name = "DocumentField", required = true)
    protected String documentField;
    @XmlElement(name = "DocumentFieldType", required = true)
    protected String documentFieldType;
    @XmlElement(name = "UserField")
    protected boolean userField;

    /**
     * Recupera il valore della proprietà containerField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerField() {
        return containerField;
    }

    /**
     * Imposta il valore della proprietà containerField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerField(String value) {
        this.containerField = value;
    }

    /**
     * Recupera il valore della proprietà documentField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentField() {
        return documentField;
    }

    /**
     * Imposta il valore della proprietà documentField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentField(String value) {
        this.documentField = value;
    }

    /**
     * Recupera il valore della proprietà documentFieldType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentFieldType() {
        return documentFieldType;
    }

    /**
     * Imposta il valore della proprietà documentFieldType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentFieldType(String value) {
        this.documentFieldType = value;
    }

    /**
     * Recupera il valore della proprietà userField.
     * 
     */
    public boolean isUserField() {
        return userField;
    }

    /**
     * Imposta il valore della proprietà userField.
     * 
     */
    public void setUserField(boolean value) {
        this.userField = value;
    }

}
