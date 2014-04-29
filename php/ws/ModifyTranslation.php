<?php

class ModifyTranslation
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $translation_new
   * @access public
   */
  public $translation_new;

  /**
   * 
   * @var string $messageId
   * @access public
   */
  public $messageId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $translation_new
   * @param string $messageId
   * @access public
   */
  public function __construct($SessionId, $translation_new, $messageId)
  {
    $this->SessionId = $SessionId;
    $this->translation_new = $translation_new;
    $this->messageId = $messageId;
  }

}
