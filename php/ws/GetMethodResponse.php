<?php

class GetMethodResponse
{

  /**
   * 
   * @var abxGmResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxGmResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
