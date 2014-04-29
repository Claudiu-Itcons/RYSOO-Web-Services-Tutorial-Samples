<?php

class GetDocumentLinksResponse
{

  /**
   * 
   * @var abxLinkResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxLinkResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
