<?php

class Combo_isComboResponse
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
