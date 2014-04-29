<?php

class abxReplicationResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxReplicationList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxReplicationList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
