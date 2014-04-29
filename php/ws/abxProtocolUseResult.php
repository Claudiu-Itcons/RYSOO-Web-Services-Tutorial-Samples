<?php

class abxProtocolUseResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxProtocolUseList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxProtocolUseList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
