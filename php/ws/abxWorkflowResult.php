<?php

class abxWorkflowResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxWorkflowList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxWorkflowList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
