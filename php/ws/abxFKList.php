<?php

class abxFKList
{

  /**
   * 
   * @var abxFK $fk
   * @access public
   */
  public $fk;

  /**
   * 
   * @param abxFK $fk
   * @access public
   */
  public function __construct($fk)
  {
    $this->fk = $fk;
  }

}
