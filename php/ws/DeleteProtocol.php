<?php

class DeleteProtocol
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxProtocol $protocolData
   * @access public
   */
  public $protocolData;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxProtocol $protocolData
   * @access public
   */
  public function __construct($SessionId, $protocolData)
  {
    $this->SessionId = $SessionId;
    $this->protocolData = $protocolData;
  }

}
