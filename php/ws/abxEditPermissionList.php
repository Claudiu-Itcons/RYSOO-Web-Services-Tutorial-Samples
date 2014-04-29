<?php

class abxEditPermissionList
{

  /**
   * 
   * @var abxEditPermission $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param abxEditPermission $list
   * @access public
   */
  public function __construct($list)
  {
    $this->list = $list;
  }

}
