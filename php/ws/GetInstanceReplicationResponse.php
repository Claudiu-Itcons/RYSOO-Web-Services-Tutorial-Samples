<?php

class GetInstanceReplicationResponse
{

  /**
   * 
   * @var abxReplicationResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxReplicationResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
