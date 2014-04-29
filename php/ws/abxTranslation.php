<?php

class abxTranslation
{

  /**
   * 
   * @var string $languageType
   * @access public
   */
  public $languageType;

  /**
   * 
   * @var string $messageId
   * @access public
   */
  public $messageId;

  /**
   * 
   * @var allDescription $allDescription
   * @access public
   */
  public $allDescription;

  /**
   * 
   * @var string $messageCode
   * @access public
   */
  public $messageCode;

  /**
   * 
   * @param string $languageType
   * @param string $messageId
   * @param allDescription $allDescription
   * @param string $messageCode
   * @access public
   */
  public function __construct($languageType, $messageId, $allDescription, $messageCode)
  {
    $this->languageType = $languageType;
    $this->messageId = $messageId;
    $this->allDescription = $allDescription;
    $this->messageCode = $messageCode;
  }

}
