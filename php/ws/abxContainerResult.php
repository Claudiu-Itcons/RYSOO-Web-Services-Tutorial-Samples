<?php

class abxContainerResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxContainerList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @param int $result
   * @param abxContainerList $list
   * @access public
   */
  public function __construct($result, $list)
  {
    $this->result = $result;
    $this->list = $list;
  }

}
