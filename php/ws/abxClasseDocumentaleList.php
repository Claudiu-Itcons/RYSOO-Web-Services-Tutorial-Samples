<?php

class abxClasseDocumentaleList
{

  /**
   * 
   * @var abxClasseDocumentale $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxClasseDocumentale $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
