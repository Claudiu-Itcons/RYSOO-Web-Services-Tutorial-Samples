<?php

class abxSchedule
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $startDate
   * @access public
   */
  public $startDate;

  /**
   * 
   * @var int $recurence
   * @access public
   */
  public $recurence;

  /**
   * 
   * @var boolean $isOneTime
   * @access public
   */
  public $isOneTime;

  /**
   * 
   * @var string $daysOfTheWeek
   * @access public
   */
  public $daysOfTheWeek;

  /**
   * 
   * @var string $months
   * @access public
   */
  public $months;

  /**
   * 
   * @var string $daysOfTheMonth
   * @access public
   */
  public $daysOfTheMonth;

  /**
   * 
   * @var int $status
   * @access public
   */
  public $status;

  /**
   * 
   * @var int $type
   * @access public
   */
  public $type;

  /**
   * 
   * @var string $lastRun
   * @access public
   */
  public $lastRun;

  /**
   * 
   * @var string $option
   * @access public
   */
  public $option;

  /**
   * 
   * @var string $audit_message_code_id
   * @access public
   */
  public $audit_message_code_id;

  /**
   * 
   * @var string $optional_message
   * @access public
   */
  public $optional_message;

  /**
   * 
   * @param string $id
   * @param string $startDate
   * @param int $recurence
   * @param boolean $isOneTime
   * @param string $daysOfTheWeek
   * @param string $months
   * @param string $daysOfTheMonth
   * @param int $status
   * @param int $type
   * @param string $lastRun
   * @param string $option
   * @param string $audit_message_code_id
   * @param string $optional_message
   * @access public
   */
  public function __construct($id, $startDate, $recurence, $isOneTime, $daysOfTheWeek, $months, $daysOfTheMonth, $status, $type, $lastRun, $option, $audit_message_code_id, $optional_message)
  {
    $this->id = $id;
    $this->startDate = $startDate;
    $this->recurence = $recurence;
    $this->isOneTime = $isOneTime;
    $this->daysOfTheWeek = $daysOfTheWeek;
    $this->months = $months;
    $this->daysOfTheMonth = $daysOfTheMonth;
    $this->status = $status;
    $this->type = $type;
    $this->lastRun = $lastRun;
    $this->option = $option;
    $this->audit_message_code_id = $audit_message_code_id;
    $this->optional_message = $optional_message;
  }

}
