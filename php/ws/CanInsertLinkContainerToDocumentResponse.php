<?php

class CanInsertLinkContainerToDocumentResponse
{

  /**
   * 
   * @var abxCan $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxCan $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}