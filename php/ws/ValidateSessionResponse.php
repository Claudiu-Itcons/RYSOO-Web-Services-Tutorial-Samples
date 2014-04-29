<?php

class ValidateSessionResponse
{

  /**
   * 
   * @var abxLoginResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxLoginResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
