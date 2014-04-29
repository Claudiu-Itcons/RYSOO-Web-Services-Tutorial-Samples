<?php

class methods
{

  /**
   * 
   * @var string $methodName
   * @access public
   */
  public $methodName;

  /**
   * 
   * @param string $methodName
   * @access public
   */
  public function __construct($methodName)
  {
    $this->methodName = $methodName;
  }

}
