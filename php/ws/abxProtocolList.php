<?php

class abxProtocolList
{

  /**
   * 
   * @var abxProtocol $protocolList
   * @access public
   */
  public $protocolList;

  /**
   * 
   * @param abxProtocol $protocolList
   * @access public
   */
  public function __construct($protocolList)
  {
    $this->protocolList = $protocolList;
  }

}
