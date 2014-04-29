<?php

class abxCheckinResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxCheckinList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxCheckinList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
