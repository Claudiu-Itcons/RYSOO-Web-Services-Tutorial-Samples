<?php

class GetFieldListResponse
{

  /**
   * 
   * @var abxFieldResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxFieldResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}