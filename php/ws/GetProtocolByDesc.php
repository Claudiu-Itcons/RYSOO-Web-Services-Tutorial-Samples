<?php

class GetProtocolByDesc
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $protocolDesc
   * @access public
   */
  public $protocolDesc;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $protocolDesc
   * @access public
   */
  public function __construct($SessionId, $protocolDesc)
  {
    $this->SessionId = $SessionId;
    $this->protocolDesc = $protocolDesc;
  }

}
