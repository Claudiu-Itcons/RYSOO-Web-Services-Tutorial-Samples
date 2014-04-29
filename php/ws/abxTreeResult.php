<?php

class abxTreeResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxTree $tree
   * @access public
   */
  public $tree;

  /**
   * 
   * @param int $result
   * @param abxTree $tree
   * @access public
   */
  public function __construct($result, $tree)
  {
    $this->result = $result;
    $this->tree = $tree;
  }

}
