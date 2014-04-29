<?php

class abxLogResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxLogList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxLogList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
