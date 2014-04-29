<?php

class Fk_createResponse
{

  /**
   * 
   * @var abxFKResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxFKResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
