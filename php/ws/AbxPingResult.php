<?php

class AbxPingResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param int $result
   * @param string $value
   * @access public
   */
  public function __construct($result, $value)
  {
    $this->result = $result;
    $this->value = $value;
  }

}
