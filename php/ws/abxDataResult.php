<?php

class abxDataResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxDataList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @var string $optionalMessage
   * @access public
   */
  public $optionalMessage;

  /**
   * 
   * @param int $result
   * @param abxDataList $list
   * @param string $optionalMessage
   * @access public
   */
  public function __construct($result, $list, $optionalMessage)
  {
    $this->result = $result;
    $this->list = $list;
    $this->optionalMessage = $optionalMessage;
  }

}
