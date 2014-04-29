<?php

class GetGroupsListByUserResponse
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
