<?php

class GetNewProtocolNumber
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxProtocolUse $protocolData
   * @access public
   */
  public $protocolData;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxProtocolUse $protocolData
   * @access public
   */
  public function __construct($SessionId, $protocolData)
  {
    $this->SessionId = $SessionId;
    $this->protocolData = $protocolData;
  }

}
