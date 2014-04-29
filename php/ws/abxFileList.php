<?php

class abxFileList
{

  /**
   * 
   * @var abxFile $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxFile $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
