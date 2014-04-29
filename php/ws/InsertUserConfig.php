<?php

class InsertUserConfig
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
   * @var abxUser $configList
   * @access public
   */
  public $configList;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $username
   * @param abxUser $configList
   * @access public
   */
  public function __construct($SessionId, $username, $configList)
  {
    $this->SessionId = $SessionId;
    $this->username = $username;
    $this->configList = $configList;
  }

}
