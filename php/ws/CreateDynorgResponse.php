<?php

class CreateDynorgResponse
{

  /**
   * 
   * @var abxDynamicRuleResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxDynamicRuleResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
