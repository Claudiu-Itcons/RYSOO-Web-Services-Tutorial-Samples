<?php

class InsertUserInGroupResponse
{

  /**
   * 
   * @var abxUserListResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxUserListResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
