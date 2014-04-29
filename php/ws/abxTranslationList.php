<?php

class abxTranslationList
{

  /**
   * 
   * @var abxTranslation $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxTranslation $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
