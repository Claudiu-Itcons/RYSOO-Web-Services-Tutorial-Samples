<?php

class abxSDKTaskPDFPreview
{

  /**
   * 
   * @var int $width
   * @access public
   */
  public $width;

  /**
   * 
   * @var int $height
   * @access public
   */
  public $height;

  /**
   * 
   * @var string $text
   * @access public
   */
  public $text;

  /**
   * 
   * @var abxSDKTaskPDFImage $images
   * @access public
   */
  public $images;

  /**
   * 
   * @param int $width
   * @param int $height
   * @param string $text
   * @param abxSDKTaskPDFImage $images
   * @access public
   */
  public function __construct($width, $height, $text, $images)
  {
    $this->width = $width;
    $this->height = $height;
    $this->text = $text;
    $this->images = $images;
  }

}
