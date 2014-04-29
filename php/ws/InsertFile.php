<?php

class InsertFile
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
   * @var abxFileList $dataListInput
   * @access public
   */
  public $dataListInput;

  /**
   * 
   * @var boolean $retrieveCodeIfMissing
   * @access public
   */
  public $retrieveCodeIfMissing;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param abxFileList $dataListInput
   * @param boolean $retrieveCodeIfMissing
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $dataListInput, $retrieveCodeIfMissing)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
    $this->retrieveCodeIfMissing = $retrieveCodeIfMissing;
  }

}
