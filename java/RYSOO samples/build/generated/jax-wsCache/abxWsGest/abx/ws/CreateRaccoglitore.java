
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.netbeans.xml.schema.abxdynaminorg.AbxDynamicorgRuleList;


/**
 * <p>Classe Java per CreateRaccoglitore complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="CreateRaccoglitore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionId" type="{http://ws.abx/}IDtype" minOccurs="0"/>
 *         &lt;element name="Template2Update" type="{http://ws.abx/}abxTemplate" minOccurs="0"/>
 *         &lt;element name="Container2Update" type="{http://ws.abx/}abxContainer" minOccurs="0"/>
 *         &lt;element name="DynorgParam" type="{http://xml.netbeans.org/schema/abxDynaminorg}abxDynamicorgRuleList" minOccurs="0"/>
 *         &lt;element name="abxSecurityId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expr" type="{http://ws.abx/}abxExpression" minOccurs="0"/>
 *         &lt;element name="replicationList" type="{http://ws.abx/}abxReplicationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateRaccoglitore", propOrder = {
    "sessionId",
    "template2Update",
    "container2Update",
    "dynorgParam",
    "abxSecurityId",
    "expr",
    "replicationList"
})
public class CreateRaccoglitore {

    @XmlElement(name = "SessionId")
    protected IDtype sessionId;
    @XmlElement(name = "Template2Update")
    protected AbxTemplate template2Update;
    @XmlElement(name = "Container2Update")
    protected AbxContainer container2Update;
    @XmlElement(name = "DynorgParam")
    protected AbxDynamicorgRuleList dynorgParam;
    protected String abxSecurityId;
    protected AbxExpression expr;
    protected AbxReplicationList replicationList;

    /**
     * Recupera il valore della proprietà sessionId.
     * 
     * @return
     *     possible object is
     *     {@link IDtype }
     *     
     */
    public IDtype getSessionId() {
        return sessionId;
    }

    /**
     * Imposta il valore della proprietà sessionId.
     * 
     * @param value
     *     allowed object is
     *     {@link IDtype }
     *     
     */
    public void setSessionId(IDtype value) {
        this.sessionId = value;
    }

    /**
     * Recupera il valore della proprietà template2Update.
     * 
     * @return
     *     possible object is
     *     {@link AbxTemplate }
     *     
     */
    public AbxTemplate getTemplate2Update() {
        return template2Update;
    }

    /**
     * Imposta il valore della proprietà template2Update.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxTemplate }
     *     
     */
    public void setTemplate2Update(AbxTemplate value) {
        this.template2Update = value;
    }

    /**
     * Recupera il valore della proprietà container2Update.
     * 
     * @return
     *     possible object is
     *     {@link AbxContainer }
     *     
     */
    public AbxContainer getContainer2Update() {
        return container2Update;
    }

    /**
     * Imposta il valore della proprietà container2Update.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxContainer }
     *     
     */
    public void setContainer2Update(AbxContainer value) {
        this.container2Update = value;
    }

    /**
     * Recupera il valore della proprietà dynorgParam.
     * 
     * @return
     *     possible object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public AbxDynamicorgRuleList getDynorgParam() {
        return dynorgParam;
    }

    /**
     * Imposta il valore della proprietà dynorgParam.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxDynamicorgRuleList }
     *     
     */
    public void setDynorgParam(AbxDynamicorgRuleList value) {
        this.dynorgParam = value;
    }

    /**
     * Recupera il valore della proprietà abxSecurityId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbxSecurityId() {
        return abxSecurityId;
    }

    /**
     * Imposta il valore della proprietà abxSecurityId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbxSecurityId(String value) {
        this.abxSecurityId = value;
    }

    /**
     * Recupera il valore della proprietà expr.
     * 
     * @return
     *     possible object is
     *     {@link AbxExpression }
     *     
     */
    public AbxExpression getExpr() {
        return expr;
    }

    /**
     * Imposta il valore della proprietà expr.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxExpression }
     *     
     */
    public void setExpr(AbxExpression value) {
        this.expr = value;
    }

    /**
     * Recupera il valore della proprietà replicationList.
     * 
     * @return
     *     possible object is
     *     {@link AbxReplicationList }
     *     
     */
    public AbxReplicationList getReplicationList() {
        return replicationList;
    }

    /**
     * Imposta il valore della proprietà replicationList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxReplicationList }
     *     
     */
    public void setReplicationList(AbxReplicationList value) {
        this.replicationList = value;
    }

}
