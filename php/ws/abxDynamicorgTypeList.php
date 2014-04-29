<?php

class abxDynamicorgTypeList
{

  /**
   * 
   * @var abxDynorgRuleType $type
   * @access public
   */
  public $type;

  /**
   * 
   * @param abxDynorgRuleType $type
   * @access public
   */
  public function __construct($type)
  {
    $this->type = $type;
  }

}
