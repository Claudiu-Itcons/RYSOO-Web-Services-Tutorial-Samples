<?php

class GetData
{

  /**
   * 
   * @var IDtype $IDtype_SessionId
   * @access public
   */
  public $IDtype_SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceName
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
  }

}
