<?php

class abxQcHeadList
{

  /**
   * 
   * @var abxQcHead $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxQcHead $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
