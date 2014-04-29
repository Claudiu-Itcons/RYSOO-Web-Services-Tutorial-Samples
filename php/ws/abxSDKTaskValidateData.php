<?php

class abxSDKTaskValidateData
{

  /**
   * 
   * @var string $detailedMessage
   * @access public
   */
  public $detailedMessage;

  /**
   * 
   * @var abxSDKTaskValidateField $fields
   * @access public
   */
  public $fields;

  /**
   * 
   * @var string $filesAttach
   * @access public
   */
  public $filesAttach;

  /**
   * 
   * @param string $detailedMessage
   * @param abxSDKTaskValidateField $fields
   * @param string $filesAttach
   * @access public
   */
  public function __construct($detailedMessage, $fields, $filesAttach)
  {
    $this->detailedMessage = $detailedMessage;
    $this->fields = $fields;
    $this->filesAttach = $filesAttach;
  }

}
