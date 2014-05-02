
package abx.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per abxUser complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="abxUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userMaxSessions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userAvailSessions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="notificaEmail" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="usaDefProcesso" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disAutoWorklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="disAutoRaccoglitori" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="previewWorklist" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="protocolEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="defaultProtocolId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userConfigList" type="{http://ws.abx/}abxUserConfig" maxOccurs="unbounded"/>
 *         &lt;element name="groupList" type="{http://ws.abx/}abxGroupList"/>
 *         &lt;element name="privilegedUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="digitalSignAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="digitalSignPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="digitalSignPasswordType" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="modifyUserPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifyDigitalSignPassword" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isSystemUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="worklistAutoRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="isActiveDirectoryUser" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abxUser", propOrder = {
    "userName",
    "userPassword",
    "description",
    "userEmail",
    "userId",
    "userType",
    "userMaxSessions",
    "userAvailSessions",
    "notificaEmail",
    "usaDefProcesso",
    "disAutoWorklist",
    "disAutoRaccoglitori",
    "previewWorklist",
    "protocolEnabled",
    "defaultProtocolId",
    "userConfigList",
    "groupList",
    "privilegedUser",
    "digitalSignAlias",
    "digitalSignPassword",
    "digitalSignPasswordType",
    "modifyUserPassword",
    "modifyDigitalSignPassword",
    "isSystemUser",
    "worklistAutoRefresh",
    "isActiveDirectoryUser"
})
public class AbxUser {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String userPassword;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected String userEmail;
    @XmlElement(required = true)
    protected String userId;
    @XmlElement(required = true)
    protected String userType;
    @XmlElement(required = true)
    protected String userMaxSessions;
    @XmlElement(required = true)
    protected String userAvailSessions;
    protected boolean notificaEmail;
    protected boolean usaDefProcesso;
    protected boolean disAutoWorklist;
    protected boolean disAutoRaccoglitori;
    protected boolean previewWorklist;
    protected boolean protocolEnabled;
    @XmlElement(required = true)
    protected String defaultProtocolId;
    @XmlElement(required = true)
    protected List<AbxUserConfig> userConfigList;
    @XmlElement(required = true)
    protected AbxGroupList groupList;
    protected boolean privilegedUser;
    @XmlElement(required = true)
    protected String digitalSignAlias;
    @XmlElement(required = true)
    protected String digitalSignPassword;
    protected int digitalSignPasswordType;
    protected boolean modifyUserPassword;
    protected boolean modifyDigitalSignPassword;
    protected boolean isSystemUser;
    protected boolean worklistAutoRefresh;
    protected boolean isActiveDirectoryUser;

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
     * Recupera il valore della proprietà userPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Imposta il valore della proprietà userPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPassword(String value) {
        this.userPassword = value;
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
     * Recupera il valore della proprietà userEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * Imposta il valore della proprietà userEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserEmail(String value) {
        this.userEmail = value;
    }

    /**
     * Recupera il valore della proprietà userId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Imposta il valore della proprietà userId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Recupera il valore della proprietà userType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Imposta il valore della proprietà userType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Recupera il valore della proprietà userMaxSessions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserMaxSessions() {
        return userMaxSessions;
    }

    /**
     * Imposta il valore della proprietà userMaxSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserMaxSessions(String value) {
        this.userMaxSessions = value;
    }

    /**
     * Recupera il valore della proprietà userAvailSessions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAvailSessions() {
        return userAvailSessions;
    }

    /**
     * Imposta il valore della proprietà userAvailSessions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAvailSessions(String value) {
        this.userAvailSessions = value;
    }

    /**
     * Recupera il valore della proprietà notificaEmail.
     * 
     */
    public boolean isNotificaEmail() {
        return notificaEmail;
    }

    /**
     * Imposta il valore della proprietà notificaEmail.
     * 
     */
    public void setNotificaEmail(boolean value) {
        this.notificaEmail = value;
    }

    /**
     * Recupera il valore della proprietà usaDefProcesso.
     * 
     */
    public boolean isUsaDefProcesso() {
        return usaDefProcesso;
    }

    /**
     * Imposta il valore della proprietà usaDefProcesso.
     * 
     */
    public void setUsaDefProcesso(boolean value) {
        this.usaDefProcesso = value;
    }

    /**
     * Recupera il valore della proprietà disAutoWorklist.
     * 
     */
    public boolean isDisAutoWorklist() {
        return disAutoWorklist;
    }

    /**
     * Imposta il valore della proprietà disAutoWorklist.
     * 
     */
    public void setDisAutoWorklist(boolean value) {
        this.disAutoWorklist = value;
    }

    /**
     * Recupera il valore della proprietà disAutoRaccoglitori.
     * 
     */
    public boolean isDisAutoRaccoglitori() {
        return disAutoRaccoglitori;
    }

    /**
     * Imposta il valore della proprietà disAutoRaccoglitori.
     * 
     */
    public void setDisAutoRaccoglitori(boolean value) {
        this.disAutoRaccoglitori = value;
    }

    /**
     * Recupera il valore della proprietà previewWorklist.
     * 
     */
    public boolean isPreviewWorklist() {
        return previewWorklist;
    }

    /**
     * Imposta il valore della proprietà previewWorklist.
     * 
     */
    public void setPreviewWorklist(boolean value) {
        this.previewWorklist = value;
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
     * Gets the value of the userConfigList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userConfigList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserConfigList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbxUserConfig }
     * 
     * 
     */
    public List<AbxUserConfig> getUserConfigList() {
        if (userConfigList == null) {
            userConfigList = new ArrayList<AbxUserConfig>();
        }
        return this.userConfigList;
    }

    /**
     * Recupera il valore della proprietà groupList.
     * 
     * @return
     *     possible object is
     *     {@link AbxGroupList }
     *     
     */
    public AbxGroupList getGroupList() {
        return groupList;
    }

    /**
     * Imposta il valore della proprietà groupList.
     * 
     * @param value
     *     allowed object is
     *     {@link AbxGroupList }
     *     
     */
    public void setGroupList(AbxGroupList value) {
        this.groupList = value;
    }

    /**
     * Recupera il valore della proprietà privilegedUser.
     * 
     */
    public boolean isPrivilegedUser() {
        return privilegedUser;
    }

    /**
     * Imposta il valore della proprietà privilegedUser.
     * 
     */
    public void setPrivilegedUser(boolean value) {
        this.privilegedUser = value;
    }

    /**
     * Recupera il valore della proprietà digitalSignAlias.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalSignAlias() {
        return digitalSignAlias;
    }

    /**
     * Imposta il valore della proprietà digitalSignAlias.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalSignAlias(String value) {
        this.digitalSignAlias = value;
    }

    /**
     * Recupera il valore della proprietà digitalSignPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalSignPassword() {
        return digitalSignPassword;
    }

    /**
     * Imposta il valore della proprietà digitalSignPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalSignPassword(String value) {
        this.digitalSignPassword = value;
    }

    /**
     * Recupera il valore della proprietà digitalSignPasswordType.
     * 
     */
    public int getDigitalSignPasswordType() {
        return digitalSignPasswordType;
    }

    /**
     * Imposta il valore della proprietà digitalSignPasswordType.
     * 
     */
    public void setDigitalSignPasswordType(int value) {
        this.digitalSignPasswordType = value;
    }

    /**
     * Recupera il valore della proprietà modifyUserPassword.
     * 
     */
    public boolean isModifyUserPassword() {
        return modifyUserPassword;
    }

    /**
     * Imposta il valore della proprietà modifyUserPassword.
     * 
     */
    public void setModifyUserPassword(boolean value) {
        this.modifyUserPassword = value;
    }

    /**
     * Recupera il valore della proprietà modifyDigitalSignPassword.
     * 
     */
    public boolean isModifyDigitalSignPassword() {
        return modifyDigitalSignPassword;
    }

    /**
     * Imposta il valore della proprietà modifyDigitalSignPassword.
     * 
     */
    public void setModifyDigitalSignPassword(boolean value) {
        this.modifyDigitalSignPassword = value;
    }

    /**
     * Recupera il valore della proprietà isSystemUser.
     * 
     */
    public boolean isIsSystemUser() {
        return isSystemUser;
    }

    /**
     * Imposta il valore della proprietà isSystemUser.
     * 
     */
    public void setIsSystemUser(boolean value) {
        this.isSystemUser = value;
    }

    /**
     * Recupera il valore della proprietà worklistAutoRefresh.
     * 
     */
    public boolean isWorklistAutoRefresh() {
        return worklistAutoRefresh;
    }

    /**
     * Imposta il valore della proprietà worklistAutoRefresh.
     * 
     */
    public void setWorklistAutoRefresh(boolean value) {
        this.worklistAutoRefresh = value;
    }

    /**
     * Recupera il valore della proprietà isActiveDirectoryUser.
     * 
     */
    public boolean isIsActiveDirectoryUser() {
        return isActiveDirectoryUser;
    }

    /**
     * Imposta il valore della proprietà isActiveDirectoryUser.
     * 
     */
    public void setIsActiveDirectoryUser(boolean value) {
        this.isActiveDirectoryUser = value;
    }

}
