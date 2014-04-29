<?php

class objvect
{

  /**
   * 
   * @var string $objname
   * @access public
   */
  public $objname;

  /**
   * 
   * @param string $objname
   * @access public
   */
  public function __construct($objname)
  {
    $this->objname = $objname;
  }

}
