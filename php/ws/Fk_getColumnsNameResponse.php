<?php

class Fk_getColumnsNameResponse
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
