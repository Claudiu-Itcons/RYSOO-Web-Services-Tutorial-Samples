<?php

class DeleteGroupResponse
{

  /**
   * 
   * @var abxGroupResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxGroupResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
