<?php

class abxSDKTaskExcelPreviewRow
{

  /**
   * 
   * @var int $columnId
   * @access public
   */
  public $columnId;

  /**
   * 
   * @var int $rowId
   * @access public
   */
  public $rowId;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param int $columnId
   * @param int $rowId
   * @param string $value
   * @access public
   */
  public function __construct($columnId, $rowId, $value)
  {
    $this->columnId = $columnId;
    $this->rowId = $rowId;
    $this->value = $value;
  }

}
