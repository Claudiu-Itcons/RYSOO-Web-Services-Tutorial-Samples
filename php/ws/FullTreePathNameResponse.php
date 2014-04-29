<?php

class FullTreePathNameResponse
{

  /**
   * 
   * @var abxGipResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxGipResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
