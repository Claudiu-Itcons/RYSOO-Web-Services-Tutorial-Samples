<?php

class abxGiiResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var string $hexId
   * @access public
   */
  public $hexId;

  /**
   * 
   * @param int $result
   * @param string $hexId
   * @access public
   */
  public function __construct($result, $hexId)
  {
    $this->result = $result;
    $this->hexId = $hexId;
  }

}
