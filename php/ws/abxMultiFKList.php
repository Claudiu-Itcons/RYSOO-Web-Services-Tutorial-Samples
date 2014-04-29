<?php

class abxMultiFKList
{

  /**
   * 
   * @var abxMultiFK $multiFK
   * @access public
   */
  public $multiFK;

  /**
   * 
   * @param abxMultiFK $multiFK
   * @access public
   */
  public function __construct($multiFK)
  {
    $this->multiFK = $multiFK;
  }

}
