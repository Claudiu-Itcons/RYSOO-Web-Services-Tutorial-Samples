<?php

class ModUser
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxUser $user
   * @access public
   */
  public $user;

  /**
   * 
   * @var string $password
   * @access public
   */
  public $password;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxUser $user
   * @param string $password
   * @access public
   */
  public function __construct($SessionId, $user, $password)
  {
    $this->SessionId = $SessionId;
    $this->user = $user;
    $this->password = $password;
  }

}
