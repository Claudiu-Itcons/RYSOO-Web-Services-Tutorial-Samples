<?php

class Fk_DB_modify
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var abxFK $fk
   * @access public
   */
  public $fk;

  /**
   * 
   * @var boolean $optionGetCache
   * @access public
   */
  public $optionGetCache;

  /**
   * 
   * @var boolean $optionSetDesc
   * @access public
   */
  public $optionSetDesc;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param abxFK $fk
   * @param boolean $optionGetCache
   * @param boolean $optionSetDesc
   * @access public
   */
  public function __construct($SessionId, $fieldName, $fk, $optionGetCache, $optionSetDesc)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->fk = $fk;
    $this->optionGetCache = $optionGetCache;
    $this->optionSetDesc = $optionSetDesc;
  }

}
