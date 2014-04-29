<?php

class abxLogList
{

  /**
   * 
   * @var abxLog $logList
   * @access public
   */
  public $logList;

  /**
   * 
   * @param abxLog $logList
   * @access public
   */
  public function __construct($logList)
  {
    $this->logList = $logList;
  }

}
