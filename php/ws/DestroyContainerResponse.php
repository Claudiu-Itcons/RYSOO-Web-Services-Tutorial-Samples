<?php

class DestroyContainerResponse
{

  /**
   * 
   * @var abxContainerResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxContainerResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
