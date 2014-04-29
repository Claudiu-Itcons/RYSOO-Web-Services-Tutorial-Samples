<?php

class abxDataList
{

  /**
   * 
   * @var abxData $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxData $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
