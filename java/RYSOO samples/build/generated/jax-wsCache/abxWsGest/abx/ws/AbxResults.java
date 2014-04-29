
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxResults complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxResults">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="headColumn" type="{http://ws.abx/}abxQcHeadList"/>
 *         &lt;element name="matrix" type="{http://ws.abx/}abxQrowList"/>
 *         &lt;element name="containerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxResults", propOrder = {
    "headColumn",
    "matrix",
    "containerName"
})
public class AbxResults {

    @XmlElement(required = true)
    protected AbxQcHeadList headColumn;
    @XmlElement(required = true)
    protected AbxQrowList matrix;
    @XmlElement(required = true)
    protected String containerName;

    /**
     * Recupera il valore della proprietà headColumn.
     * 
     * @return
     *     possible object is
     *     {@link AbxQcHeadList }
     *     
     */
    public AbxQcHeadList getHeadColumn() {
        return headColumn;
    }

    /**
     * Imposta il valore della proprietà headColumn.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQcHeadList }
     *     
     */
    public void setHeadColumn(AbxQcHeadList value) {
        this.headColumn = value;
    }

    /**
     * Recupera il valore della proprietà matrix.
     * 
     * @return
     *     possible object is
     *     {@link AbxQrowList }
     *     
     */
    public AbxQrowList getMatrix() {
        return matrix;
    }

    /**
     * Imposta il valore della proprietà matrix.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxQrowList }
     *     
     */
    public void setMatrix(AbxQrowList value) {
        this.matrix = value;
    }

    /**
     * Recupera il valore della proprietà containerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * Imposta il valore della proprietà containerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContainerName(String value) {
        this.containerName = value;
    }

}
