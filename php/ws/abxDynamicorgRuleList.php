<?php

class abxDynamicorgRuleList
{

  /**
   * 
   * @var abxDynamicorgRule $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxDynamicorgRule $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
