<?php

class abxArchSostResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxArchSostRuleList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxArchSostRuleList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
