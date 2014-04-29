<?php

class GetDynorgTypeListResponse
{

  /**
   * 
   * @var abxDynorgTypeResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxDynorgTypeResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
