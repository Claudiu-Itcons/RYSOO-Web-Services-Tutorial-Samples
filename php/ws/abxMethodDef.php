<?php

class abxMethodDef
{

  /**
   * 
   * @var elmethod $elmethod
   * @access public
   */
  public $elmethod;

  /**
   * 
   * @var anyType $xxx
   * @access public
   */
  public $xxx;

  /**
   * 
   * @param elmethod $elmethod
   * @param anyType $xxx
   * @access public
   */
  public function __construct($elmethod, $xxx)
  {
    $this->elmethod = $elmethod;
    $this->xxx = $xxx;
  }

}
