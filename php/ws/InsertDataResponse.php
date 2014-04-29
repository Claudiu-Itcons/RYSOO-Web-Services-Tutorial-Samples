<?php

class InsertDataResponse
{

  /**
   * 
   * @var abxDataResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxDataResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
