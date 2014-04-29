<?php

class Combo_getAllResponse
{

  /**
   * 
   * @var abxComboResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxComboResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
