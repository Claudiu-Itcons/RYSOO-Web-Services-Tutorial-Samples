<?php

class abxGipResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var string $pathname
   * @access public
   */
  public $pathname;

  /**
   * 
   * @param int $result
   * @param string $pathname
   * @access public
   */
  public function __construct($result, $pathname)
  {
    $this->result = $result;
    $this->pathname = $pathname;
  }

}
