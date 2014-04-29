<?php

class CanInsertFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param string $dataId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $dataId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->dataId = $dataId;
  }

}
