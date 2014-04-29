<?php

class abxQFieldList
{

  /**
   * 
   * @var abxQField $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxQField $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
