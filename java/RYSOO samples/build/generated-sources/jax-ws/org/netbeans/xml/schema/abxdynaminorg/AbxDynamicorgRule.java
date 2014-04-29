
package org.netbeans.xml.schema.abxdynaminorg;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import abx.ws.AbxPermission;


/**
 * <p>Classe Java per abxDynamicorgRule complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxDynamicorgRule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ruleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="templateName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="rootInstanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="elements" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgRuleElement" maxOccurs="unbounded"/>
 *         &lt;element name="permission" type="{http://ws.abx/}abxPermission"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxDynamicorgRule", propOrder = {
    "ruleName",
    "user",
    "templateName",
    "rootInstanceName",
    "elements",
    "permission"
})
public class AbxDynamicorgRule {

    @XmlElement(required = true)
    protected String ruleName;
    @XmlElement(required = true)
    protected String user;
    @XmlElement(required = true)
    protected String templateName;
    @XmlElement(required = true)
    protected String rootInstanceName;
    @XmlElement(required = true)
    protected List<AbxDynamicorgRuleElement> elements;
    @XmlElement(required = true)
    protected AbxPermission permission;

    /**
     * Recupera il valore della proprietà ruleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Imposta il valore della proprietà ruleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Recupera il valore della proprietà user.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Imposta il valore della proprietà user.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
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
     * Recupera il valore della proprietà rootInstanceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRootInstanceName() {
        return rootInstanceName;
    }

    /**
     * Imposta il valore della proprietà rootInstanceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRootInstanceName(String value) {
        this.rootInstanceName = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxDynamicorgRuleElement }
     * 
     * 
     */
    public List<AbxDynamicorgRuleElement> getElements() {
        if (elements == null) {
            elements = new ArrayList<AbxDynamicorgRuleElement>();
        }
        return this.elements;
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

}
