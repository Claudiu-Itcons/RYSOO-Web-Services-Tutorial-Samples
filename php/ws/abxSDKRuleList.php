<?php

class abxSDKRuleList
{

  /**
   * 
   * @var abxSDKRule $rules
   * @access public
   */
  public $rules;

  /**
   * 
   * @param abxSDKRule $rules
   * @access public
   */
  public function __construct($rules)
  {
    $this->rules = $rules;
  }

}
