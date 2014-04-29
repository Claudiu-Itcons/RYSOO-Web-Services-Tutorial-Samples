<?php

class ModifyLinkContainerToDocument
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $linkTypeName
   * @access public
   */
  public $linkTypeName;

  /**
   * 
   * @var string $linkId
   * @access public
   */
  public $linkId;

  /**
   * 
   * @var string $instanceNameFrom
   * @access public
   */
  public $instanceNameFrom;

  /**
   * 
   * @var string $instanceNameTo
   * @access public
   */
  public $instanceNameTo;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $linkTypeName
   * @param string $linkId
   * @param string $instanceNameFrom
   * @param string $instanceNameTo
   * @param string $dataId
   * @param string $note
   * @access public
   */
  public function __construct($SessionId, $linkTypeName, $linkId, $instanceNameFrom, $instanceNameTo, $dataId, $note)
  {
    $this->SessionId = $SessionId;
    $this->linkTypeName = $linkTypeName;
    $this->linkId = $linkId;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->instanceNameTo = $instanceNameTo;
    $this->dataId = $dataId;
    $this->note = $note;
  }

}
