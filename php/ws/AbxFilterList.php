<?php

class AbxFilterList
{

  /**
   * 
   * @var AbxFilter $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param AbxFilter $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
