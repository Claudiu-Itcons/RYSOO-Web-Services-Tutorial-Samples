<?php

class abxEditPermission
{

  /**
   * 
   * @var string $sessionId
   * @access public
   */
  public $sessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $userName
   * @access public
   */
  public $userName;

  /**
   * 
   * @var string $groupName
   * @access public
   */
  public $groupName;

  /**
   * 
   * @var string $spread
   * @access public
   */
  public $spread;

  /**
   * 
   * @var string $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var string $dataAttachmentId
   * @access public
   */
  public $dataAttachmentId;

  /**
   * 
   * @var permissionSingleList $permissionSingleList
   * @access public
   */
  public $permissionSingleList;

  /**
   * 
   * @var string $todelete
   * @access public
   */
  public $todelete;

  /**
   * 
   * @param string $sessionId
   * @param string $instanceName
   * @param string $userName
   * @param string $groupName
   * @param string $spread
   * @param string $permission
   * @param string $dataId
   * @param string $dataAttachmentId
   * @param permissionSingleList $permissionSingleList
   * @param string $todelete
   * @access public
   */
  public function __construct($sessionId, $instanceName, $userName, $groupName, $spread, $permission, $dataId, $dataAttachmentId, $permissionSingleList, $todelete)
  {
    $this->sessionId = $sessionId;
    $this->instanceName = $instanceName;
    $this->userName = $userName;
    $this->groupName = $groupName;
    $this->spread = $spread;
    $this->permission = $permission;
    $this->dataId = $dataId;
    $this->dataAttachmentId = $dataAttachmentId;
    $this->permissionSingleList = $permissionSingleList;
    $this->todelete = $todelete;
  }

}
