<?php

class abxSDKTaskValidateField
{

  /**
   * 
   * @var string $field
   * @access public
   */
  public $field;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param string $field
   * @param string $value
   * @access public
   */
  public function __construct($field, $value)
  {
    $this->field = $field;
    $this->value = $value;
  }

}
