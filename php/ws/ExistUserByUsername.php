<?php

class ExistUserByUsername
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $username
   * @access public
   */
  public function __construct($SessionId, $username)
  {
    $this->SessionId = $SessionId;
    $this->username = $username;
  }

}
