<?php

class abxTranslationResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxTranslationList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxTranslationList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
