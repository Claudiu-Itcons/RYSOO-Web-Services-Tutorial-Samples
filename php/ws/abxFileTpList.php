<?php

class abxFileTpList
{

  /**
   * 
   * @var abxFileTp $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxFileTp $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
