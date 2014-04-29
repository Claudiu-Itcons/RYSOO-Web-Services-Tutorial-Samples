<?php

class GetDataById
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
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceName
   * @param string $dataId
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName, $dataId)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
  }

}
