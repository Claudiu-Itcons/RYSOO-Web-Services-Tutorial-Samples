
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKTask complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKTask">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fileType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="templateFile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="watchFolder" type="{http://ws.abx/}abxSDKWatchFolder" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fieldMappings" type="{http://ws.abx/}abxSDKTaskFieldMapping" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excelPreviewSheets" type="{http://ws.abx/}abxSDKTaskExcelPreviewSheet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PDFPreview" type="{http://ws.abx/}abxSDKTaskPDFPreview" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TXTPreview" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="validateData" type="{http://ws.abx/}abxSDKTaskValidateData" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKTask", propOrder = {
    "id",
    "name",
    "description",
    "instanceName",
    "fileType",
    "status",
    "templateFile",
    "watchFolder",
    "fieldMappings",
    "excelPreviewSheets",
    "pdfPreview",
    "txtPreview",
    "validateData"
})
public class AbxSDKTask {

    protected String id;
    protected String name;
    protected String description;
    protected String instanceName;
    protected String fileType;
    protected String status;
    protected String templateFile;
    @XmlElement(nillable = true)
    protected List<AbxSDKWatchFolder> watchFolder;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskFieldMapping> fieldMappings;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskExcelPreviewSheet> excelPreviewSheets;
    @XmlElement(name = "PDFPreview")
    protected List<AbxSDKTaskPDFPreview> pdfPreview;
    @XmlElement(name = "TXTPreview")
    protected List<String> txtPreview;
    @XmlElement(nillable = true)
    protected List<AbxSDKTaskValidateData> validateData;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Recupera il valore della proprietà fileType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileType() {
        return fileType;
    }

    /**
     * Imposta il valore della proprietà fileType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileType(String value) {
        this.fileType = value;
    }

    /**
     * Recupera il valore della proprietà status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Imposta il valore della proprietà status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Recupera il valore della proprietà templateFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateFile() {
        return templateFile;
    }

    /**
     * Imposta il valore della proprietà templateFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateFile(String value) {
        this.templateFile = value;
    }

    /**
     * Gets the value of the watchFolder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the watchFolder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWatchFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKWatchFolder }
     * 
     * 
     */
    public List<AbxSDKWatchFolder> getWatchFolder() {
        if (watchFolder == null) {
            watchFolder = new ArrayList<AbxSDKWatchFolder>();
        }
        return this.watchFolder;
    }

    /**
     * Gets the value of the fieldMappings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fieldMappings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFieldMappings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskFieldMapping }
     * 
     * 
     */
    public List<AbxSDKTaskFieldMapping> getFieldMappings() {
        if (fieldMappings == null) {
            fieldMappings = new ArrayList<AbxSDKTaskFieldMapping>();
        }
        return this.fieldMappings;
    }

    /**
     * Gets the value of the excelPreviewSheets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excelPreviewSheets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcelPreviewSheets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskExcelPreviewSheet }
     * 
     * 
     */
    public List<AbxSDKTaskExcelPreviewSheet> getExcelPreviewSheets() {
        if (excelPreviewSheets == null) {
            excelPreviewSheets = new ArrayList<AbxSDKTaskExcelPreviewSheet>();
        }
        return this.excelPreviewSheets;
    }

    /**
     * Gets the value of the pdfPreview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pdfPreview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPDFPreview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskPDFPreview }
     * 
     * 
     */
    public List<AbxSDKTaskPDFPreview> getPDFPreview() {
        if (pdfPreview == null) {
            pdfPreview = new ArrayList<AbxSDKTaskPDFPreview>();
        }
        return this.pdfPreview;
    }

    /**
     * Gets the value of the txtPreview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtPreview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTXTPreview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTXTPreview() {
        if (txtPreview == null) {
            txtPreview = new ArrayList<String>();
        }
        return this.txtPreview;
    }

    /**
     * Gets the value of the validateData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the validateData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValidateData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxSDKTaskValidateData }
     * 
     * 
     */
    public List<AbxSDKTaskValidateData> getValidateData() {
        if (validateData == null) {
            validateData = new ArrayList<AbxSDKTaskValidateData>();
        }
        return this.validateData;
    }

}
