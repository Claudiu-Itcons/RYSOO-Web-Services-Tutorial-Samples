<?php

class abxUserList
{

  /**
   * 
   * @var abxUser $user
   * @access public
   */
  public $user;

  /**
   * 
   * @param abxUser $user
   * @access public
   */
  public function __construct($user)
  {
    $this->user = $user;
  }

}
