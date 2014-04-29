<?php

class abxPermissionResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxPermissionElenco $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxPermissionElenco $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
