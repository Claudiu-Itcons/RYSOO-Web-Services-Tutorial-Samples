
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bindingExcel complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bindingExcel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContainerField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UserField" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DescriptionField" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Sheet" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bindingExcel", propOrder = {
    "containerField",
    "userField",
    "descriptionField",
    "column",
    "row",
    "sheet"
})
public class BindingExcel {

    @XmlElement(name = "ContainerField", required = true)
    protected String containerField;
    @XmlElement(name = "UserField")
    protected boolean userField;
    @XmlElement(name = "DescriptionField", required = true)
    protected String descriptionField;
    @XmlElement(name = "Column")
    protected int column;
    @XmlElement(name = "Row")
    protected int row;
    @XmlElement(name = "Sheet")
    protected int sheet;

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

    /**
     * Recupera il valore della proprietà descriptionField.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionField() {
        return descriptionField;
    }

    /**
     * Imposta il valore della proprietà descriptionField.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionField(String value) {
        this.descriptionField = value;
    }

    /**
     * Recupera il valore della proprietà column.
     * 
     */
    public int getColumn() {
        return column;
    }

    /**
     * Imposta il valore della proprietà column.
     * 
     */
    public void setColumn(int value) {
        this.column = value;
    }

    /**
     * Recupera il valore della proprietà row.
     * 
     */
    public int getRow() {
        return row;
    }

    /**
     * Imposta il valore della proprietà row.
     * 
     */
    public void setRow(int value) {
        this.row = value;
    }

    /**
     * Recupera il valore della proprietà sheet.
     * 
     */
    public int getSheet() {
        return sheet;
    }

    /**
     * Imposta il valore della proprietà sheet.
     * 
     */
    public void setSheet(int value) {
        this.sheet = value;
    }

}
