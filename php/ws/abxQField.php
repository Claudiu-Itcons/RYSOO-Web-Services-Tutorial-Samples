<?php

class abxQField
{

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var abxField $fieldProperties
   * @access public
   */
  public $fieldProperties;

  /**
   * 
   * @var string $fieldTypeName
   * @access public
   */
  public $fieldTypeName;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @var abxQFieldRange $range
   * @access public
   */
  public $range;

  /**
   * 
   * @var string $fOperator
   * @access public
   */
  public $fOperator;

  /**
   * 
   * @param string $fieldName
   * @param abxField $fieldProperties
   * @param string $fieldTypeName
   * @param string $value
   * @param abxQFieldRange $range
   * @param string $fOperator
   * @access public
   */
  public function __construct($fieldName, $fieldProperties, $fieldTypeName, $value, $range, $fOperator)
  {
    $this->fieldName = $fieldName;
    $this->fieldProperties = $fieldProperties;
    $this->fieldTypeName = $fieldTypeName;
    $this->value = $value;
    $this->range = $range;
    $this->fOperator = $fOperator;
  }

}
