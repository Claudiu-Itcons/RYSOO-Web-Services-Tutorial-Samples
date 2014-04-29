<?php

class abxSDKVariable
{

  /**
   * 
   * @var string $key
   * @access public
   */
  public $key;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param string $key
   * @param string $value
   * @access public
   */
  public function __construct($key, $value)
  {
    $this->key = $key;
    $this->value = $value;
  }

}
