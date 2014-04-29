<?php

class abxGroupList
{

  /**
   * 
   * @var abxGroup $group
   * @access public
   */
  public $group;

  /**
   * 
   * @param abxGroup $group
   * @access public
   */
  public function __construct($group)
  {
    $this->group = $group;
  }

}
