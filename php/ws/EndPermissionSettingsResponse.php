<?php

class EndPermissionSettingsResponse
{

  /**
   * 
   * @var abxPermissionResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxPermissionResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
