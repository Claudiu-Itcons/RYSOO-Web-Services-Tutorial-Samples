<?php

class abxFile
{

  /**
   * 
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var boolean $isLastRevision
   * @access public
   */
  public $isLastRevision;

  /**
   * 
   * @var string $revisionId
   * @access public
   */
  public $revisionId;

  /**
   * 
   * @var string $filesize
   * @access public
   */
  public $filesize;

  /**
   * 
   * @var string $filename
   * @access public
   */
  public $filename;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var dateTime $timestamp
   * @access public
   */
  public $timestamp;

  /**
   * 
   * @var string $hash
   * @access public
   */
  public $hash;

  /**
   * 
   * @var string $hashType
   * @access public
   */
  public $hashType;

  /**
   * 
   * @var string $containerId
   * @access public
   */
  public $containerId;

  /**
   * 
   * @var downloadData $downloadData
   * @access public
   */
  public $downloadData;

  /**
   * 
   * @var uploadData $uploadData
   * @access public
   */
  public $uploadData;

  /**
   * 
   * @var abxTranslation $translationList
   * @access public
   */
  public $translationList;

  /**
   * 
   * @var string $fileUniqueCode
   * @access public
   */
  public $fileUniqueCode;

  /**
   * 
   * @var string $previousFileUniqueCode
   * @access public
   */
  public $previousFileUniqueCode;

  /**
   * 
   * @var string $filepath
   * @access public
   */
  public $filepath;

  /**
   * 
   * @var string $filenameSaved
   * @access public
   */
  public $filenameSaved;

  /**
   * 
   * @var int $numDownload
   * @access public
   */
  public $numDownload;

  /**
   * 
   * @var string $templateNameID
   * @access public
   */
  public $templateNameID;

  /**
   * 
   * @var abxAllPermission $allPermission
   * @access public
   */
  public $allPermission;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $codeGroupVersion
   * @access public
   */
  public $codeGroupVersion;

  /**
   * 
   * @var base64Binary $enabled
   * @access public
   */
  public $enabled;

  /**
   * 
   * @var string $signatureOwner
   * @access public
   */
  public $signatureOwner;

  /**
   * 
   * @var dateTime $signatureTimestamp
   * @access public
   */
  public $signatureTimestamp;

  /**
   * 
   * @var abxFile $linkedFiles
   * @access public
   */
  public $linkedFiles;

  /**
   * 
   * @param string $attachmentId
   * @param string $dataId
   * @param boolean $isLastRevision
   * @param string $revisionId
   * @param string $filesize
   * @param string $filename
   * @param string $defaultLanguage
   * @param string $description
   * @param dateTime $timestamp
   * @param string $hash
   * @param string $hashType
   * @param string $containerId
   * @param downloadData $downloadData
   * @param uploadData $uploadData
   * @param abxTranslation $translationList
   * @param string $fileUniqueCode
   * @param string $previousFileUniqueCode
   * @param string $filepath
   * @param string $filenameSaved
   * @param int $numDownload
   * @param string $templateNameID
   * @param abxAllPermission $allPermission
   * @param string $username
   * @param string $codeGroupVersion
   * @param base64Binary $enabled
   * @param string $signatureOwner
   * @param dateTime $signatureTimestamp
   * @param abxFile $linkedFiles
   * @access public
   */
  public function __construct($attachmentId, $dataId, $isLastRevision, $revisionId, $filesize, $filename, $defaultLanguage, $description, $timestamp, $hash, $hashType, $containerId, $downloadData, $uploadData, $translationList, $fileUniqueCode, $previousFileUniqueCode, $filepath, $filenameSaved, $numDownload, $templateNameID, $allPermission, $username, $codeGroupVersion, $enabled, $signatureOwner, $signatureTimestamp, $linkedFiles)
  {
    $this->attachmentId = $attachmentId;
    $this->dataId = $dataId;
    $this->isLastRevision = $isLastRevision;
    $this->revisionId = $revisionId;
    $this->filesize = $filesize;
    $this->filename = $filename;
    $this->defaultLanguage = $defaultLanguage;
    $this->description = $description;
    $this->timestamp = $timestamp;
    $this->hash = $hash;
    $this->hashType = $hashType;
    $this->containerId = $containerId;
    $this->downloadData = $downloadData;
    $this->uploadData = $uploadData;
    $this->translationList = $translationList;
    $this->fileUniqueCode = $fileUniqueCode;
    $this->previousFileUniqueCode = $previousFileUniqueCode;
    $this->filepath = $filepath;
    $this->filenameSaved = $filenameSaved;
    $this->numDownload = $numDownload;
    $this->templateNameID = $templateNameID;
    $this->allPermission = $allPermission;
    $this->username = $username;
    $this->codeGroupVersion = $codeGroupVersion;
    $this->enabled = $enabled;
    $this->signatureOwner = $signatureOwner;
    $this->signatureTimestamp = $signatureTimestamp;
    $this->linkedFiles = $linkedFiles;
  }

}
