<?php

class DestroyRaccoglitoreResponse
{

  /**
   * 
   * @var abxRaccoglitoreResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxRaccoglitoreResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
