<?php

class abxQobject
{

  /**
   * 
   * @var string $ObjName
   * @access public
   */
  public $ObjName;

  /**
   * 
   * @var abxQFieldList $fields
   * @access public
   */
  public $fields;

  /**
   * 
   * @param string $ObjName
   * @param abxQFieldList $fields
   * @access public
   */
  public function __construct($ObjName, $fields)
  {
    $this->ObjName = $ObjName;
    $this->fields = $fields;
  }

}
