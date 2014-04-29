<?php

class elobj
{

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var methods $methods
   * @access public
   */
  public $methods;

  /**
   * 
   * @param string $objName
   * @param string $description
   * @param methods $methods
   * @access public
   */
  public function __construct($objName, $description, $methods)
  {
    $this->objName = $objName;
    $this->description = $description;
    $this->methods = $methods;
  }

}
