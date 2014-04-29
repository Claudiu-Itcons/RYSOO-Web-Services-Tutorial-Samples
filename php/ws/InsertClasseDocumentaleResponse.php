<?php

class InsertClasseDocumentaleResponse
{

  /**
   * 
   * @var abxClasseDocumentaleResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxClasseDocumentaleResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
