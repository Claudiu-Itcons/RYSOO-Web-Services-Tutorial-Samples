
package abx.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxSDKResult complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxSDKResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="listTask" type="{http://ws.abx/}abxSDKTaskList" minOccurs="0"/>
 *         &lt;element name="listRule" type="{http://ws.abx/}abxSDKRuleList" minOccurs="0"/>
 *         &lt;element name="listVariable" type="{http://ws.abx/}abxSDKVariableList" minOccurs="0"/>
 *         &lt;element name="listWatchFolderDirectory" type="{http://ws.abx/}abxSDKWatchFolderDirectoryList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxSDKResult", propOrder = {
    "result",
    "listTask",
    "listRule",
    "listVariable",
    "listWatchFolderDirectory"
})
public class AbxSDKResult {

    @XmlSchemaType(name = "unsignedInt")
    protected long result;
    protected AbxSDKTaskList listTask;
    protected AbxSDKRuleList listRule;
    protected AbxSDKVariableList listVariable;
    protected AbxSDKWatchFolderDirectoryList listWatchFolderDirectory;

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
     * Recupera il valore della proprietà listTask.
     * 
     * @return
     *     possible object is
     *     {@link AbxSDKTaskList }
     *     
     */
    public AbxSDKTaskList getListTask() {
        return listTask;
    }

    /**
     * Imposta il valore della proprietà listTask.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSDKTaskList }
     *     
     */
    public void setListTask(AbxSDKTaskList value) {
        this.listTask = value;
    }

    /**
     * Recupera il valore della proprietà listRule.
     * 
     * @return
     *     possible object is
     *     {@link AbxSDKRuleList }
     *     
     */
    public AbxSDKRuleList getListRule() {
        return listRule;
    }

    /**
     * Imposta il valore della proprietà listRule.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSDKRuleList }
     *     
     */
    public void setListRule(AbxSDKRuleList value) {
        this.listRule = value;
    }

    /**
     * Recupera il valore della proprietà listVariable.
     * 
     * @return
     *     possible object is
     *     {@link AbxSDKVariableList }
     *     
     */
    public AbxSDKVariableList getListVariable() {
        return listVariable;
    }

    /**
     * Imposta il valore della proprietà listVariable.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSDKVariableList }
     *     
     */
    public void setListVariable(AbxSDKVariableList value) {
        this.listVariable = value;
    }

    /**
     * Recupera il valore della proprietà listWatchFolderDirectory.
     * 
     * @return
     *     possible object is
     *     {@link AbxSDKWatchFolderDirectoryList }
     *     
     */
    public AbxSDKWatchFolderDirectoryList getListWatchFolderDirectory() {
        return listWatchFolderDirectory;
    }

    /**
     * Imposta il valore della proprietà listWatchFolderDirectory.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxSDKWatchFolderDirectoryList }
     *     
     */
    public void setListWatchFolderDirectory(AbxSDKWatchFolderDirectoryList value) {
        this.listWatchFolderDirectory = value;
    }

}
