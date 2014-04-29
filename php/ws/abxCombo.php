<?php

class abxCombo
{

  /**
   * 
   * @var abxComboRecord $listRecords
   * @access public
   */
  public $listRecords;

  /**
   * 
   * @param abxComboRecord $listRecords
   * @access public
   */
  public function __construct($listRecords)
  {
    $this->listRecords = $listRecords;
  }

}
