
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxWorkflow complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxWorkflow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="processoDefUsers" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="idPacchetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="idProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nomePacchetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="nomeProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="signList" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="idTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="allineamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="marker" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="posX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="posY" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="userSettings" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="worklistFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="variables" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abxWorkflow", propOrder = {
    "processoDefUsers",
    "signList",
    "userSettings",
    "variables"
})
public class AbxWorkflow {

    @XmlElement(required = true)
    protected List<AbxWorkflow.ProcessoDefUsers> processoDefUsers;
    @XmlElement(required = true)
    protected List<AbxWorkflow.SignList> signList;
    @XmlElement(required = true)
    protected List<AbxWorkflow.UserSettings> userSettings;
    @XmlElement(required = true)
    protected List<AbxWorkflow.Variables> variables;

    /**
     * Gets the value of the processoDefUsers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processoDefUsers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessoDefUsers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxWorkflow.ProcessoDefUsers }
     * 
     * 
     */
    public List<AbxWorkflow.ProcessoDefUsers> getProcessoDefUsers() {
        if (processoDefUsers == null) {
            processoDefUsers = new ArrayList<AbxWorkflow.ProcessoDefUsers>();
        }
        return this.processoDefUsers;
    }

    /**
     * Gets the value of the signList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxWorkflow.SignList }
     * 
     * 
     */
    public List<AbxWorkflow.SignList> getSignList() {
        if (signList == null) {
            signList = new ArrayList<AbxWorkflow.SignList>();
        }
        return this.signList;
    }

    /**
     * Gets the value of the userSettings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userSettings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserSettings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxWorkflow.UserSettings }
     * 
     * 
     */
    public List<AbxWorkflow.UserSettings> getUserSettings() {
        if (userSettings == null) {
            userSettings = new ArrayList<AbxWorkflow.UserSettings>();
        }
        return this.userSettings;
    }

    /**
     * Gets the value of the variables property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the variables property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVariables().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxWorkflow.Variables }
     * 
     * 
     */
    public List<AbxWorkflow.Variables> getVariables() {
        if (variables == null) {
            variables = new ArrayList<AbxWorkflow.Variables>();
        }
        return this.variables;
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
     *         &lt;element name="idTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="idPacchetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="idProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nomePacchetto" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="nomeProcesso" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "idTable",
        "idPacchetto",
        "idProcesso",
        "instanceName",
        "nomePacchetto",
        "nomeProcesso",
        "username"
    })
    public static class ProcessoDefUsers {

        @XmlElement(required = true)
        protected String idTable;
        @XmlElement(required = true)
        protected String idPacchetto;
        @XmlElement(required = true)
        protected String idProcesso;
        @XmlElement(required = true)
        protected String instanceName;
        @XmlElement(required = true)
        protected String nomePacchetto;
        @XmlElement(required = true)
        protected String nomeProcesso;
        @XmlElement(required = true)
        protected String username;

        /**
         * Recupera il valore della proprietà idTable.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdTable() {
            return idTable;
        }

        /**
         * Imposta il valore della proprietà idTable.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdTable(String value) {
            this.idTable = value;
        }

        /**
         * Recupera il valore della proprietà idPacchetto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdPacchetto() {
            return idPacchetto;
        }

        /**
         * Imposta il valore della proprietà idPacchetto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdPacchetto(String value) {
            this.idPacchetto = value;
        }

        /**
         * Recupera il valore della proprietà idProcesso.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdProcesso() {
            return idProcesso;
        }

        /**
         * Imposta il valore della proprietà idProcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdProcesso(String value) {
            this.idProcesso = value;
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
         * Recupera il valore della proprietà nomePacchetto.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePacchetto() {
            return nomePacchetto;
        }

        /**
         * Imposta il valore della proprietà nomePacchetto.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePacchetto(String value) {
            this.nomePacchetto = value;
        }

        /**
         * Recupera il valore della proprietà nomeProcesso.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProcesso() {
            return nomeProcesso;
        }

        /**
         * Imposta il valore della proprietà nomeProcesso.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProcesso(String value) {
            this.nomeProcesso = value;
        }

        /**
         * Recupera il valore della proprietà username.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUsername() {
            return username;
        }

        /**
         * Imposta il valore della proprietà username.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUsername(String value) {
            this.username = value;
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
     *         &lt;element name="idTable" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="allineamento" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="marker" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="posX" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="posY" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
        "idTable",
        "userName",
        "instanceName",
        "tipologia",
        "allineamento",
        "marker",
        "posX",
        "posY"
    })
    public static class SignList {

        @XmlElement(required = true)
        protected String idTable;
        @XmlElement(required = true)
        protected String userName;
        @XmlElement(required = true)
        protected String instanceName;
        @XmlElement(required = true)
        protected String tipologia;
        @XmlElement(required = true)
        protected String allineamento;
        @XmlElement(required = true)
        protected String marker;
        protected int posX;
        protected int posY;

        /**
         * Recupera il valore della proprietà idTable.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdTable() {
            return idTable;
        }

        /**
         * Imposta il valore della proprietà idTable.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdTable(String value) {
            this.idTable = value;
        }

        /**
         * Recupera il valore della proprietà userName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Imposta il valore della proprietà userName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
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
         * Recupera il valore della proprietà tipologia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipologia() {
            return tipologia;
        }

        /**
         * Imposta il valore della proprietà tipologia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipologia(String value) {
            this.tipologia = value;
        }

        /**
         * Recupera il valore della proprietà allineamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllineamento() {
            return allineamento;
        }

        /**
         * Imposta il valore della proprietà allineamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllineamento(String value) {
            this.allineamento = value;
        }

        /**
         * Recupera il valore della proprietà marker.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMarker() {
            return marker;
        }

        /**
         * Imposta il valore della proprietà marker.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMarker(String value) {
            this.marker = value;
        }

        /**
         * Recupera il valore della proprietà posX.
         * 
         */
        public int getPosX() {
            return posX;
        }

        /**
         * Imposta il valore della proprietà posX.
         * 
         */
        public void setPosX(int value) {
            this.posX = value;
        }

        /**
         * Recupera il valore della proprietà posY.
         * 
         */
        public int getPosY() {
            return posY;
        }

        /**
         * Imposta il valore della proprietà posY.
         * 
         */
        public void setPosY(int value) {
            this.posY = value;
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
     *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="instanceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="worklistFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "userName",
        "instanceName",
        "worklistFields"
    })
    public static class UserSettings {

        @XmlElement(required = true)
        protected String userName;
        @XmlElement(required = true)
        protected String instanceName;
        @XmlElement(required = true)
        protected List<String> worklistFields;

        /**
         * Recupera il valore della proprietà userName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Imposta il valore della proprietà userName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
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
         * Gets the value of the worklistFields property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the worklistFields property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWorklistFields().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getWorklistFields() {
            if (worklistFields == null) {
                worklistFields = new ArrayList<String>();
            }
            return this.worklistFields;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "name",
        "value"
    })
    public static class Variables {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String value;

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
         * Recupera il valore della proprietà value.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Imposta il valore della proprietà value.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

    }

}
