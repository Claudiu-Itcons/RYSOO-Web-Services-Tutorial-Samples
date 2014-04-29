<?php

class SchedulerTaskScheduleProcessed
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var schedule $schedule
   * @access public
   */
  public $schedule;

  /**
   * 
   * @param IDtype $SessionId
   * @param schedule $schedule
   * @access public
   */
  public function __construct($SessionId, $schedule)
  {
    $this->SessionId = $SessionId;
    $this->schedule = $schedule;
  }

}
