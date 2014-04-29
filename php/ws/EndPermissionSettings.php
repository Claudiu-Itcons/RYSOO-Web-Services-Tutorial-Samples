<?php

class EndPermissionSettings
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxPermission $permissionToSet
   * @access public
   */
  public $permissionToSet;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxPermission $permissionToSet
   * @access public
   */
  public function __construct($SessionId, $permissionToSet)
  {
    $this->SessionId = $SessionId;
    $this->permissionToSet = $permissionToSet;
  }

}
