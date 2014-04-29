<?php

class abxFKResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxFKList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxFKList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
