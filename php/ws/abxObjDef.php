<?php

class abxObjDef
{

  /**
   * 
   * @var elobj $elobj
   * @access public
   */
  public $elobj;

  /**
   * 
   * @var anyType $xxx
   * @access public
   */
  public $xxx;

  /**
   * 
   * @param elobj $elobj
   * @param anyType $xxx
   * @access public
   */
  public function __construct($elobj, $xxx)
  {
    $this->elobj = $elobj;
    $this->xxx = $xxx;
  }

}
