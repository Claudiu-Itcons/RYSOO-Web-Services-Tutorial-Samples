<?php

class GetLanguagesResponse
{

  /**
   * 
   * @var abxLanguageResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxLanguageResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
