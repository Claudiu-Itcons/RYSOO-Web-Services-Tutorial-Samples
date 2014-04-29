<?php

class Fk_create
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
   * @var abxFK $fkp
   * @access public
   */
  public $fkp;

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
   * @param abxFK $fkp
   * @param boolean $optionGetCache
   * @param boolean $optionSetDesc
   * @access public
   */
  public function __construct($SessionId, $fieldName, $fkp, $optionGetCache, $optionSetDesc)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->fkp = $fkp;
    $this->optionGetCache = $optionGetCache;
    $this->optionSetDesc = $optionSetDesc;
  }

}
