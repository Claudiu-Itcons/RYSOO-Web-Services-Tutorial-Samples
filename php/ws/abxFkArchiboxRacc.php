<?php

class abxFkArchiboxRacc
{

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $dbName
   * @access public
   */
  public $dbName;

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
   * @var boolean $isRealTableIndex
   * @access public
   */
  public $isRealTableIndex;

  /**
   * 
   * @var string $tableDesc
   * @access public
   */
  public $tableDesc;

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
   * @var abxFKRaccRecord $recordList
   * @access public
   */
  public $recordList;

  /**
   * 
   * @var string $count
   * @access public
   */
  public $count;

  /**
   * 
   * @var abxMultiFKList $multiFKList
   * @access public
   */
  public $multiFKList;

  /**
   * 
   * @param string $instanceName
   * @param string $dbName
   * @param string $tableName
   * @param string $tableIndex
   * @param boolean $isRealTableIndex
   * @param string $tableDesc
   * @param string $tableIndexValue
   * @param string $tableDescValue
   * @param abxFKRaccRecord $recordList
   * @param string $count
   * @param abxMultiFKList $multiFKList
   * @access public
   */
  public function __construct($instanceName, $dbName, $tableName, $tableIndex, $isRealTableIndex, $tableDesc, $tableIndexValue, $tableDescValue, $recordList, $count, $multiFKList)
  {
    $this->instanceName = $instanceName;
    $this->dbName = $dbName;
    $this->tableName = $tableName;
    $this->tableIndex = $tableIndex;
    $this->isRealTableIndex = $isRealTableIndex;
    $this->tableDesc = $tableDesc;
    $this->tableIndexValue = $tableIndexValue;
    $this->tableDescValue = $tableDescValue;
    $this->recordList = $recordList;
    $this->count = $count;
    $this->multiFKList = $multiFKList;
  }

}
