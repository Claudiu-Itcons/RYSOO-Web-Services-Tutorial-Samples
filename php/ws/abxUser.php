<?php

class abxUser
{

  /**
   * 
   * @var string $userName
   * @access public
   */
  public $userName;

  /**
   * 
   * @var string $userPassword
   * @access public
   */
  public $userPassword;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $userEmail
   * @access public
   */
  public $userEmail;

  /**
   * 
   * @var string $userId
   * @access public
   */
  public $userId;

  /**
   * 
   * @var string $userType
   * @access public
   */
  public $userType;

  /**
   * 
   * @var string $userMaxSessions
   * @access public
   */
  public $userMaxSessions;

  /**
   * 
   * @var string $userAvailSessions
   * @access public
   */
  public $userAvailSessions;

  /**
   * 
   * @var boolean $notificaEmail
   * @access public
   */
  public $notificaEmail;

  /**
   * 
   * @var boolean $usaDefProcesso
   * @access public
   */
  public $usaDefProcesso;

  /**
   * 
   * @var boolean $disAutoWorklist
   * @access public
   */
  public $disAutoWorklist;

  /**
   * 
   * @var boolean $disAutoRaccoglitori
   * @access public
   */
  public $disAutoRaccoglitori;

  /**
   * 
   * @var boolean $previewWorklist
   * @access public
   */
  public $previewWorklist;

  /**
   * 
   * @var boolean $protocolEnabled
   * @access public
   */
  public $protocolEnabled;

  /**
   * 
   * @var string $defaultProtocolId
   * @access public
   */
  public $defaultProtocolId;

  /**
   * 
   * @var abxUserConfig $userConfigList
   * @access public
   */
  public $userConfigList;

  /**
   * 
   * @var abxGroupList $groupList
   * @access public
   */
  public $groupList;

  /**
   * 
   * @var boolean $privilegedUser
   * @access public
   */
  public $privilegedUser;

  /**
   * 
   * @var string $digitalSignAlias
   * @access public
   */
  public $digitalSignAlias;

  /**
   * 
   * @var string $digitalSignPassword
   * @access public
   */
  public $digitalSignPassword;

  /**
   * 
   * @var int $digitalSignPasswordType
   * @access public
   */
  public $digitalSignPasswordType;

  /**
   * 
   * @var boolean $modifyUserPassword
   * @access public
   */
  public $modifyUserPassword;

  /**
   * 
   * @var boolean $modifyDigitalSignPassword
   * @access public
   */
  public $modifyDigitalSignPassword;

  /**
   * 
   * @var boolean $isSystemUser
   * @access public
   */
  public $isSystemUser;

  /**
   * 
   * @var boolean $worklistAutoRefresh
   * @access public
   */
  public $worklistAutoRefresh;

  /**
   * 
   * @var boolean $isActiveDirectoryUser
   * @access public
   */
  public $isActiveDirectoryUser;

  /**
   * 
   * @param string $userName
   * @param string $userPassword
   * @param string $description
   * @param string $userEmail
   * @param string $userId
   * @param string $userType
   * @param string $userMaxSessions
   * @param string $userAvailSessions
   * @param boolean $notificaEmail
   * @param boolean $usaDefProcesso
   * @param boolean $disAutoWorklist
   * @param boolean $disAutoRaccoglitori
   * @param boolean $previewWorklist
   * @param boolean $protocolEnabled
   * @param string $defaultProtocolId
   * @param abxUserConfig $userConfigList
   * @param abxGroupList $groupList
   * @param boolean $privilegedUser
   * @param string $digitalSignAlias
   * @param string $digitalSignPassword
   * @param int $digitalSignPasswordType
   * @param boolean $modifyUserPassword
   * @param boolean $modifyDigitalSignPassword
   * @param boolean $isSystemUser
   * @param boolean $worklistAutoRefresh
   * @param boolean $isActiveDirectoryUser
   * @access public
   */
  public function __construct($userName, $userPassword, $description, $userEmail, $userId, $userType, $userMaxSessions, $userAvailSessions, $notificaEmail, $usaDefProcesso, $disAutoWorklist, $disAutoRaccoglitori, $previewWorklist, $protocolEnabled, $defaultProtocolId, $userConfigList, $groupList, $privilegedUser, $digitalSignAlias, $digitalSignPassword, $digitalSignPasswordType, $modifyUserPassword, $modifyDigitalSignPassword, $isSystemUser, $worklistAutoRefresh, $isActiveDirectoryUser)
  {
    $this->userName = $userName;
    $this->userPassword = $userPassword;
    $this->description = $description;
    $this->userEmail = $userEmail;
    $this->userId = $userId;
    $this->userType = $userType;
    $this->userMaxSessions = $userMaxSessions;
    $this->userAvailSessions = $userAvailSessions;
    $this->notificaEmail = $notificaEmail;
    $this->usaDefProcesso = $usaDefProcesso;
    $this->disAutoWorklist = $disAutoWorklist;
    $this->disAutoRaccoglitori = $disAutoRaccoglitori;
    $this->previewWorklist = $previewWorklist;
    $this->protocolEnabled = $protocolEnabled;
    $this->defaultProtocolId = $defaultProtocolId;
    $this->userConfigList = $userConfigList;
    $this->groupList = $groupList;
    $this->privilegedUser = $privilegedUser;
    $this->digitalSignAlias = $digitalSignAlias;
    $this->digitalSignPassword = $digitalSignPassword;
    $this->digitalSignPasswordType = $digitalSignPasswordType;
    $this->modifyUserPassword = $modifyUserPassword;
    $this->modifyDigitalSignPassword = $modifyDigitalSignPassword;
    $this->isSystemUser = $isSystemUser;
    $this->worklistAutoRefresh = $worklistAutoRefresh;
    $this->isActiveDirectoryUser = $isActiveDirectoryUser;
  }

}
