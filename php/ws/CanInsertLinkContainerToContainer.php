<?php

class CanInsertLinkContainerToContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceNameFrom
   * @access public
   */
  public $instanceNameFrom;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceNameFrom
   * @access public
   */
  public function __construct($SessionId, $instanceNameFrom)
  {
    $this->SessionId = $SessionId;
    $this->instanceNameFrom = $instanceNameFrom;
  }

}
