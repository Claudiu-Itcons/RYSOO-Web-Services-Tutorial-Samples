<?php

class abxFileTp
{

  /**
   * 
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

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
   * @var string $idContainer
   * @access public
   */
  public $idContainer;

  /**
   * 
   * @var string $templateNameID
   * @access public
   */
  public $templateNameID;

  /**
   * 
   * @var string $templateOption
   * @access public
   */
  public $templateOption;

  /**
   * 
   * @var string $workflowProcessName
   * @access public
   */
  public $workflowProcessName;

  /**
   * 
   * @var string $workflowPackageName
   * @access public
   */
  public $workflowPackageName;

  /**
   * 
   * @var dateTime $dateCreated
   * @access public
   */
  public $dateCreated;

  /**
   * 
   * @var string $userIdCreated
   * @access public
   */
  public $userIdCreated;

  /**
   * 
   * @var dateTime $dateLastModify
   * @access public
   */
  public $dateLastModify;

  /**
   * 
   * @var string $userIdLastModify
   * @access public
   */
  public $userIdLastModify;

  /**
   * 
   * @var dateTime $timestamp
   * @access public
   */
  public $timestamp;

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
   * @var bindingExcel $bindExcel
   * @access public
   */
  public $bindExcel;

  /**
   * 
   * @var bindingWord $bindWord
   * @access public
   */
  public $bindWord;

  /**
   * 
   * @param string $attachmentId
   * @param boolean $isLastRevision
   * @param string $revisionId
   * @param string $filesize
   * @param string $filename
   * @param string $defaultLanguage
   * @param string $description
   * @param string $hash
   * @param string $hashType
   * @param abxTranslation $translationList
   * @param string $fileUniqueCode
   * @param string $filepath
   * @param string $filenameSaved
   * @param int $numDownload
   * @param string $idContainer
   * @param string $templateNameID
   * @param string $templateOption
   * @param string $workflowProcessName
   * @param string $workflowPackageName
   * @param dateTime $dateCreated
   * @param string $userIdCreated
   * @param dateTime $dateLastModify
   * @param string $userIdLastModify
   * @param dateTime $timestamp
   * @param downloadData $downloadData
   * @param uploadData $uploadData
   * @param bindingExcel $bindExcel
   * @param bindingWord $bindWord
   * @access public
   */
  public function __construct($attachmentId, $isLastRevision, $revisionId, $filesize, $filename, $defaultLanguage, $description, $hash, $hashType, $translationList, $fileUniqueCode, $filepath, $filenameSaved, $numDownload, $idContainer, $templateNameID, $templateOption, $workflowProcessName, $workflowPackageName, $dateCreated, $userIdCreated, $dateLastModify, $userIdLastModify, $timestamp, $downloadData, $uploadData, $bindExcel, $bindWord)
  {
    $this->attachmentId = $attachmentId;
    $this->isLastRevision = $isLastRevision;
    $this->revisionId = $revisionId;
    $this->filesize = $filesize;
    $this->filename = $filename;
    $this->defaultLanguage = $defaultLanguage;
    $this->description = $description;
    $this->hash = $hash;
    $this->hashType = $hashType;
    $this->translationList = $translationList;
    $this->fileUniqueCode = $fileUniqueCode;
    $this->filepath = $filepath;
    $this->filenameSaved = $filenameSaved;
    $this->numDownload = $numDownload;
    $this->idContainer = $idContainer;
    $this->templateNameID = $templateNameID;
    $this->templateOption = $templateOption;
    $this->workflowProcessName = $workflowProcessName;
    $this->workflowPackageName = $workflowPackageName;
    $this->dateCreated = $dateCreated;
    $this->userIdCreated = $userIdCreated;
    $this->dateLastModify = $dateLastModify;
    $this->userIdLastModify = $userIdLastModify;
    $this->timestamp = $timestamp;
    $this->downloadData = $downloadData;
    $this->uploadData = $uploadData;
    $this->bindExcel = $bindExcel;
    $this->bindWord = $bindWord;
  }

}
