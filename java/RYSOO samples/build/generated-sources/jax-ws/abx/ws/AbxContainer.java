
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxContainer complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxContainer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultLanguage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="allDescription" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="revisionEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="objName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentContainerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="parentDataID">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="container_InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="hexDataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hideContainer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="colorDisplay" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fileAutoOverwrite" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="permission" type="{http://ws.abx/}abxPermission"/>
 *         &lt;element name="masterDetail" type="{http://ws.abx/}abxMasterDetail"/>
 *         &lt;element name="protocolEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="previewEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="downloadNumEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="downloadNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="defaultProtocolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="WFProcDefEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="WFProcDefUserEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxContainer", propOrder = {
    "name",
    "defaultLanguage",
    "description",
    "allDescription",
    "revisionEnabled",
    "objName",
    "parentContainerName",
    "templateName",
    "parentDataID",
    "hideContainer",
    "colorDisplay",
    "fileAutoOverwrite",
    "permission",
    "masterDetail",
    "protocolEnabled",
    "previewEnabled",
    "downloadNumEnabled",
    "downloadNumber",
    "defaultProtocolId",
    "wfProcDefEnabled",
    "wfProcDefUserEnabled"
})
public class AbxContainer {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String defaultLanguage;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(required = true)
    protected List<AbxContainer.AllDescription> allDescription;
    protected boolean revisionEnabled;
    @XmlElement(required = true)
    protected String objName;
    @XmlElement(required = true)
    protected String parentContainerName;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected AbxContainer.ParentDataID parentDataID;
    protected boolean hideContainer;
    @XmlElement(required = true)
    protected String colorDisplay;
    protected boolean fileAutoOverwrite;
    @XmlElement(required = true)
    protected AbxPermission permission;
    @XmlElement(required = true)
    protected AbxMasterDetail masterDetail;
    protected boolean protocolEnabled;
    protected boolean previewEnabled;
    protected boolean downloadNumEnabled;
    @XmlElement(required = true)
    protected String downloadNumber;
    @XmlElement(required = true)
    protected String defaultProtocolId;
    @XmlElement(name = "WFProcDefEnabled")
    protected boolean wfProcDefEnabled;
    @XmlElement(name = "WFProcDefUserEnabled")
    protected boolean wfProcDefUserEnabled;

    /**
     * Recupera il valore della proprietà name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Imposta il valore della proprietà name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Recupera il valore della proprietà defaultLanguage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    /**
     * Imposta il valore della proprietà defaultLanguage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultLanguage(String value) {
        this.defaultLanguage = value;
    }

    /**
     * Recupera il valore della proprietà description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Imposta il valore della proprietà description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the allDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxContainer.AllDescription }
     * 
     * 
     */
    public List<AbxContainer.AllDescription> getAllDescription() {
        if (allDescription == null) {
            allDescription = new ArrayList<AbxContainer.AllDescription>();
        }
        return this.allDescription;
    }

    /**
     * Recupera il valore della proprietà revisionEnabled.
     * 
     */
    public boolean isRevisionEnabled() {
        return revisionEnabled;
    }

    /**
     * Imposta il valore della proprietà revisionEnabled.
     * 
     */
    public void setRevisionEnabled(boolean value) {
        this.revisionEnabled = value;
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
     * Recupera il valore della proprietà parentContainerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentContainerName() {
        return parentContainerName;
    }

    /**
     * Imposta il valore della proprietà parentContainerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentContainerName(String value) {
        this.parentContainerName = value;
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
     * Recupera il valore della proprietà parentDataID.
     * 
     * @return
     *     possible object is
     *     {@link AbxContainer.ParentDataID }
     *     
     */
    public AbxContainer.ParentDataID getParentDataID() {
        return parentDataID;
    }

    /**
     * Imposta il valore della proprietà parentDataID.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxContainer.ParentDataID }
     *     
     */
    public void setParentDataID(AbxContainer.ParentDataID value) {
        this.parentDataID = value;
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
     * Recupera il valore della proprietà fileAutoOverwrite.
     * 
     */
    public boolean isFileAutoOverwrite() {
        return fileAutoOverwrite;
    }

    /**
     * Imposta il valore della proprietà fileAutoOverwrite.
     * 
     */
    public void setFileAutoOverwrite(boolean value) {
        this.fileAutoOverwrite = value;
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
     * Recupera il valore della proprietà masterDetail.
     * 
     * @return
     *     possible object is
     *     {@link AbxMasterDetail }
     *     
     */
    public AbxMasterDetail getMasterDetail() {
        return masterDetail;
    }

    /**
     * Imposta il valore della proprietà masterDetail.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxMasterDetail }
     *     
     */
    public void setMasterDetail(AbxMasterDetail value) {
        this.masterDetail = value;
    }

    /**
     * Recupera il valore della proprietà protocolEnabled.
     * 
     */
    public boolean isProtocolEnabled() {
        return protocolEnabled;
    }

    /**
     * Imposta il valore della proprietà protocolEnabled.
     * 
     */
    public void setProtocolEnabled(boolean value) {
        this.protocolEnabled = value;
    }

    /**
     * Recupera il valore della proprietà previewEnabled.
     * 
     */
    public boolean isPreviewEnabled() {
        return previewEnabled;
    }

    /**
     * Imposta il valore della proprietà previewEnabled.
     * 
     */
    public void setPreviewEnabled(boolean value) {
        this.previewEnabled = value;
    }

    /**
     * Recupera il valore della proprietà downloadNumEnabled.
     * 
     */
    public boolean isDownloadNumEnabled() {
        return downloadNumEnabled;
    }

    /**
     * Imposta il valore della proprietà downloadNumEnabled.
     * 
     */
    public void setDownloadNumEnabled(boolean value) {
        this.downloadNumEnabled = value;
    }

    /**
     * Recupera il valore della proprietà downloadNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDownloadNumber() {
        return downloadNumber;
    }

    /**
     * Imposta il valore della proprietà downloadNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDownloadNumber(String value) {
        this.downloadNumber = value;
    }

    /**
     * Recupera il valore della proprietà defaultProtocolId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultProtocolId() {
        return defaultProtocolId;
    }

    /**
     * Imposta il valore della proprietà defaultProtocolId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultProtocolId(String value) {
        this.defaultProtocolId = value;
    }

    /**
     * Recupera il valore della proprietà wfProcDefEnabled.
     * 
     */
    public boolean isWFProcDefEnabled() {
        return wfProcDefEnabled;
    }

    /**
     * Imposta il valore della proprietà wfProcDefEnabled.
     * 
     */
    public void setWFProcDefEnabled(boolean value) {
        this.wfProcDefEnabled = value;
    }

    /**
     * Recupera il valore della proprietà wfProcDefUserEnabled.
     * 
     */
    public boolean isWFProcDefUserEnabled() {
        return wfProcDefUserEnabled;
    }

    /**
     * Imposta il valore della proprietà wfProcDefUserEnabled.
     * 
     */
    public void setWFProcDefUserEnabled(boolean value) {
        this.wfProcDefUserEnabled = value;
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
     *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "language",
        "description"
    })
    public static class AllDescription {

        @XmlElement(required = true)
        protected String language;
        @XmlElement(required = true)
        protected String description;

        /**
         * Recupera il valore della proprietà language.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * Imposta il valore della proprietà language.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * Recupera il valore della proprietà description.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Imposta il valore della proprietà description.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

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
     *         &lt;element name="container_InstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="hexDataID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "containerInstanceName",
        "hexDataID"
    })
    public static class ParentDataID {

        @XmlElement(name = "container_InstanceName", required = true)
        protected String containerInstanceName;
        @XmlElement(required = true)
        protected String hexDataID;

        /**
         * Recupera il valore della proprietà containerInstanceName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContainerInstanceName() {
            return containerInstanceName;
        }

        /**
         * Imposta il valore della proprietà containerInstanceName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContainerInstanceName(String value) {
            this.containerInstanceName = value;
        }

        /**
         * Recupera il valore della proprietà hexDataID.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHexDataID() {
            return hexDataID;
        }

        /**
         * Imposta il valore della proprietà hexDataID.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHexDataID(String value) {
            this.hexDataID = value;
        }

    }

}
