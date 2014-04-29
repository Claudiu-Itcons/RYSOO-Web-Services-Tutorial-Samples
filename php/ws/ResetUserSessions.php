<?php

class ResetUserSessions
{

  /**
   * 
   * @var abxLoginIdentity $LoginParam
   * @access public
   */
  public $LoginParam;

  /**
   * 
   * @param abxLoginIdentity $LoginParam
   * @access public
   */
  public function __construct($LoginParam)
  {
    $this->LoginParam = $LoginParam;
  }

}
