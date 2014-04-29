<?php

class CreateSDKTaskWatchFolder
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxSDKTask $sdkTask
   * @access public
   */
  public $sdkTask;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxSDKTask $sdkTask
   * @access public
   */
  public function __construct($SessionId, $sdkTask)
  {
    $this->SessionId = $SessionId;
    $this->sdkTask = $sdkTask;
  }

}
