<?php

class abxDynorgTypeResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxDynamicorgTypeList $types
   * @access public
   */
  public $types;

  /**
   * 
   * @param int $result
   * @param abxDynamicorgTypeList $types
   * @access public
   */
  public function __construct($result, $types)
  {
    $this->result = $result;
    $this->types = $types;
  }

}
