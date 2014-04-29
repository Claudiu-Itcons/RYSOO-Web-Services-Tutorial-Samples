<?php

class GetUserListActiveDirectory
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxUser $userField
   * @access public
   */
  public $userField;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxUser $userField
   * @access public
   */
  public function __construct($SessionId, $userField)
  {
    $this->SessionId = $SessionId;
    $this->userField = $userField;
  }

}
