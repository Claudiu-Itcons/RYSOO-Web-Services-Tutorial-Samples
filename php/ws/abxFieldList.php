<?php

class abxFieldList
{

  /**
   * 
   * @var abxField $field
   * @access public
   */
  public $field;

  /**
   * 
   * @param abxField $field
   * @access public
   */
  public function __construct($field)
  {
    $this->field = $field;
  }

}
