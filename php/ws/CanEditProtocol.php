<?php

class CanEditProtocol
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $protocolId
   * @access public
   */
  public $protocolId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $protocolId
   * @access public
   */
  public function __construct($SessionId, $protocolId)
  {
    $this->SessionId = $SessionId;
    $this->protocolId = $protocolId;
  }

}
