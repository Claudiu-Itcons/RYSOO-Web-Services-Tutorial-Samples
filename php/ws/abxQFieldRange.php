<?php

class abxQFieldRange
{

  /**
   * 
   * @var string $fromValue
   * @access public
   */
  public $fromValue;

  /**
   * 
   * @var string $toValue
   * @access public
   */
  public $toValue;

  /**
   * 
   * @param string $fromValue
   * @param string $toValue
   * @access public
   */
  public function __construct($fromValue, $toValue)
  {
    $this->fromValue = $fromValue;
    $this->toValue = $toValue;
  }

}
