<?php

class abxRmTableList
{

  /**
   * 
   * @var string $tableName
   * @access public
   */
  public $tableName;

  /**
   * 
   * @param string $tableName
   * @access public
   */
  public function __construct($tableName)
  {
    $this->tableName = $tableName;
  }

}
