<?php

class UploadEndFileContainer
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
   * @var string $docTemplateName
   * @access public
   */
  public $docTemplateName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param abxFileList $dataListInput
   * @param string $docTemplateName
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $dataListInput, $docTemplateName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
    $this->docTemplateName = $docTemplateName;
  }

}
