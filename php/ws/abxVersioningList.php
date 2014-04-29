<?php

class abxVersioningList
{

  /**
   * 
   * @var abxVersioning $versionList
   * @access public
   */
  public $versionList;

  /**
   * 
   * @param abxVersioning $versionList
   * @access public
   */
  public function __construct($versionList)
  {
    $this->versionList = $versionList;
  }

}
