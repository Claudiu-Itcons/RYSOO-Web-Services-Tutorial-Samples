<?php

class DeleteArchSostRuleResponse
{

  /**
   * 
   * @var abxArchSostResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxArchSostResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
