<?php

class elmethod
{

  /**
   * 
   * @var string $methodName
   * @access public
   */
  public $methodName;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @param string $methodName
   * @param string $description
   * @access public
   */
  public function __construct($methodName, $description)
  {
    $this->methodName = $methodName;
    $this->description = $description;
  }

}
