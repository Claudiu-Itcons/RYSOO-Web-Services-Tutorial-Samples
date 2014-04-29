<?php

class abxTemplateResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxTemplateList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxTemplateList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
