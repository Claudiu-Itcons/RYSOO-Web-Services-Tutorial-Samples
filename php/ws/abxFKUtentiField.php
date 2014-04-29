<?php

class abxFKUtentiField
{

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var string $fieldValue
   * @access public
   */
  public $fieldValue;

  /**
   * 
   * @param string $fieldName
   * @param string $fieldValue
   * @access public
   */
  public function __construct($fieldName, $fieldValue)
  {
    $this->fieldName = $fieldName;
    $this->fieldValue = $fieldValue;
  }

}
