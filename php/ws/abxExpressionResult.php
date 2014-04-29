<?php

class abxExpressionResult
{

  /**
   * 
   * @var abxExpressionList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @param abxExpressionList $list
   * @param int $result
   * @access public
   */
  public function __construct($list, $result)
  {
    $this->list = $list;
    $this->result = $result;
  }

}
