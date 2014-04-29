<?php

class GetProtocolByNameDesc
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
   * @var string $protocolName
   * @access public
   */
  public $protocolName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $protocolDesc
   * @param string $protocolName
   * @access public
   */
  public function __construct($SessionId, $protocolDesc, $protocolName)
  {
    $this->SessionId = $SessionId;
    $this->protocolDesc = $protocolDesc;
    $this->protocolName = $protocolName;
  }

}
