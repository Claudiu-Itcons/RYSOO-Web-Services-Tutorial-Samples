
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxLink complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromTableId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toTableId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="countLinks" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fromInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="linkId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxLink", propOrder = {
    "fromTable",
    "toTable",
    "fromTableId",
    "toTableId",
    "countLinks",
    "fromInstanceName",
    "toInstanceName",
    "note",
    "linkId"
})
public class AbxLink {

    @XmlElement(required = true)
    protected String fromTable;
    @XmlElement(required = true)
    protected String toTable;
    @XmlElement(required = true)
    protected String fromTableId;
    @XmlElement(required = true)
    protected String toTableId;
    protected int countLinks;
    @XmlElement(required = true)
    protected String fromInstanceName;
    @XmlElement(required = true)
    protected String toInstanceName;
    @XmlElement(required = true)
    protected String note;
    @XmlElement(required = true)
    protected String linkId;

    /**
     * Recupera il valore della proprietà fromTable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTable() {
        return fromTable;
    }

    /**
     * Imposta il valore della proprietà fromTable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTable(String value) {
        this.fromTable = value;
    }

    /**
     * Recupera il valore della proprietà toTable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTable() {
        return toTable;
    }

    /**
     * Imposta il valore della proprietà toTable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTable(String value) {
        this.toTable = value;
    }

    /**
     * Recupera il valore della proprietà fromTableId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromTableId() {
        return fromTableId;
    }

    /**
     * Imposta il valore della proprietà fromTableId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromTableId(String value) {
        this.fromTableId = value;
    }

    /**
     * Recupera il valore della proprietà toTableId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToTableId() {
        return toTableId;
    }

    /**
     * Imposta il valore della proprietà toTableId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToTableId(String value) {
        this.toTableId = value;
    }

    /**
     * Recupera il valore della proprietà countLinks.
     * 
     */
    public int getCountLinks() {
        return countLinks;
    }

    /**
     * Imposta il valore della proprietà countLinks.
     * 
     */
    public void setCountLinks(int value) {
        this.countLinks = value;
    }

    /**
     * Recupera il valore della proprietà fromInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromInstanceName() {
        return fromInstanceName;
    }

    /**
     * Imposta il valore della proprietà fromInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromInstanceName(String value) {
        this.fromInstanceName = value;
    }

    /**
     * Recupera il valore della proprietà toInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToInstanceName() {
        return toInstanceName;
    }

    /**
     * Imposta il valore della proprietà toInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToInstanceName(String value) {
        this.toInstanceName = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà linkId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkId() {
        return linkId;
    }

    /**
     * Imposta il valore della proprietà linkId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkId(String value) {
        this.linkId = value;
    }

}
