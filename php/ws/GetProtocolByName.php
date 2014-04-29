<?php

class GetProtocolByName
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $protocolName
   * @access public
   */
  public $protocolName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $protocolName
   * @access public
   */
  public function __construct($SessionId, $protocolName)
  {
    $this->SessionId = $SessionId;
    $this->protocolName = $protocolName;
  }

}
