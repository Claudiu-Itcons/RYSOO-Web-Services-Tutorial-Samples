<?php

class ModifyUser
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
   * @param IDtype $SessionId
   * @param abxUser $user
   * @access public
   */
  public function __construct($SessionId, $user)
  {
    $this->SessionId = $SessionId;
    $this->user = $user;
  }

}
