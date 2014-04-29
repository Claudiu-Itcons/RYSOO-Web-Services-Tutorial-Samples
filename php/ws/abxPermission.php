<?php

class abxPermission
{

  /**
   * 
   * @var Custom $list
   * @access public
   */
  public $list;

  /**
   * 
   * @var abxObjAction $defaultObjActionList
   * @access public
   */
  public $defaultObjActionList;

  /**
   * 
   * @var editPermission $editPermission
   * @access public
   */
  public $editPermission;

  /**
   * 
   * @param Custom $list
   * @param abxObjAction $defaultObjActionList
   * @param editPermission $editPermission
   * @access public
   */
  public function __construct($list, $defaultObjActionList, $editPermission)
  {
    $this->list = $list;
    $this->defaultObjActionList = $defaultObjActionList;
    $this->editPermission = $editPermission;
  }

}
