<?php

class DeleteSDKLogResponse
{

  /**
   * 
   * @var abxLogResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxLogResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
