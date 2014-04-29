<?php

class GetUserDetailByUserId
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $userId
   * @access public
   */
  public $userId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $userId
   * @access public
   */
  public function __construct($SessionId, $userId)
  {
    $this->SessionId = $SessionId;
    $this->userId = $userId;
  }

}
