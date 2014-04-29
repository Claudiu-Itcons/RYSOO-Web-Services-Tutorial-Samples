<?php

class UploadEndFileWA
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
   * @var string $annotazioneId
   * @access public
   */
  public $annotazioneId;

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
   * @var string $codePreviousVersion
   * @access public
   */
  public $codePreviousVersion;

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
   * @param string $annotazioneId
   * @param string $objName
   * @param abxFileList $dataListInput
   * @param string $codePreviousVersion
   * @param string $docTemplateName
   * @access public
   */
  public function __construct($SessionId, $instanceName, $annotazioneId, $objName, $dataListInput, $codePreviousVersion, $docTemplateName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->annotazioneId = $annotazioneId;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
    $this->codePreviousVersion = $codePreviousVersion;
    $this->docTemplateName = $docTemplateName;
  }

}
