<?php

class InsertWFFile
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
   * @var string $abxSecurityId
   * @access public
   */
  public $abxSecurityId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param abxFileList $dataListInput
   * @param string $abxSecurityId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $dataListInput, $abxSecurityId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
    $this->abxSecurityId = $abxSecurityId;
  }

}
