<?php

class CanModifyLinkContainerToContainer
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
   * @var string $linkId
   * @access public
   */
  public $linkId;

  /**
   * 
   * @var string $instanceNameTo
   * @access public
   */
  public $instanceNameTo;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $linkTypeName
   * @param string $instanceNameFrom
   * @param string $linkId
   * @param string $instanceNameTo
   * @access public
   */
  public function __construct($SessionId, $linkTypeName, $instanceNameFrom, $linkId, $instanceNameTo)
  {
    $this->SessionId = $SessionId;
    $this->linkTypeName = $linkTypeName;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->linkId = $linkId;
    $this->instanceNameTo = $instanceNameTo;
  }

}
