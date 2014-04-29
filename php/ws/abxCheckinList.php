<?php

class abxCheckinList
{

  /**
   * 
   * @var abxCheckin $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxCheckin $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
