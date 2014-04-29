<?php

class abxVersioning
{

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var boolean $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param string $objName
   * @param boolean $value
   * @access public
   */
  public function __construct($objName, $value)
  {
    $this->objName = $objName;
    $this->value = $value;
  }

}
