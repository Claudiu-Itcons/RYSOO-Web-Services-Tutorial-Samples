<?php

class GetObjectResponse
{

  /**
   * 
   * @var abxGoResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxGoResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
