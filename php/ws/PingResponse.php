<?php

class PingResponse
{

  /**
   * 
   * @var AbxPingResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param AbxPingResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
