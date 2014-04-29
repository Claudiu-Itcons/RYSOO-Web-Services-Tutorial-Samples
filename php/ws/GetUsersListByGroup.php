<?php

class GetUsersListByGroup
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $groupname
   * @access public
   */
  public $groupname;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $groupname
   * @access public
   */
  public function __construct($SessionId, $groupname)
  {
    $this->SessionId = $SessionId;
    $this->groupname = $groupname;
  }

}
