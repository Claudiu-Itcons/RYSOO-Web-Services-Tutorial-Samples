<?php

class InsertFilterResponse
{

  /**
   * 
   * @var AbxFilterResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param AbxFilterResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
