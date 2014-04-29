<?php

class downloadData
{

  /**
   * 
   * @var string $downloadDimTot
   * @access public
   */
  public $downloadDimTot;

  /**
   * 
   * @var string $byteSent
   * @access public
   */
  public $byteSent;

  /**
   * 
   * @var string $filenameSaved
   * @access public
   */
  public $filenameSaved;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var string $instanceId
   * @access public
   */
  public $instanceId;

  /**
   * 
   * @var string $dbName
   * @access public
   */
  public $dbName;

  /**
   * 
   * @var string $codeFile
   * @access public
   */
  public $codeFile;

  /**
   * 
   * @var base64Binary $byteReady
   * @access public
   */
  public $byteReady;

  /**
   * 
   * @var string $codeDownload
   * @access public
   */
  public $codeDownload;

  /**
   * 
   * @param string $downloadDimTot
   * @param string $byteSent
   * @param string $filenameSaved
   * @param string $dataId
   * @param string $instanceId
   * @param string $dbName
   * @param string $codeFile
   * @param base64Binary $byteReady
   * @param string $codeDownload
   * @access public
   */
  public function __construct($downloadDimTot, $byteSent, $filenameSaved, $dataId, $instanceId, $dbName, $codeFile, $byteReady, $codeDownload)
  {
    $this->downloadDimTot = $downloadDimTot;
    $this->byteSent = $byteSent;
    $this->filenameSaved = $filenameSaved;
    $this->dataId = $dataId;
    $this->instanceId = $instanceId;
    $this->dbName = $dbName;
    $this->codeFile = $codeFile;
    $this->byteReady = $byteReady;
    $this->codeDownload = $codeDownload;
  }

}
