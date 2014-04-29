<?php

class UploadWFEndFile
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
   * @var string $codePrevioWFVersion
   * @access public
   */
  public $codePrevioWFVersion;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param abxFileList $dataListInput
   * @param string $codePrevioWFVersion
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $dataListInput, $codePrevioWFVersion)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
    $this->codePrevioWFVersion = $codePrevioWFVersion;
  }

}
