<?php

class InsertTranslationDecimalCode
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxTranslation $transLang
   * @access public
   */
  public $transLang;

  /**
   * 
   * @var string $decimalLabelCode
   * @access public
   */
  public $decimalLabelCode;

  /**
   * 
   * @var string $exArchiboxSourceSuffix
   * @access public
   */
  public $exArchiboxSourceSuffix;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxTranslation $transLang
   * @param string $decimalLabelCode
   * @param string $exArchiboxSourceSuffix
   * @access public
   */
  public function __construct($SessionId, $transLang, $decimalLabelCode, $exArchiboxSourceSuffix)
  {
    $this->SessionId = $SessionId;
    $this->transLang = $transLang;
    $this->decimalLabelCode = $decimalLabelCode;
    $this->exArchiboxSourceSuffix = $exArchiboxSourceSuffix;
  }

}
