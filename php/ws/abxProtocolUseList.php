<?php

class abxProtocolUseList
{

  /**
   * 
   * @var abxProtocolUse $protocolUseList
   * @access public
   */
  public $protocolUseList;

  /**
   * 
   * @param abxProtocolUse $protocolUseList
   * @access public
   */
  public function __construct($protocolUseList)
  {
    $this->protocolUseList = $protocolUseList;
  }

}
