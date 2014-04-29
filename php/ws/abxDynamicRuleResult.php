<?php

class abxDynamicRuleResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxDynamicorgRuleList $rules
   * @access public
   */
  public $rules;

  /**
   * 
   * @param int $result
   * @param abxDynamicorgRuleList $rules
   * @access public
   */
  public function __construct($result, $rules)
  {
    $this->result = $result;
    $this->rules = $rules;
  }

}
