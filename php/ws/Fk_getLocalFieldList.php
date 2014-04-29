<?php

class Fk_getLocalFieldList
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var boolean $users
   * @access public
   */
  public $users;

  /**
   * 
   * @var boolean $groups
   * @access public
   */
  public $groups;

  /**
   * 
   * @param IDtype $SessionId
   * @param boolean $users
   * @param boolean $groups
   * @access public
   */
  public function __construct($SessionId, $users, $groups)
  {
    $this->SessionId = $SessionId;
    $this->users = $users;
    $this->groups = $groups;
  }

}
