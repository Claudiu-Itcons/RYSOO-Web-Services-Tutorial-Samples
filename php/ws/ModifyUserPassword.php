<?php

class ModifyUserPassword
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
   * @var string $oldPassword
   * @access public
   */
  public $oldPassword;

  /**
   * 
   * @var string $newPassword
   * @access public
   */
  public $newPassword;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $username
   * @param string $oldPassword
   * @param string $newPassword
   * @access public
   */
  public function __construct($SessionId, $username, $oldPassword, $newPassword)
  {
    $this->SessionId = $SessionId;
    $this->username = $username;
    $this->oldPassword = $oldPassword;
    $this->newPassword = $newPassword;
  }

}
