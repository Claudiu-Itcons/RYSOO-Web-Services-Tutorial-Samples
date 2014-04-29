<?php

class AddUser
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $password
   * @access public
   */
  public $password;

  /**
   * 
   * @var abxUser $user
   * @access public
   */
  public $user;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $password
   * @param abxUser $user
   * @access public
   */
  public function __construct($SessionId, $password, $user)
  {
    $this->SessionId = $SessionId;
    $this->password = $password;
    $this->user = $user;
  }

}
