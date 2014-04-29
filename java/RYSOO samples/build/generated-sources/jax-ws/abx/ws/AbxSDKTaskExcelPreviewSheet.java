
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskExcelPreviewSheet complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskExcelPreviewSheet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columns" type="{http://ws.abx/}abxSDKTaskExcelPreviewColumn" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rows" type="{http://ws.abx/}abxSDKTaskExcelPreviewRow" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskExcelPreviewSheet", propOrder = {
    "columnCount",
    "rowCount",
    "columns",
    "rows"
})
public class AbxSDKTaskExcelPreviewSheet {

    protected int columnCount;
    protected int rowCount;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskExcelPreviewColumn> columns;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskExcelPreviewRow> rows;

    /**
     * Recupera il valore della proprietà columnCount.
     * 
     */
    public int getColumnCount() {
        return columnCount;
    }

    /**
     * Imposta il valore della proprietà columnCount.
     * 
     */
    public void setColumnCount(int value) {
        this.columnCount = value;
    }

    /**
     * Recupera il valore della proprietà rowCount.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Imposta il valore della proprietà rowCount.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskExcelPreviewColumn }
     * 
     * 
     */
    public List<AbxSDKTaskExcelPreviewColumn> getColumns() {
        if (columns == null) {
            columns = new ArrayList<AbxSDKTaskExcelPreviewColumn>();
        }
        return this.columns;
    }

    /**
     * Gets the value of the rows property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rows property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRows().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskExcelPreviewRow }
     * 
     * 
     */
    public List<AbxSDKTaskExcelPreviewRow> getRows() {
        if (rows == null) {
            rows = new ArrayList<AbxSDKTaskExcelPreviewRow>();
        }
        return this.rows;
    }

}
