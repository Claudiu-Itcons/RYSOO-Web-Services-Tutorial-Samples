<?php

class abxQobjectList
{

  /**
   * 
   * @var abxQobject $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxQobject $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
