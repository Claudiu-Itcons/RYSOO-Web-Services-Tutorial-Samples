<?php

class abxQcHead
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
