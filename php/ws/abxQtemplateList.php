<?php

class abxQtemplateList
{

  /**
   * 
   * @var abxQtemplate $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxQtemplate $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
