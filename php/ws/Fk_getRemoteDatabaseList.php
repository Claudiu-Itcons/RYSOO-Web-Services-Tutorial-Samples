<?php

class Fk_getRemoteDatabaseList
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $host
   * @access public
   */
  public $host;

  /**
   * 
   * @var string $user
   * @access public
   */
  public $user;

  /**
   * 
   * @var string $pwd
   * @access public
   */
  public $pwd;

  /**
   * 
   * @var string $dbType
   * @access public
   */
  public $dbType;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $host
   * @param string $user
   * @param string $pwd
   * @param string $dbType
   * @access public
   */
  public function __construct($SessionId, $host, $user, $pwd, $dbType)
  {
    $this->SessionId = $SessionId;
    $this->host = $host;
    $this->user = $user;
    $this->pwd = $pwd;
    $this->dbType = $dbType;
  }

}
