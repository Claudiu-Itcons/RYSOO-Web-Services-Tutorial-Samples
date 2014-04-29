<?php

class ModSignResponse
{

  /**
   * 
   * @var abxWorkflowResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxWorkflowResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
