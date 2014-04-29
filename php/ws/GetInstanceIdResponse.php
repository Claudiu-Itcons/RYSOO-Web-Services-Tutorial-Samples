<?php

class GetInstanceIdResponse
{

  /**
   * 
   * @var abxGiiResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxGiiResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
