<?php

class parentDataID
{

  /**
   * 
   * @var string $container_InstanceName
   * @access public
   */
  public $container_InstanceName;

  /**
   * 
   * @var string $hexDataID
   * @access public
   */
  public $hexDataID;

  /**
   * 
   * @param string $container_InstanceName
   * @param string $hexDataID
   * @access public
   */
  public function __construct($container_InstanceName, $hexDataID)
  {
    $this->container_InstanceName = $container_InstanceName;
    $this->hexDataID = $hexDataID;
  }

}
