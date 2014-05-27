
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxCombo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxCombo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listRecords" type="{http://ws.abx/}abxComboRecord" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxCombo", propOrder = {
    "listRecords"
})
public class AbxCombo {

    @XmlElement(required = true)
    protected List<AbxComboRecord> listRecords;

    /**
     * Gets the value of the listRecords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listRecords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListRecords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxComboRecord }
     * 
     * 
     */
    public List<AbxComboRecord> getListRecords() {
        if (listRecords == null) {
            listRecords = new ArrayList<AbxComboRecord>();
        }
        return this.listRecords;
    }

}
