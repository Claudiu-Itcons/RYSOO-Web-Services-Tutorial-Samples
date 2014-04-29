<?php

class abxLog
{

  /**
   * 
   * @var int $eventTypeCode
   * @access public
   */
  public $eventTypeCode;

  /**
   * 
   * @var int $levelCode
   * @access public
   */
  public $levelCode;

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
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var dateTime $timestamp
   * @access public
   */
  public $timestamp;

  /**
   * 
   * @param int $eventTypeCode
   * @param int $levelCode
   * @param int $messageCode
   * @param string $description
   * @param string $username
   * @param dateTime $timestamp
   * @access public
   */
  public function __construct($eventTypeCode, $levelCode, $messageCode, $description, $username, $timestamp)
  {
    $this->eventTypeCode = $eventTypeCode;
    $this->levelCode = $levelCode;
    $this->messageCode = $messageCode;
    $this->description = $description;
    $this->username = $username;
    $this->timestamp = $timestamp;
  }

}
