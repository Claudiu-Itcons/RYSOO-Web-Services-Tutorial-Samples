<?php

class GetTranslationBySourceSuffixResponse
{

  /**
   * 
   * @var abxTranslationResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxTranslationResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
