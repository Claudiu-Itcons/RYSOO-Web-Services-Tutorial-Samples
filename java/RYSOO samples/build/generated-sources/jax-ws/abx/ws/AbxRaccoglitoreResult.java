
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.abxdynaminorg.AbxDynamicorgRuleList;


/**
 * <p>Classe Java per abxRaccoglitoreResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxRaccoglitoreResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="template" type="{http://ws.abx/}abxTemplateList"/>
 *         &lt;element name="container" type="{http://ws.abx/}abxContainerList"/>
 *         &lt;element name="dynorg" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgRuleList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxRaccoglitoreResult", propOrder = {
    "result",
    "template",
    "container",
    "dynorg"
})
public class AbxRaccoglitoreResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    @XmlElement(required = true)
    protected AbxTemplateList template;
    @XmlElement(required = true)
    protected AbxContainerList container;
    @XmlElement(required = true)
    protected AbxDynamicorgRuleList dynorg;

    /**
     * Recupera il valore della proprietà result.
     * 
     */
    public long getResult() {
        return result;
    }

    /**
     * Imposta il valore della proprietà result.
     * 
     */
    public void setResult(long value) {
        this.result = value;
    }

    /**
     * Recupera il valore della proprietà template.
     * 
     * @return
     *     possible object is
     *     {@link AbxTemplateList }
     *     
     */
    public AbxTemplateList getTemplate() {
        return template;
    }

    /**
     * Imposta il valore della proprietà template.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTemplateList }
     *     
     */
    public void setTemplate(AbxTemplateList value) {
        this.template = value;
    }

    /**
     * Recupera il valore della proprietà container.
     * 
     * @return
     *     possible object is
     *     {@link AbxContainerList }
     *     
     */
    public AbxContainerList getContainer() {
        return container;
    }

    /**
     * Imposta il valore della proprietà container.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxContainerList }
     *     
     */
    public void setContainer(AbxContainerList value) {
        this.container = value;
    }

    /**
     * Recupera il valore della proprietà dynorg.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public AbxDynamicorgRuleList getDynorg() {
        return dynorg;
    }

    /**
     * Imposta il valore della proprietà dynorg.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public void setDynorg(AbxDynamicorgRuleList value) {
        this.dynorg = value;
    }

}
