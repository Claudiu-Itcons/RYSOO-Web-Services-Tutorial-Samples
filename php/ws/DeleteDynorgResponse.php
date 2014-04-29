<?php

class DeleteDynorgResponse
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
