<?php

class RemoveUserByGroup
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
   * @var string $groupName
   * @access public
   */
  public $groupName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $username
   * @param string $groupName
   * @access public
   */
  public function __construct($SessionId, $username, $groupName)
  {
    $this->SessionId = $SessionId;
    $this->username = $username;
    $this->groupName = $groupName;
  }

}
