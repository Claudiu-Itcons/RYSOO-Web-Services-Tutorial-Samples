<?php

class abxProtocolResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxProtocolList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxProtocolList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
