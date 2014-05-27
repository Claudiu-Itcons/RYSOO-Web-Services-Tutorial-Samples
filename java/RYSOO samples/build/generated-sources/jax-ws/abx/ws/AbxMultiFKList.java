
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxMultiFKList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxMultiFKList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="multiFK" type="{http://ws.abx/}abxMultiFK" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxMultiFKList", propOrder = {
    "multiFK"
})
public class AbxMultiFKList {

    @XmlElement(required = true)
    protected List<AbxMultiFK> multiFK;

    /**
     * Gets the value of the multiFK property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multiFK property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultiFK().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxMultiFK }
     * 
     * 
     */
    public List<AbxMultiFK> getMultiFK() {
        if (multiFK == null) {
            multiFK = new ArrayList<AbxMultiFK>();
        }
        return this.multiFK;
    }

}
