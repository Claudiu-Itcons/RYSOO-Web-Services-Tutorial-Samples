<?php

class DeleteSchedulerTaskSchedule
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $scheduleId
   * @access public
   */
  public $scheduleId;

  /**
   * 
   * @var int $scheduleType
   * @access public
   */
  public $scheduleType;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $scheduleId
   * @param int $scheduleType
   * @access public
   */
  public function __construct($SessionId, $scheduleId, $scheduleType)
  {
    $this->SessionId = $SessionId;
    $this->scheduleId = $scheduleId;
    $this->scheduleType = $scheduleType;
  }

}
