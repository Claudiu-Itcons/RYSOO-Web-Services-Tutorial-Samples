<?php

class abxObjAction
{

  /**
   * 
   * @var Custom $list
   * @access public
   */
  public $list;

  /**
   * 
   * @var anyType $xxx
   * @access public
   */
  public $xxx;

  /**
   * 
   * @param Custom $list
   * @param anyType $xxx
   * @access public
   */
  public function __construct($list, $xxx)
  {
    $this->list = $list;
    $this->xxx = $xxx;
  }

}
