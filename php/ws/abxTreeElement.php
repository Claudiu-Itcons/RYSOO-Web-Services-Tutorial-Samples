<?php

class abxTreeElement
{

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $HexInstanceID
   * @access public
   */
  public $HexInstanceID;

  /**
   * 
   * @var string $InstanceDescription
   * @access public
   */
  public $InstanceDescription;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var dateTime $creationTimestamp
   * @access public
   */
  public $creationTimestamp;

  /**
   * 
   * @var int $revisionID
   * @access public
   */
  public $revisionID;

  /**
   * 
   * @var boolean $isLastRevision
   * @access public
   */
  public $isLastRevision;

  /**
   * 
   * @var boolean $disableRevision
   * @access public
   */
  public $disableRevision;

  /**
   * 
   * @var abxTreeElement $subelements
   * @access public
   */
  public $subelements;

  /**
   * 
   * @var boolean $dataAvailable
   * @access public
   */
  public $dataAvailable;

  /**
   * 
   * @var string $templateName
   * @access public
   */
  public $templateName;

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
   * @var abxContainer $containerDetails
   * @access public
   */
  public $containerDetails;

  /**
   * 
   * @var abxTemplate $templateDetails
   * @access public
   */
  public $templateDetails;

  /**
   * 
   * @var abxPermission $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @var abxAllPermission $allPermission
   * @access public
   */
  public $allPermission;

  /**
   * 
   * @var string $countDocument
   * @access public
   */
  public $countDocument;

  /**
   * 
   * @param string $instanceName
   * @param string $HexInstanceID
   * @param string $InstanceDescription
   * @param string $objName
   * @param dateTime $creationTimestamp
   * @param int $revisionID
   * @param boolean $isLastRevision
   * @param boolean $disableRevision
   * @param abxTreeElement $subelements
   * @param boolean $dataAvailable
   * @param string $templateName
   * @param boolean $hideContainer
   * @param string $colorDisplay
   * @param abxContainer $containerDetails
   * @param abxTemplate $templateDetails
   * @param abxPermission $permission
   * @param abxAllPermission $allPermission
   * @param string $countDocument
   * @access public
   */
  public function __construct($instanceName, $HexInstanceID, $InstanceDescription, $objName, $creationTimestamp, $revisionID, $isLastRevision, $disableRevision, $subelements, $dataAvailable, $templateName, $hideContainer, $colorDisplay, $containerDetails, $templateDetails, $permission, $allPermission, $countDocument)
  {
    $this->instanceName = $instanceName;
    $this->HexInstanceID = $HexInstanceID;
    $this->InstanceDescription = $InstanceDescription;
    $this->objName = $objName;
    $this->creationTimestamp = $creationTimestamp;
    $this->revisionID = $revisionID;
    $this->isLastRevision = $isLastRevision;
    $this->disableRevision = $disableRevision;
    $this->subelements = $subelements;
    $this->dataAvailable = $dataAvailable;
    $this->templateName = $templateName;
    $this->hideContainer = $hideContainer;
    $this->colorDisplay = $colorDisplay;
    $this->containerDetails = $containerDetails;
    $this->templateDetails = $templateDetails;
    $this->permission = $permission;
    $this->allPermission = $allPermission;
    $this->countDocument = $countDocument;
  }

}
