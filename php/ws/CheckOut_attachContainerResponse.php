<?php

class CheckOut_attachContainerResponse
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