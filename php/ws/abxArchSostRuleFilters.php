<?php

class abxArchSostRuleFilters
{

  /**
   * 
   * @var string $filterId
   * @access public
   */
  public $filterId;

  /**
   * 
   * @var string $ruleId
   * @access public
   */
  public $ruleId;

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var string $protocolID
   * @access public
   */
  public $protocolID;

  /**
   * 
   * @var string $protocolDateFrom
   * @access public
   */
  public $protocolDateFrom;

  /**
   * 
   * @var string $protocolDateTo
   * @access public
   */
  public $protocolDateTo;

  /**
   * 
   * @var string $protocolNumFrom
   * @access public
   */
  public $protocolNumFrom;

  /**
   * 
   * @var string $protocolNumTo
   * @access public
   */
  public $protocolNumTo;

  /**
   * 
   * @var string $fromValue
   * @access public
   */
  public $fromValue;

  /**
   * 
   * @var string $toValue
   * @access public
   */
  public $toValue;

  /**
   * 
   * @var int $shiftFromValue
   * @access public
   */
  public $shiftFromValue;

  /**
   * 
   * @var int $shiftToValue
   * @access public
   */
  public $shiftToValue;

  /**
   * 
   * @var boolean $replaceDate
   * @access public
   */
  public $replaceDate;

  /**
   * 
   * @param string $filterId
   * @param string $ruleId
   * @param string $fieldName
   * @param string $protocolID
   * @param string $protocolDateFrom
   * @param string $protocolDateTo
   * @param string $protocolNumFrom
   * @param string $protocolNumTo
   * @param string $fromValue
   * @param string $toValue
   * @param int $shiftFromValue
   * @param int $shiftToValue
   * @param boolean $replaceDate
   * @access public
   */
  public function __construct($filterId, $ruleId, $fieldName, $protocolID, $protocolDateFrom, $protocolDateTo, $protocolNumFrom, $protocolNumTo, $fromValue, $toValue, $shiftFromValue, $shiftToValue, $replaceDate)
  {
    $this->filterId = $filterId;
    $this->ruleId = $ruleId;
    $this->fieldName = $fieldName;
    $this->protocolID = $protocolID;
    $this->protocolDateFrom = $protocolDateFrom;
    $this->protocolDateTo = $protocolDateTo;
    $this->protocolNumFrom = $protocolNumFrom;
    $this->protocolNumTo = $protocolNumTo;
    $this->fromValue = $fromValue;
    $this->toValue = $toValue;
    $this->shiftFromValue = $shiftFromValue;
    $this->shiftToValue = $shiftToValue;
    $this->replaceDate = $replaceDate;
  }

}
