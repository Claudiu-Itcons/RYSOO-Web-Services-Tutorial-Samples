<?php

class GetSDKTaskWatchFolder
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
   * @param IDtype $SessionId
   * @param string $taskId
   * @access public
   */
  public function __construct($SessionId, $taskId)
  {
    $this->SessionId = $SessionId;
    $this->taskId = $taskId;
  }

}
