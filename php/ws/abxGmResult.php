<?php

class abxGmResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxMethodDef $method
   * @access public
   */
  public $method;

  /**
   * 
   * @param int $result
   * @param abxMethodDef $method
   * @access public
   */
  public function __construct($result, $method)
  {
    $this->result = $result;
    $this->method = $method;
  }

}
