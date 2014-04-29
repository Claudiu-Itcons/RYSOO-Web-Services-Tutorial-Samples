<?php

class abxLinkList
{

  /**
   * 
   * @var abxLink $linkList
   * @access public
   */
  public $linkList;

  /**
   * 
   * @param abxLink $linkList
   * @access public
   */
  public function __construct($linkList)
  {
    $this->linkList = $linkList;
  }

}
