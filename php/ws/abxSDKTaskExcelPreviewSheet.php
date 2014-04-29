<?php

class abxSDKTaskExcelPreviewSheet
{

  /**
   * 
   * @var int $columnCount
   * @access public
   */
  public $columnCount;

  /**
   * 
   * @var int $rowCount
   * @access public
   */
  public $rowCount;

  /**
   * 
   * @var abxSDKTaskExcelPreviewColumn $columns
   * @access public
   */
  public $columns;

  /**
   * 
   * @var abxSDKTaskExcelPreviewRow $rows
   * @access public
   */
  public $rows;

  /**
   * 
   * @param int $columnCount
   * @param int $rowCount
   * @param abxSDKTaskExcelPreviewColumn $columns
   * @param abxSDKTaskExcelPreviewRow $rows
   * @access public
   */
  public function __construct($columnCount, $rowCount, $columns, $rows)
  {
    $this->columnCount = $columnCount;
    $this->rowCount = $rowCount;
    $this->columns = $columns;
    $this->rows = $rows;
  }

}
