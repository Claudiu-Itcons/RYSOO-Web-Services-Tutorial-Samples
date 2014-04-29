<?php

class DeleteTranslationByCode
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $messageId
   * @access public
   */
  public $messageId;

  /**
   * 
   * @var string $exLabelCode
   * @access public
   */
  public $exLabelCode;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $messageId
   * @param string $exLabelCode
   * @access public
   */
  public function __construct($SessionId, $messageId, $exLabelCode)
  {
    $this->SessionId = $SessionId;
    $this->messageId = $messageId;
    $this->exLabelCode = $exLabelCode;
  }

}
