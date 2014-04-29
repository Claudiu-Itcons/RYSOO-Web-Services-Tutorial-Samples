<?php

class abxFkDb
{

  /**
   * 
   * @var string $dbType
   * @access public
   */
  public $dbType;

  /**
   * 
   * @var string $dbName
   * @access public
   */
  public $dbName;

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
   * @var string $password
   * @access public
   */
  public $password;

  /**
   * 
   * @var string $tableName
   * @access public
   */
  public $tableName;

  /**
   * 
   * @var string $tableIndex
   * @access public
   */
  public $tableIndex;

  /**
   * 
   * @var string $tableDesc
   * @access public
   */
  public $tableDesc;

  /**
   * 
   * @var string $poolName
   * @access public
   */
  public $poolName;

  /**
   * 
   * @var string $resourceName
   * @access public
   */
  public $resourceName;

  /**
   * 
   * @var abxFKDbRecord $recordList
   * @access public
   */
  public $recordList;

  /**
   * 
   * @var string $tableIndexValue
   * @access public
   */
  public $tableIndexValue;

  /**
   * 
   * @var string $tableDescValue
   * @access public
   */
  public $tableDescValue;

  /**
   * 
   * @var string $optionGetRecord
   * @access public
   */
  public $optionGetRecord;

  /**
   * 
   * @var string $optionSetFkValue
   * @access public
   */
  public $optionSetFkValue;

  /**
   * 
   * @var abxFKFieldMap $fieldMapList
   * @access public
   */
  public $fieldMapList;

  /**
   * 
   * @var abxFKTableFields $tableFieldList
   * @access public
   */
  public $tableFieldList;

  /**
   * 
   * @var abxRmDatabaseList $remoteDatabase
   * @access public
   */
  public $remoteDatabase;

  /**
   * 
   * @var abxRmTableList $remoteTable
   * @access public
   */
  public $remoteTable;

  /**
   * 
   * @var abxRmViewList $remoteView
   * @access public
   */
  public $remoteView;

  /**
   * 
   * @var abxRmFieldList $remoteField
   * @access public
   */
  public $remoteField;

  /**
   * 
   * @var abxMultiFKList $multiFKList
   * @access public
   */
  public $multiFKList;

  /**
   * 
   * @param string $dbType
   * @param string $dbName
   * @param string $host
   * @param string $user
   * @param string $password
   * @param string $tableName
   * @param string $tableIndex
   * @param string $tableDesc
   * @param string $poolName
   * @param string $resourceName
   * @param abxFKDbRecord $recordList
   * @param string $tableIndexValue
   * @param string $tableDescValue
   * @param string $optionGetRecord
   * @param string $optionSetFkValue
   * @param abxFKFieldMap $fieldMapList
   * @param abxFKTableFields $tableFieldList
   * @param abxRmDatabaseList $remoteDatabase
   * @param abxRmTableList $remoteTable
   * @param abxRmViewList $remoteView
   * @param abxRmFieldList $remoteField
   * @param abxMultiFKList $multiFKList
   * @access public
   */
  public function __construct($dbType, $dbName, $host, $user, $password, $tableName, $tableIndex, $tableDesc, $poolName, $resourceName, $recordList, $tableIndexValue, $tableDescValue, $optionGetRecord, $optionSetFkValue, $fieldMapList, $tableFieldList, $remoteDatabase, $remoteTable, $remoteView, $remoteField, $multiFKList)
  {
    $this->dbType = $dbType;
    $this->dbName = $dbName;
    $this->host = $host;
    $this->user = $user;
    $this->password = $password;
    $this->tableName = $tableName;
    $this->tableIndex = $tableIndex;
    $this->tableDesc = $tableDesc;
    $this->poolName = $poolName;
    $this->resourceName = $resourceName;
    $this->recordList = $recordList;
    $this->tableIndexValue = $tableIndexValue;
    $this->tableDescValue = $tableDescValue;
    $this->optionGetRecord = $optionGetRecord;
    $this->optionSetFkValue = $optionSetFkValue;
    $this->fieldMapList = $fieldMapList;
    $this->tableFieldList = $tableFieldList;
    $this->remoteDatabase = $remoteDatabase;
    $this->remoteTable = $remoteTable;
    $this->remoteView = $remoteView;
    $this->remoteField = $remoteField;
    $this->multiFKList = $multiFKList;
  }

}
