<?php

class abxSDKTaskPDFImage
{

  /**
   * 
   * @var base64Binary $bitArray
   * @access public
   */
  public $bitArray;

  /**
   * 
   * @param base64Binary $bitArray
   * @access public
   */
  public function __construct($bitArray)
  {
    $this->bitArray = $bitArray;
  }

}
