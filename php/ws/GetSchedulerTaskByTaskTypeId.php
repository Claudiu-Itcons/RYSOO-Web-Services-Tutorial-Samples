<?php

class GetSchedulerTaskByTaskTypeId
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $taskType
   * @access public
   */
  public $taskType;

  /**
   * 
   * @var string $taskTypeId
   * @access public
   */
  public $taskTypeId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $taskType
   * @param string $taskTypeId
   * @access public
   */
  public function __construct($SessionId, $taskType, $taskTypeId)
  {
    $this->SessionId = $SessionId;
    $this->taskType = $taskType;
    $this->taskTypeId = $taskTypeId;
  }

}
