<?php

class GetSchedulerTasksToRunResponse
{

  /**
   * 
   * @var abxSchedulerResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxSchedulerResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
