<?php

class abxContainer
{

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description;

  /**
   * 
   * @var allDescription $allDescription
   * @access public
   */
  public $allDescription;

  /**
   * 
   * @var boolean $revisionEnabled
   * @access public
   */
  public $revisionEnabled;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var string $parentContainerName
   * @access public
   */
  public $parentContainerName;

  /**
   * 
   * @var string $templateName
   * @access public
   */
  public $templateName;

  /**
   * 
   * @var parentDataID $parentDataID
   * @access public
   */
  public $parentDataID;

  /**
   * 
   * @var boolean $hideContainer
   * @access public
   */
  public $hideContainer;

  /**
   * 
   * @var string $colorDisplay
   * @access public
   */
  public $colorDisplay;

  /**
   * 
   * @var boolean $fileAutoOverwrite
   * @access public
   */
  public $fileAutoOverwrite;

  /**
   * 
   * @var abxPermission $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @var abxMasterDetail $masterDetail
   * @access public
   */
  public $masterDetail;

  /**
   * 
   * @var boolean $protocolEnabled
   * @access public
   */
  public $protocolEnabled;

  /**
   * 
   * @var boolean $previewEnabled
   * @access public
   */
  public $previewEnabled;

  /**
   * 
   * @var boolean $downloadNumEnabled
   * @access public
   */
  public $downloadNumEnabled;

  /**
   * 
   * @var string $downloadNumber
   * @access public
   */
  public $downloadNumber;

  /**
   * 
   * @var string $defaultProtocolId
   * @access public
   */
  public $defaultProtocolId;

  /**
   * 
   * @var boolean $WFProcDefEnabled
   * @access public
   */
  public $WFProcDefEnabled;

  /**
   * 
   * @var boolean $WFProcDefUserEnabled
   * @access public
   */
  public $WFProcDefUserEnabled;

  /**
   * 
   * @param string $name
   * @param string $defaultLanguage
   * @param string $Description
   * @param allDescription $allDescription
   * @param boolean $revisionEnabled
   * @param string $objName
   * @param string $parentContainerName
   * @param string $templateName
   * @param parentDataID $parentDataID
   * @param boolean $hideContainer
   * @param string $colorDisplay
   * @param boolean $fileAutoOverwrite
   * @param abxPermission $permission
   * @param abxMasterDetail $masterDetail
   * @param boolean $protocolEnabled
   * @param boolean $previewEnabled
   * @param boolean $downloadNumEnabled
   * @param string $downloadNumber
   * @param string $defaultProtocolId
   * @param boolean $WFProcDefEnabled
   * @param boolean $WFProcDefUserEnabled
   * @access public
   */
  public function __construct($name, $defaultLanguage, $Description, $allDescription, $revisionEnabled, $objName, $parentContainerName, $templateName, $parentDataID, $hideContainer, $colorDisplay, $fileAutoOverwrite, $permission, $masterDetail, $protocolEnabled, $previewEnabled, $downloadNumEnabled, $downloadNumber, $defaultProtocolId, $WFProcDefEnabled, $WFProcDefUserEnabled)
  {
    $this->name = $name;
    $this->defaultLanguage = $defaultLanguage;
    $this->Description = $Description;
    $this->allDescription = $allDescription;
    $this->revisionEnabled = $revisionEnabled;
    $this->objName = $objName;
    $this->parentContainerName = $parentContainerName;
    $this->templateName = $templateName;
    $this->parentDataID = $parentDataID;
    $this->hideContainer = $hideContainer;
    $this->colorDisplay = $colorDisplay;
    $this->fileAutoOverwrite = $fileAutoOverwrite;
    $this->permission = $permission;
    $this->masterDetail = $masterDetail;
    $this->protocolEnabled = $protocolEnabled;
    $this->previewEnabled = $previewEnabled;
    $this->downloadNumEnabled = $downloadNumEnabled;
    $this->downloadNumber = $downloadNumber;
    $this->defaultProtocolId = $defaultProtocolId;
    $this->WFProcDefEnabled = $WFProcDefEnabled;
    $this->WFProcDefUserEnabled = $WFProcDefUserEnabled;
  }

}
