<?php

class extended
{

  /**
   * 
   * @var string $property1
   * @access public
   */
  public $property1;

  /**
   * 
   * @var string $property2
   * @access public
   */
  public $property2;

  /**
   * 
   * @var string $property3
   * @access public
   */
  public $property3;

  /**
   * 
   * @var string $property4
   * @access public
   */
  public $property4;

  /**
   * 
   * @param string $property1
   * @param string $property2
   * @param string $property3
   * @param string $property4
   * @access public
   */
  public function __construct($property1, $property2, $property3, $property4)
  {
    $this->property1 = $property1;
    $this->property2 = $property2;
    $this->property3 = $property3;
    $this->property4 = $property4;
  }

}
