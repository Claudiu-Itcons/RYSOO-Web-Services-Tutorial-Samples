<?php

class abxFileTpResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxFileTpList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxFileTpList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
