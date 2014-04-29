<?php

class GetTreeResponse
{

  /**
   * 
   * @var abxTreeResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxTreeResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
