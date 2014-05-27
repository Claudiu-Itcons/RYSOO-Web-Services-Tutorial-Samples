
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskExcelPreviewRow complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskExcelPreviewRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rowId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskExcelPreviewRow", propOrder = {
    "columnId",
    "rowId",
    "value"
})
public class AbxSDKTaskExcelPreviewRow {

    protected int columnId;
    protected int rowId;
    @XmlElement(required = true)
    protected String value;

    /**
     * Recupera il valore della proprietà columnId.
     * 
     */
    public int getColumnId() {
        return columnId;
    }

    /**
     * Imposta il valore della proprietà columnId.
     * 
     */
    public void setColumnId(int value) {
        this.columnId = value;
    }

    /**
     * Recupera il valore della proprietà rowId.
     * 
     */
    public int getRowId() {
        return rowId;
    }

    /**
     * Imposta il valore della proprietà rowId.
     * 
     */
    public void setRowId(int value) {
        this.rowId = value;
    }

    /**
     * Recupera il valore della proprietà value.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Imposta il valore della proprietà value.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
