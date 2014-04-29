<?php

class canCreateContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $ContainerParentName
   * @access public
   */
  public $ContainerParentName;

  /**
   * 
   * @var parentDataID $parentDataID
   * @access public
   */
  public $parentDataID;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $ContainerParentName
   * @param parentDataID $parentDataID
   * @access public
   */
  public function __construct($SessionId, $ContainerParentName, $parentDataID)
  {
    $this->SessionId = $SessionId;
    $this->ContainerParentName = $ContainerParentName;
    $this->parentDataID = $parentDataID;
  }

}
