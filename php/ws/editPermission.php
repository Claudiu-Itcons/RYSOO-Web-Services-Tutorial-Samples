<?php

class editPermission
{

  /**
   * 
   * @var string $editUserName
   * @access public
   */
  public $editUserName;

  /**
   * 
   * @var string $editCode
   * @access public
   */
  public $editCode;

  /**
   * 
   * @var dateTime $editTimeStamp
   * @access public
   */
  public $editTimeStamp;

  /**
   * 
   * @var abxEditPermissionList $permissionSettings
   * @access public
   */
  public $permissionSettings;

  /**
   * 
   * @param string $editUserName
   * @param string $editCode
   * @param dateTime $editTimeStamp
   * @param abxEditPermissionList $permissionSettings
   * @access public
   */
  public function __construct($editUserName, $editCode, $editTimeStamp, $permissionSettings)
  {
    $this->editUserName = $editUserName;
    $this->editCode = $editCode;
    $this->editTimeStamp = $editTimeStamp;
    $this->permissionSettings = $permissionSettings;
  }

}
