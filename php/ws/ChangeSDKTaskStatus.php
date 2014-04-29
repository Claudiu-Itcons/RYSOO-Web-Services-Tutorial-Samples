<?php

class ChangeSDKTaskStatus
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $taskId
   * @access public
   */
  public $taskId;

  /**
   * 
   * @var int $taskStatus
   * @access public
   */
  public $taskStatus;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $taskId
   * @param int $taskStatus
   * @access public
   */
  public function __construct($SessionId, $taskId, $taskStatus)
  {
    $this->SessionId = $SessionId;
    $this->taskId = $taskId;
    $this->taskStatus = $taskStatus;
  }

}
