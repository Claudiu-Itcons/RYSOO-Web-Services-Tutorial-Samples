<?php

class GetSchedulerTasks
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
   * @param IDtype $SessionId
   * @param string $taskType
   * @access public
   */
  public function __construct($SessionId, $taskType)
  {
    $this->SessionId = $SessionId;
    $this->taskType = $taskType;
  }

}
