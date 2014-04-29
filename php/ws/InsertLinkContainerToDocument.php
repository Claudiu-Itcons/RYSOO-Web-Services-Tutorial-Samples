<?php

class InsertLinkContainerToDocument
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
   * @var string $dataIdTo
   * @access public
   */
  public $dataIdTo;

  /**
   * 
   * @var string $instanceNameTo
   * @access public
   */
  public $instanceNameTo;

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
   * @param string $dataIdTo
   * @param string $instanceNameTo
   * @param string $note
   * @access public
   */
  public function __construct($SessionId, $linkTypeName, $instanceNameFrom, $dataIdTo, $instanceNameTo, $note)
  {
    $this->SessionId = $SessionId;
    $this->linkTypeName = $linkTypeName;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->dataIdTo = $dataIdTo;
    $this->instanceNameTo = $instanceNameTo;
    $this->note = $note;
  }

}
