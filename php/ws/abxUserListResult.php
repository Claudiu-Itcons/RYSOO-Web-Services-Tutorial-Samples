<?php

class abxUserListResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxUserList $users
   * @access public
   */
  public $users;

  /**
   * 
   * @param int $result
   * @param abxUserList $users
   * @access public
   */
  public function __construct($result, $users)
  {
    $this->result = $result;
    $this->users = $users;
  }

}
