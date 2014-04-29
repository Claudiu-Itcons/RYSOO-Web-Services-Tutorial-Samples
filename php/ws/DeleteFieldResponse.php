<?php

class DeleteFieldResponse
{

  /**
   * 
   * @var int $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param int $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
