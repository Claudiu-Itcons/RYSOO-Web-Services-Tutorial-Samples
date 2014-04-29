<?php

class GetTranslationByMessageId
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $exMessageId
   * @access public
   */
  public $exMessageId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $exMessageId
   * @access public
   */
  public function __construct($SessionId, $exMessageId)
  {
    $this->SessionId = $SessionId;
    $this->exMessageId = $exMessageId;
  }

}
