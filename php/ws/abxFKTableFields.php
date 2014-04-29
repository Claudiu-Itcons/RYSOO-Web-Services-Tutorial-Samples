<?php

class abxFKTableFields
{

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var string $fieldType
   * @access public
   */
  public $fieldType;

  /**
   * 
   * @var string $fieldPrecision
   * @access public
   */
  public $fieldPrecision;

  /**
   * 
   * @param string $fieldName
   * @param string $fieldType
   * @param string $fieldPrecision
   * @access public
   */
  public function __construct($fieldName, $fieldType, $fieldPrecision)
  {
    $this->fieldName = $fieldName;
    $this->fieldType = $fieldType;
    $this->fieldPrecision = $fieldPrecision;
  }

}
