<?php

class AbxFilterResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var AbxFilterList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param AbxFilterList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
