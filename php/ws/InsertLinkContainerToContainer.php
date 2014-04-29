<?php

class InsertLinkContainerToContainer
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
   * @param string $instanceNameTo
   * @param string $note
   * @access public
   */
  public function __construct($SessionId, $linkTypeName, $instanceNameFrom, $instanceNameTo, $note)
  {
    $this->SessionId = $SessionId;
    $this->linkTypeName = $linkTypeName;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->instanceNameTo = $instanceNameTo;
    $this->note = $note;
  }

}
