<?php

class abxArchiBoxDomainList
{

  /**
   * 
   * @var abxArchiBoxDomain $archiboxDomainList
   * @access public
   */
  public $archiboxDomainList;

  /**
   * 
   * @param abxArchiBoxDomain $archiboxDomainList
   * @access public
   */
  public function __construct($archiboxDomainList)
  {
    $this->archiboxDomainList = $archiboxDomainList;
  }

}
