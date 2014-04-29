<?php

class abxComboResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxComboList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxComboList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}