<?php

class abxRmFieldList
{

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @param string $fieldName
   * @access public
   */
  public function __construct($fieldName)
  {
    $this->fieldName = $fieldName;
  }

}
