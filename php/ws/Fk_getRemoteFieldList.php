<?php

class Fk_getRemoteFieldList
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
   * @var string $databaseName
   * @access public
   */
  public $databaseName;

  /**
   * 
   * @var string $tableName
   * @access public
   */
  public $tableName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $host
   * @param string $user
   * @param string $pwd
   * @param string $dbType
   * @param string $databaseName
   * @param string $tableName
   * @access public
   */
  public function __construct($SessionId, $host, $user, $pwd, $dbType, $databaseName, $tableName)
  {
    $this->SessionId = $SessionId;
    $this->host = $host;
    $this->user = $user;
    $this->pwd = $pwd;
    $this->dbType = $dbType;
    $this->databaseName = $databaseName;
    $this->tableName = $tableName;
  }

}
