<?php

class UploadTPEndFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFileTpList $dataListInput
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
   * @param IDtype $SessionId
   * @param abxFileTpList $dataListInput
   * @param string $codePreviousVersion
   * @access public
   */
  public function __construct($SessionId, $dataListInput, $codePreviousVersion)
  {
    $this->SessionId = $SessionId;
    $this->dataListInput = $dataListInput;
    $this->codePreviousVersion = $codePreviousVersion;
  }

}
