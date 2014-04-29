<?php

class abxRmDatabaseList
{

  /**
   * 
   * @var string $databaseName
   * @access public
   */
  public $databaseName;

  /**
   * 
   * @param string $databaseName
   * @access public
   */
  public function __construct($databaseName)
  {
    $this->databaseName = $databaseName;
  }

}
