<?php

class abxLanguageList
{

  /**
   * 
   * @var abxLanguage $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxLanguage $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
