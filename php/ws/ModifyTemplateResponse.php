<?php

class ModifyTemplateResponse
{

  /**
   * 
   * @var abxTemplateResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxTemplateResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
