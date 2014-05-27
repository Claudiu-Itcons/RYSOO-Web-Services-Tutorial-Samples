<?php

class abxSDKTask
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $fileType
   * @access public
   */
  public $fileType;

  /**
   * 
   * @var string $status
   * @access public
   */
  public $status;

  /**
   * 
   * @var string $templateFile
   * @access public
   */
  public $templateFile;

  /**
   * 
   * @var abxSDKWatchFolder $watchFolder
   * @access public
   */
  public $watchFolder;

  /**
   * 
   * @var abxSDKTaskFieldMapping $fieldMappings
   * @access public
   */
  public $fieldMappings;

  /**
   * 
   * @var abxSDKTaskExcelPreviewSheet $excelPreviewSheets
   * @access public
   */
  public $excelPreviewSheets;

  /**
   * 
   * @var abxSDKTaskPDFPreview $PDFPreview
   * @access public
   */
  public $PDFPreview;

  /**
   * 
   * @var string $TXTPreview
   * @access public
   */
  public $TXTPreview;

  /**
   * 
   * @var abxSDKTaskValidateData $validateData
   * @access public
   */
  public $validateData;

  /**
   * 
   * @var string $templateFilePassword
   * @access public
   */
  public $templateFilePassword;

  /**
   * 
   * @param string $id
   * @param string $name
   * @param string $description
   * @param string $instanceName
   * @param string $fileType
   * @param string $status
   * @param string $templateFile
   * @param abxSDKWatchFolder $watchFolder
   * @param abxSDKTaskFieldMapping $fieldMappings
   * @param abxSDKTaskExcelPreviewSheet $excelPreviewSheets
   * @param abxSDKTaskPDFPreview $PDFPreview
   * @param string $TXTPreview
   * @param abxSDKTaskValidateData $validateData
   * @param string $templateFilePassword
   * @access public
   */
  public function __construct($id, $name, $description, $instanceName, $fileType, $status, $templateFile, $watchFolder, $fieldMappings, $excelPreviewSheets, $PDFPreview, $TXTPreview, $validateData, $templateFilePassword)
  {
    $this->id = $id;
    $this->name = $name;
    $this->description = $description;
    $this->instanceName = $instanceName;
    $this->fileType = $fileType;
    $this->status = $status;
    $this->templateFile = $templateFile;
    $this->watchFolder = $watchFolder;
    $this->fieldMappings = $fieldMappings;
    $this->excelPreviewSheets = $excelPreviewSheets;
    $this->PDFPreview = $PDFPreview;
    $this->TXTPreview = $TXTPreview;
    $this->validateData = $validateData;
    $this->templateFilePassword = $templateFilePassword;
  }

}
