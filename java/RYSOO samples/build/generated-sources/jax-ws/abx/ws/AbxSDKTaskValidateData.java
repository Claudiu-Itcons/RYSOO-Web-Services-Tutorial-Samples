
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskValidateData complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskValidateData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detailedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fields" type="{http://ws.abx/}abxSDKTaskValidateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="filesAttach" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskValidateData", propOrder = {
    "detailedMessage",
    "fields",
    "filesAttach"
})
public class AbxSDKTaskValidateData {

    protected String detailedMessage;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskValidateField> fields;
    @XmlElement(nillable = true)
    protected List<String> filesAttach;

    /**
     * Recupera il valore della proprietà detailedMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedMessage() {
        return detailedMessage;
    }

    /**
     * Imposta il valore della proprietà detailedMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedMessage(String value) {
        this.detailedMessage = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskValidateField }
     * 
     * 
     */
    public List<AbxSDKTaskValidateField> getFields() {
        if (fields == null) {
            fields = new ArrayList<AbxSDKTaskValidateField>();
        }
        return this.fields;
    }

    /**
     * Gets the value of the filesAttach property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filesAttach property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilesAttach().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFilesAttach() {
        if (filesAttach == null) {
            filesAttach = new ArrayList<String>();
        }
        return this.filesAttach;
    }

}
