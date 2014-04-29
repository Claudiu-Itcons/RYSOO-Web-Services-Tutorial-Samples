<?php

class QueryResponse
{

  /**
   * 
   * @var abxRetQueryResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxRetQueryResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
