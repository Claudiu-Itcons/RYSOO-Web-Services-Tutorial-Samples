<?php

class AddLogSDK
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var int $eventTypeCode
   * @access public
   */
  public $eventTypeCode;

  /**
   * 
   * @var int $levelInfoCode
   * @access public
   */
  public $levelInfoCode;

  /**
   * 
   * @var int $messageCode
   * @access public
   */
  public $messageCode;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @param IDtype $SessionId
   * @param int $eventTypeCode
   * @param int $levelInfoCode
   * @param int $messageCode
   * @param string $description
   * @access public
   */
  public function __construct($SessionId, $eventTypeCode, $levelInfoCode, $messageCode, $description)
  {
    $this->SessionId = $SessionId;
    $this->eventTypeCode = $eventTypeCode;
    $this->levelInfoCode = $levelInfoCode;
    $this->messageCode = $messageCode;
    $this->description = $description;
  }

}
