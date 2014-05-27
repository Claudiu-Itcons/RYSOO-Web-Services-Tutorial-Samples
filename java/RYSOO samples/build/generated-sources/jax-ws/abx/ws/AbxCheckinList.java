
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxCheckinList complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxCheckinList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataList" type="{http://ws.abx/}abxCheckin"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxCheckinList", propOrder = {
    "dataList"
})
public class AbxCheckinList {

    @XmlElement(required = true)
    protected AbxCheckin dataList;

    /**
     * Recupera il valore della proprietà dataList.
     * 
     * @return
     *     possible object is
     *     {@link AbxCheckin }
     *     
     */
    public AbxCheckin getDataList() {
        return dataList;
    }

    /**
     * Imposta il valore della proprietà dataList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxCheckin }
     *     
     */
    public void setDataList(AbxCheckin value) {
        this.dataList = value;
    }

}
