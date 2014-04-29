<?php

class InsertTranslation
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
   * @param IDtype $SessionId
   * @param abxTranslation $transLang
   * @access public
   */
  public function __construct($SessionId, $transLang)
  {
    $this->SessionId = $SessionId;
    $this->transLang = $transLang;
  }

}
