<?php

class uploadData
{

  /**
   * 
   * @var string $hash
   * @access public
   */
  public $hash;

  /**
   * 
   * @var string $hashTypeId
   * @access public
   */
  public $hashTypeId;

  /**
   * 
   * @var string $securityLevel
   * @access public
   */
  public $securityLevel;

  /**
   * 
   * @var dateTime $timestamp
   * @access public
   */
  public $timestamp;

  /**
   * 
   * @var string $uploadDimChunk
   * @access public
   */
  public $uploadDimChunk;

  /**
   * 
   * @var string $codeFile
   * @access public
   */
  public $codeFile;

  /**
   * 
   * @var string $filename
   * @access public
   */
  public $filename;

  /**
   * 
   * @var string $filepath
   * @access public
   */
  public $filepath;

  /**
   * 
   * @var string $dimFile
   * @access public
   */
  public $dimFile;

  /**
   * 
   * @var string $byteReceived
   * @access public
   */
  public $byteReceived;

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
   * @param string $hash
   * @param string $hashTypeId
   * @param string $securityLevel
   * @param dateTime $timestamp
   * @param string $uploadDimChunk
   * @param string $codeFile
   * @param string $filename
   * @param string $filepath
   * @param string $dimFile
   * @param string $byteReceived
   * @param string $filenameSaved
   * @param string $dataId
   * @param string $instanceId
   * @param string $dbName
   * @access public
   */
  public function __construct($hash, $hashTypeId, $securityLevel, $timestamp, $uploadDimChunk, $codeFile, $filename, $filepath, $dimFile, $byteReceived, $filenameSaved, $dataId, $instanceId, $dbName)
  {
    $this->hash = $hash;
    $this->hashTypeId = $hashTypeId;
    $this->securityLevel = $securityLevel;
    $this->timestamp = $timestamp;
    $this->uploadDimChunk = $uploadDimChunk;
    $this->codeFile = $codeFile;
    $this->filename = $filename;
    $this->filepath = $filepath;
    $this->dimFile = $dimFile;
    $this->byteReceived = $byteReceived;
    $this->filenameSaved = $filenameSaved;
    $this->dataId = $dataId;
    $this->instanceId = $instanceId;
    $this->dbName = $dbName;
  }

}
