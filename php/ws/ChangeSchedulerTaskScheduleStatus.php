<?php

class ChangeSchedulerTaskScheduleStatus
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
   * @var int $scheduleStatus
   * @access public
   */
  public $scheduleStatus;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $scheduleId
   * @param int $scheduleType
   * @param int $scheduleStatus
   * @access public
   */
  public function __construct($SessionId, $scheduleId, $scheduleType, $scheduleStatus)
  {
    $this->SessionId = $SessionId;
    $this->scheduleId = $scheduleId;
    $this->scheduleType = $scheduleType;
    $this->scheduleStatus = $scheduleStatus;
  }

}
