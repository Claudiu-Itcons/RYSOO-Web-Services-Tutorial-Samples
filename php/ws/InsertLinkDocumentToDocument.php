<?php

class InsertLinkDocumentToDocument
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
   * @var string $instanceNameFrom
   * @access public
   */
  public $instanceNameFrom;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var string $instanceNameTo
   * @access public
   */
  public $instanceNameTo;

  /**
   * 
   * @var string $dataIdTo
   * @access public
   */
  public $dataIdTo;

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
   * @param string $instanceNameFrom
   * @param string $dataId
   * @param string $instanceNameTo
   * @param string $dataIdTo
   * @param string $note
   * @access public
   */
  public function __construct($SessionId, $linkTypeName, $instanceNameFrom, $dataId, $instanceNameTo, $dataIdTo, $note)
  {
    $this->SessionId = $SessionId;
    $this->linkTypeName = $linkTypeName;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->dataId = $dataId;
    $this->instanceNameTo = $instanceNameTo;
    $this->dataIdTo = $dataIdTo;
    $this->note = $note;
  }

}
