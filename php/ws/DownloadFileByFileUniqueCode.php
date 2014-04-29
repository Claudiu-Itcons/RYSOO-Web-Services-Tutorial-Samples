<?php

class DownloadFileByFileUniqueCode
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
   * @var string $fileUniqueCode
   * @access public
   */
  public $fileUniqueCode;

  /**
   * 
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $fileUniqueCode
   * @param string $dChunk
   * @access public
   */
  public function __construct($SessionId, $instanceName, $fileUniqueCode, $dChunk)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->fileUniqueCode = $fileUniqueCode;
    $this->dChunk = $dChunk;
  }

}
