<?php

class GetNewProtocolNumberResponse
{

  /**
   * 
   * @var abxProtocolUseResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxProtocolUseResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
