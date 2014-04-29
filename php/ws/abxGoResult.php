<?php

class abxGoResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxObjDef $object
   * @access public
   */
  public $object;

  /**
   * 
   * @param int $result
   * @param abxObjDef $object
   * @access public
   */
  public function __construct($result, $object)
  {
    $this->result = $result;
    $this->object = $object;
  }

}
