<?php

class listCustom
{

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $inheritedInstanceName
   * @access public
   */
  public $inheritedInstanceName;

  /**
   * 
   * @var string $groupName
   * @access public
   */
  public $groupName;

  /**
   * 
   * @var string $orderId
   * @access public
   */
  public $orderId;

  /**
   * 
   * @var string $inherited
   * @access public
   */
  public $inherited;

  /**
   * 
   * @var string $spread
   * @access public
   */
  public $spread;

  /**
   * 
   * @var string $permissionDef
   * @access public
   */
  public $permissionDef;

  /**
   * 
   * @var abxObjAction $objActionList
   * @access public
   */
  public $objActionList;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @param string $username
   * @param string $instanceName
   * @param string $inheritedInstanceName
   * @param string $groupName
   * @param string $orderId
   * @param string $inherited
   * @param string $spread
   * @param string $permissionDef
   * @param abxObjAction $objActionList
   * @param string $objName
   * @access public
   */
  public function __construct($username, $instanceName, $inheritedInstanceName, $groupName, $orderId, $inherited, $spread, $permissionDef, $objActionList, $objName)
  {
    $this->username = $username;
    $this->instanceName = $instanceName;
    $this->inheritedInstanceName = $inheritedInstanceName;
    $this->groupName = $groupName;
    $this->orderId = $orderId;
    $this->inherited = $inherited;
    $this->spread = $spread;
    $this->permissionDef = $permissionDef;
    $this->objActionList = $objActionList;
    $this->objName = $objName;
  }

}
