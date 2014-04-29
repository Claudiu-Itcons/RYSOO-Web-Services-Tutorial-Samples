<?php

class abxMultiFK
{

  /**
   * 
   * @var string $abxFieldName
   * @access public
   */
  public $abxFieldName;

  /**
   * 
   * @var string $abxFKFieldName
   * @access public
   */
  public $abxFKFieldName;

  /**
   * 
   * @param string $abxFieldName
   * @param string $abxFKFieldName
   * @access public
   */
  public function __construct($abxFieldName, $abxFKFieldName)
  {
    $this->abxFieldName = $abxFieldName;
    $this->abxFKFieldName = $abxFKFieldName;
  }

}
