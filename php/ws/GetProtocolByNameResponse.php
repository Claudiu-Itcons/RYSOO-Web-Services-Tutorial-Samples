<?php

class GetProtocolByNameResponse
{

  /**
   * 
   * @var abxProtocolResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxProtocolResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
