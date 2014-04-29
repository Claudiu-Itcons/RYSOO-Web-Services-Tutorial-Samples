<?php

class UploadUSEndFileWithUser
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

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
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFileList $dataListInput
   * @param string $codePreviousVersion
   * @param string $username
   * @access public
   */
  public function __construct($SessionId, $dataListInput, $codePreviousVersion, $username)
  {
    $this->SessionId = $SessionId;
    $this->dataListInput = $dataListInput;
    $this->codePreviousVersion = $codePreviousVersion;
    $this->username = $username;
  }

}
