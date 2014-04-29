<?php

class abxArchSostDocumentList
{

  /**
   * 
   * @var abxArchSostDocument $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxArchSostDocument $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
