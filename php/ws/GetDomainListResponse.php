<?php

class GetDomainListResponse
{

  /**
   * 
   * @var abxDomainResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxDomainResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
