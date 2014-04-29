<?php

class abxDynorgRuleType
{

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @param string $name
   * @param string $description
   * @access public
   */
  public function __construct($name, $description)
  {
    $this->name = $name;
    $this->description = $description;
  }

}
