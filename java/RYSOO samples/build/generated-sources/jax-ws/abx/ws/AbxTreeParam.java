
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxTreeParam complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxTreeParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="revisionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="treeStartHexInstanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treeStartInstancePathname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="treeDeepLevelNumberDown" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="treeNumberElementsDown" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="objvect" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="objname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxTreeParam", propOrder = {
    "revisionID",
    "treeStartHexInstanceID",
    "treeStartInstancePathname",
    "treeDeepLevelNumberDown",
    "treeNumberElementsDown",
    "objvect"
})
public class AbxTreeParam {

    protected int revisionID;
    @XmlElement(required = true)
    protected String treeStartHexInstanceID;
    @XmlElement(required = true)
    protected String treeStartInstancePathname;
    protected int treeDeepLevelNumberDown;
    protected int treeNumberElementsDown;
    @XmlElement(required = true)
    protected List<AbxTreeParam.Objvect> objvect;

    /**
     * Recupera il valore della proprietà revisionID.
     * 
     */
    public int getRevisionID() {
        return revisionID;
    }

    /**
     * Imposta il valore della proprietà revisionID.
     * 
     */
    public void setRevisionID(int value) {
        this.revisionID = value;
    }

    /**
     * Recupera il valore della proprietà treeStartHexInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeStartHexInstanceID() {
        return treeStartHexInstanceID;
    }

    /**
     * Imposta il valore della proprietà treeStartHexInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeStartHexInstanceID(String value) {
        this.treeStartHexInstanceID = value;
    }

    /**
     * Recupera il valore della proprietà treeStartInstancePathname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreeStartInstancePathname() {
        return treeStartInstancePathname;
    }

    /**
     * Imposta il valore della proprietà treeStartInstancePathname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreeStartInstancePathname(String value) {
        this.treeStartInstancePathname = value;
    }

    /**
     * Recupera il valore della proprietà treeDeepLevelNumberDown.
     * 
     */
    public int getTreeDeepLevelNumberDown() {
        return treeDeepLevelNumberDown;
    }

    /**
     * Imposta il valore della proprietà treeDeepLevelNumberDown.
     * 
     */
    public void setTreeDeepLevelNumberDown(int value) {
        this.treeDeepLevelNumberDown = value;
    }

    /**
     * Recupera il valore della proprietà treeNumberElementsDown.
     * 
     */
    public int getTreeNumberElementsDown() {
        return treeNumberElementsDown;
    }

    /**
     * Imposta il valore della proprietà treeNumberElementsDown.
     * 
     */
    public void setTreeNumberElementsDown(int value) {
        this.treeNumberElementsDown = value;
    }

    /**
     * Gets the value of the objvect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objvect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjvect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxTreeParam.Objvect }
     * 
     * 
     */
    public List<AbxTreeParam.Objvect> getObjvect() {
        if (objvect == null) {
            objvect = new ArrayList<AbxTreeParam.Objvect>();
        }
        return this.objvect;
    }


    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="objname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "objname"
    })
    public static class Objvect {

        @XmlElement(required = true)
        protected String objname;

        /**
         * Recupera il valore della proprietà objname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjname() {
            return objname;
        }

        /**
         * Imposta il valore della proprietà objname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjname(String value) {
            this.objname = value;
        }

    }

}
