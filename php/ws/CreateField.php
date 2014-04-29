<?php

class CreateField
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxField $Field2Update
   * @access public
   */
  public $Field2Update;

  /**
   * 
   * @var abxCombo $recordsArray
   * @access public
   */
  public $recordsArray;

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
   * @param abxField $Field2Update
   * @param abxCombo $recordsArray
   * @param abxFK $fkp
   * @param boolean $optionGetCache
   * @param boolean $optionSetDesc
   * @access public
   */
  public function __construct($SessionId, $Field2Update, $recordsArray, $fkp, $optionGetCache, $optionSetDesc)
  {
    $this->SessionId = $SessionId;
    $this->Field2Update = $Field2Update;
    $this->recordsArray = $recordsArray;
    $this->fkp = $fkp;
    $this->optionGetCache = $optionGetCache;
    $this->optionSetDesc = $optionSetDesc;
  }

}
