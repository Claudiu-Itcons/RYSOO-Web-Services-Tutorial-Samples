<?php

class GetInstanceNameFromLinks
{

  /**
   * 
   * @var IDtype $IDtype_SessionId
   * @access public
   */
  public $IDtype_SessionId;

  /**
   * 
   * @var string $instanceNameFrom
   * @access public
   */
  public $instanceNameFrom;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceNameFrom
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceNameFrom)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceNameFrom = $instanceNameFrom;
  }

}
