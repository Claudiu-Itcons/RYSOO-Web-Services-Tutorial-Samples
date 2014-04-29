<?php

class abxDomainList
{

  /**
   * 
   * @var abxDomain $domainList
   * @access public
   */
  public $domainList;

  /**
   * 
   * @param abxDomain $domainList
   * @access public
   */
  public function __construct($domainList)
  {
    $this->domainList = $domainList;
  }

}
