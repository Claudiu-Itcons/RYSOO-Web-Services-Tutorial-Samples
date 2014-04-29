<?php

class abxLanguage
{

  /**
   * 
   * @var string $language
   * @access public
   */
  public $language;

  /**
   * 
   * @var string $languageId
   * @access public
   */
  public $languageId;

  /**
   * 
   * @var string $languageCode
   * @access public
   */
  public $languageCode;

  /**
   * 
   * @param string $language
   * @param string $languageId
   * @param string $languageCode
   * @access public
   */
  public function __construct($language, $languageId, $languageCode)
  {
    $this->language = $language;
    $this->languageId = $languageId;
    $this->languageCode = $languageCode;
  }

}
