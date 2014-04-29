
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTaskExcelPreviewColumn complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTaskExcelPreviewColumn">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="columnWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTaskExcelPreviewColumn", propOrder = {
    "columnId",
    "columnWidth"
})
public class AbxSDKTaskExcelPreviewColumn {

    protected int columnId;
    protected int columnWidth;

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
     * Recupera il valore della proprietà columnWidth.
     * 
     */
    public int getColumnWidth() {
        return columnWidth;
    }

    /**
     * Imposta il valore della proprietà columnWidth.
     * 
     */
    public void setColumnWidth(int value) {
        this.columnWidth = value;
    }

}
