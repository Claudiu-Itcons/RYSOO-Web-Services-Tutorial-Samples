<?php

class GetWsdlVersionResponse
{

  /**
   * 
   * @var AbxWsdlResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param AbxWsdlResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
