<?php

class abxCan
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var boolean $can
   * @access public
   */
  public $can;

  /**
   * 
   * @param int $result
   * @param boolean $can
   * @access public
   */
  public function __construct($result, $can)
  {
    $this->result = $result;
    $this->can = $can;
  }

}
