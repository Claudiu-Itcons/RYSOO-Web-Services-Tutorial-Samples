<?php

class abxFieldResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxFieldList $list
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
   * @param abxFieldList $list
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
