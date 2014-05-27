<?php

class abxProtocol
{

  /**
   * 
   * @var allDescription $allDescription
   * @access public
   */
  public $allDescription;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $messageId
   * @access public
   */
  public $messageId;

  /**
   * 
   * @var string $protocolName
   * @access public
   */
  public $protocolName;

  /**
   * 
   * @var boolean $checkDate
   * @access public
   */
  public $checkDate;

  /**
   * 
   * @var boolean $checkSequenceDate
   * @access public
   */
  public $checkSequenceDate;

  /**
   * 
   * @var boolean $annualReset
   * @access public
   */
  public $annualReset;

  /**
   * 
   * @var string $format
   * @access public
   */
  public $format;

  /**
   * 
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @var string $idProtocol
   * @access public
   */
  public $idProtocol;

  /**
   * 
   * @var string $protocolDesc
   * @access public
   */
  public $protocolDesc;

  /**
   * 
   * @var int $numberLength
   * @access public
   */
  public $numberLength;

  /**
   * 
   * @param allDescription $allDescription
   * @param string $defaultLanguage
   * @param string $messageId
   * @param string $protocolName
   * @param boolean $checkDate
   * @param boolean $checkSequenceDate
   * @param boolean $annualReset
   * @param string $format
   * @param string $note
   * @param string $idProtocol
   * @param string $protocolDesc
   * @param int $numberLength
   * @access public
   */
  public function __construct($allDescription, $defaultLanguage, $messageId, $protocolName, $checkDate, $checkSequenceDate, $annualReset, $format, $note, $idProtocol, $protocolDesc, $numberLength)
  {
    $this->allDescription = $allDescription;
    $this->defaultLanguage = $defaultLanguage;
    $this->messageId = $messageId;
    $this->protocolName = $protocolName;
    $this->checkDate = $checkDate;
    $this->checkSequenceDate = $checkSequenceDate;
    $this->annualReset = $annualReset;
    $this->format = $format;
    $this->note = $note;
    $this->idProtocol = $idProtocol;
    $this->protocolDesc = $protocolDesc;
    $this->numberLength = $numberLength;
  }

}
