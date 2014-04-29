<?php

class InsertTranslationCode
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
   * @var string $exLabelCode
   * @access public
   */
  public $exLabelCode;

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
   * @param string $exLabelCode
   * @param string $exArchiboxSourceSuffix
   * @access public
   */
  public function __construct($SessionId, $transLang, $exLabelCode, $exArchiboxSourceSuffix)
  {
    $this->SessionId = $SessionId;
    $this->transLang = $transLang;
    $this->exLabelCode = $exLabelCode;
    $this->exArchiboxSourceSuffix = $exArchiboxSourceSuffix;
  }

}
