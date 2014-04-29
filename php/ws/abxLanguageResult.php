<?php

class abxLanguageResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxLanguageList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxLanguageList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
