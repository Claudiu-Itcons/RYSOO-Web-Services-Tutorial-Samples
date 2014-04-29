<?php

class DeleteFileVersion
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
   * @var string $fileCode
   * @access public
   */
  public $fileCode;

  /**
   * 
   * @var string $versionNumber
   * @access public
   */
  public $versionNumber;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param string $fileCode
   * @param string $versionNumber
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $fileCode, $versionNumber)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->fileCode = $fileCode;
    $this->versionNumber = $versionNumber;
  }

}
