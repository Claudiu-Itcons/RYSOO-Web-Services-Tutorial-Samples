<?php

class DeleteTranslation
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
   * @param IDtype $SessionId
   * @param string $messageId
   * @access public
   */
  public function __construct($SessionId, $messageId)
  {
    $this->SessionId = $SessionId;
    $this->messageId = $messageId;
  }

}
