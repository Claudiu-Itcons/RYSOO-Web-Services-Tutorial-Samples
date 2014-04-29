<?php

class abxArchiBoxDomainResult
{

  /**
   * 
   * @var abxArchiBoxDomainList $list
   * @access public
   */
  public $list;

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @param abxArchiBoxDomainList $list
   * @param int $result
   * @access public
   */
  public function __construct($list, $result)
  {
    $this->list = $list;
    $this->result = $result;
  }

}
