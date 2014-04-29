<?php

class CanUseProtocol
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var abxProtocolUse $protocolUseData
   * @access public
   */
  public $protocolUseData;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param abxProtocolUse $protocolUseData
   * @access public
   */
  public function __construct($SessionId, $instanceName, $protocolUseData)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->protocolUseData = $protocolUseData;
  }

}
