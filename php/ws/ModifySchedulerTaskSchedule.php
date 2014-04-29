<?php

class ModifySchedulerTaskSchedule
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxSchedulerTask $abxSchedulerTask
   * @access public
   */
  public $abxSchedulerTask;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxSchedulerTask $abxSchedulerTask
   * @access public
   */
  public function __construct($SessionId, $abxSchedulerTask)
  {
    $this->SessionId = $SessionId;
    $this->abxSchedulerTask = $abxSchedulerTask;
  }

}
