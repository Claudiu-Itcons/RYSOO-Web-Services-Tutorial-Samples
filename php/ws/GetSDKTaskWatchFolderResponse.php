<?php

class GetSDKTaskWatchFolderResponse
{

  /**
   * 
   * @var abxSDKResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxSDKResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}