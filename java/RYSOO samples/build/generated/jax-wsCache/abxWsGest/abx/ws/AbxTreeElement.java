
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java per abxTreeElement complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxTreeElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HexInstanceID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InstanceDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="creationTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="revisionID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="isLastRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disableRevision" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="subelements" type="{http://ws.abx/}abxTreeElement" maxOccurs="unbounded"/>
 *         &lt;element name="dataAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hideContainer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="colorDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="containerDetails" type="{http://ws.abx/}abxContainer"/>
 *         &lt;element name="templateDetails" type="{http://ws.abx/}abxTemplate"/>
 *         &lt;element name="permission" type="{http://ws.abx/}abxPermission"/>
 *         &lt;element name="allPermission" type="{http://ws.abx/}abxAllPermission"/>
 *         &lt;element name="countDocument" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxTreeElement", propOrder = {
    "instanceName",
    "hexInstanceID",
    "instanceDescription",
    "objName",
    "creationTimestamp",
    "revisionID",
    "isLastRevision",
    "disableRevision",
    "subelements",
    "dataAvailable",
    "templateName",
    "hideContainer",
    "colorDisplay",
    "containerDetails",
    "templateDetails",
    "permission",
    "allPermission",
    "countDocument"
})
public class AbxTreeElement {

    @XmlElement(required = true)
    protected String instanceName;
    @XmlElement(name = "HexInstanceID", required = true)
    protected String hexInstanceID;
    @XmlElement(name = "InstanceDescription", required = true)
    protected String instanceDescription;
    @XmlElement(required = true)
    protected String objName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTimestamp;
    protected int revisionID;
    protected boolean isLastRevision;
    protected boolean disableRevision;
    @XmlElement(required = true)
    protected List<AbxTreeElement> subelements;
    protected boolean dataAvailable;
    @XmlElement(required = true)
    protected String templateName;
    protected boolean hideContainer;
    @XmlElement(required = true)
    protected String colorDisplay;
    @XmlElement(required = true)
    protected AbxContainer containerDetails;
    @XmlElement(required = true)
    protected AbxTemplate templateDetails;
    @XmlElement(required = true)
    protected AbxPermission permission;
    @XmlElement(required = true)
    protected AbxAllPermission allPermission;
    @XmlElement(required = true)
    protected String countDocument;

    /**
     * Recupera il valore della proprietà instanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Imposta il valore della proprietà instanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceName(String value) {
        this.instanceName = value;
    }

    /**
     * Recupera il valore della proprietà hexInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHexInstanceID() {
        return hexInstanceID;
    }

    /**
     * Imposta il valore della proprietà hexInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHexInstanceID(String value) {
        this.hexInstanceID = value;
    }

    /**
     * Recupera il valore della proprietà instanceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceDescription() {
        return instanceDescription;
    }

    /**
     * Imposta il valore della proprietà instanceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceDescription(String value) {
        this.instanceDescription = value;
    }

    /**
     * Recupera il valore della proprietà objName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjName() {
        return objName;
    }

    /**
     * Imposta il valore della proprietà objName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjName(String value) {
        this.objName = value;
    }

    /**
     * Recupera il valore della proprietà creationTimestamp.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Imposta il valore della proprietà creationTimestamp.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTimestamp(XMLGregorianCalendar value) {
        this.creationTimestamp = value;
    }

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
     * Recupera il valore della proprietà isLastRevision.
     * 
     */
    public boolean isIsLastRevision() {
        return isLastRevision;
    }

    /**
     * Imposta il valore della proprietà isLastRevision.
     * 
     */
    public void setIsLastRevision(boolean value) {
        this.isLastRevision = value;
    }

    /**
     * Recupera il valore della proprietà disableRevision.
     * 
     */
    public boolean isDisableRevision() {
        return disableRevision;
    }

    /**
     * Imposta il valore della proprietà disableRevision.
     * 
     */
    public void setDisableRevision(boolean value) {
        this.disableRevision = value;
    }

    /**
     * Gets the value of the subelements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subelements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubelements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxTreeElement }
     * 
     * 
     */
    public List<AbxTreeElement> getSubelements() {
        if (subelements == null) {
            subelements = new ArrayList<AbxTreeElement>();
        }
        return this.subelements;
    }

    /**
     * Recupera il valore della proprietà dataAvailable.
     * 
     */
    public boolean isDataAvailable() {
        return dataAvailable;
    }

    /**
     * Imposta il valore della proprietà dataAvailable.
     * 
     */
    public void setDataAvailable(boolean value) {
        this.dataAvailable = value;
    }

    /**
     * Recupera il valore della proprietà templateName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Imposta il valore della proprietà templateName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateName(String value) {
        this.templateName = value;
    }

    /**
     * Recupera il valore della proprietà hideContainer.
     * 
     */
    public boolean isHideContainer() {
        return hideContainer;
    }

    /**
     * Imposta il valore della proprietà hideContainer.
     * 
     */
    public void setHideContainer(boolean value) {
        this.hideContainer = value;
    }

    /**
     * Recupera il valore della proprietà colorDisplay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorDisplay() {
        return colorDisplay;
    }

    /**
     * Imposta il valore della proprietà colorDisplay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorDisplay(String value) {
        this.colorDisplay = value;
    }

    /**
     * Recupera il valore della proprietà containerDetails.
     * 
     * @return
     *     possible object is
     *     {@link AbxContainer }
     *     
     */
    public AbxContainer getContainerDetails() {
        return containerDetails;
    }

    /**
     * Imposta il valore della proprietà containerDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxContainer }
     *     
     */
    public void setContainerDetails(AbxContainer value) {
        this.containerDetails = value;
    }

    /**
     * Recupera il valore della proprietà templateDetails.
     * 
     * @return
     *     possible object is
     *     {@link AbxTemplate }
     *     
     */
    public AbxTemplate getTemplateDetails() {
        return templateDetails;
    }

    /**
     * Imposta il valore della proprietà templateDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTemplate }
     *     
     */
    public void setTemplateDetails(AbxTemplate value) {
        this.templateDetails = value;
    }

    /**
     * Recupera il valore della proprietà permission.
     * 
     * @return
     *     possible object is
     *     {@link AbxPermission }
     *     
     */
    public AbxPermission getPermission() {
        return permission;
    }

    /**
     * Imposta il valore della proprietà permission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxPermission }
     *     
     */
    public void setPermission(AbxPermission value) {
        this.permission = value;
    }

    /**
     * Recupera il valore della proprietà allPermission.
     * 
     * @return
     *     possible object is
     *     {@link AbxAllPermission }
     *     
     */
    public AbxAllPermission getAllPermission() {
        return allPermission;
    }

    /**
     * Imposta il valore della proprietà allPermission.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxAllPermission }
     *     
     */
    public void setAllPermission(AbxAllPermission value) {
        this.allPermission = value;
    }

    /**
     * Recupera il valore della proprietà countDocument.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountDocument() {
        return countDocument;
    }

    /**
     * Imposta il valore della proprietà countDocument.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountDocument(String value) {
        this.countDocument = value;
    }

}
