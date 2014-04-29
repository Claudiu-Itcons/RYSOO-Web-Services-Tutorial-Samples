<?php

class abxSchedulerTaskList
{

  /**
   * 
   * @var abxSchedulerTask $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxSchedulerTask $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
