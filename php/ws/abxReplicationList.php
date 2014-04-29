<?php

class abxReplicationList
{

  /**
   * 
   * @var abxArchiBoxInDomain $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxArchiBoxInDomain $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
