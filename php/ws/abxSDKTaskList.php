<?php

class abxSDKTaskList
{

  /**
   * 
   * @var abxSDKTask $tasks
   * @access public
   */
  public $tasks;

  /**
   * 
   * @param abxSDKTask $tasks
   * @access public
   */
  public function __construct($tasks)
  {
    $this->tasks = $tasks;
  }

}
