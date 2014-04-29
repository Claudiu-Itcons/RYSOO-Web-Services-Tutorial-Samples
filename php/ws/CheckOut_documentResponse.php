<?php

class CheckOut_documentResponse
{

  /**
   * 
   * @var abxCheckinResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxCheckinResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
