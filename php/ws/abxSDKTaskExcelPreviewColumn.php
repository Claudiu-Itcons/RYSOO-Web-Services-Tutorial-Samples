<?php

class abxSDKTaskExcelPreviewColumn
{

  /**
   * 
   * @var int $columnId
   * @access public
   */
  public $columnId;

  /**
   * 
   * @var int $columnWidth
   * @access public
   */
  public $columnWidth;

  /**
   * 
   * @param int $columnId
   * @param int $columnWidth
   * @access public
   */
  public function __construct($columnId, $columnWidth)
  {
    $this->columnId = $columnId;
    $this->columnWidth = $columnWidth;
  }

}
