<?php

class ModExpressionResponse
{

  /**
   * 
   * @var abxExpressionResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxExpressionResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
