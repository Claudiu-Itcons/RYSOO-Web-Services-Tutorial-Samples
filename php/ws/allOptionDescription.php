<?php

class allOptionDescription
{

  /**
   * 
   * @var string $language
   * @access public
   */
  public $language;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @param string $language
   * @param string $description
   * @access public
   */
  public function __construct($language, $description)
  {
    $this->language = $language;
    $this->description = $description;
  }

}
