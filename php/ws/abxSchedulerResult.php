<?php

class abxSchedulerResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxSchedulerTaskList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxSchedulerTaskList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
