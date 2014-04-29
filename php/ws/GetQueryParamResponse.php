<?php

class GetQueryParamResponse
{

  /**
   * 
   * @var abxRetOption4QueryResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxRetOption4QueryResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
