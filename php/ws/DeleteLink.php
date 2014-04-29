<?php

class DeleteLink
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
   * @var string $linkId
   * @access public
   */
  public $linkId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceNameFrom
   * @param string $linkId
   * @access public
   */
  public function __construct($SessionId, $instanceNameFrom, $linkId)
  {
    $this->SessionId = $SessionId;
    $this->instanceNameFrom = $instanceNameFrom;
    $this->linkId = $linkId;
  }

}
