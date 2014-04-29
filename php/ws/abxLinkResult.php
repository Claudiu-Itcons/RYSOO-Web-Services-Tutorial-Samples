<?php

class abxLinkResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxLinkList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxLinkList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
