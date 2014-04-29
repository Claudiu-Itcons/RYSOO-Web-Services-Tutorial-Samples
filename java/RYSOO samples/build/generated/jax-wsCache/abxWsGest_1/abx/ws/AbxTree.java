
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxTree complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxTree">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queryParam" type="{http://ws.abx/}abxTreeParam"/>
 *         &lt;element name="tree" type="{http://ws.abx/}abxTreeElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxTree", propOrder = {
    "queryParam",
    "tree"
})
public class AbxTree {

    @XmlElement(required = true)
    protected AbxTreeParam queryParam;
    @XmlElement(required = true)
    protected AbxTreeElement tree;

    /**
     * Recupera il valore della proprietà queryParam.
     * 
     * @return
     *     possible object is
     *     {@link AbxTreeParam }
     *     
     */
    public AbxTreeParam getQueryParam() {
        return queryParam;
    }

    /**
     * Imposta il valore della proprietà queryParam.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTreeParam }
     *     
     */
    public void setQueryParam(AbxTreeParam value) {
        this.queryParam = value;
    }

    /**
     * Recupera il valore della proprietà tree.
     * 
     * @return
     *     possible object is
     *     {@link AbxTreeElement }
     *     
     */
    public AbxTreeElement getTree() {
        return tree;
    }

    /**
     * Imposta il valore della proprietà tree.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTreeElement }
     *     
     */
    public void setTree(AbxTreeElement value) {
        this.tree = value;
    }

}
