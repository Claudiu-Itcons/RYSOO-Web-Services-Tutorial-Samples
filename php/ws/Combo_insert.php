<?php

class Combo_insert
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
   * @var abxCombo $recordsArray
   * @access public
   */
  public $recordsArray;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param abxCombo $recordsArray
   * @access public
   */
  public function __construct($SessionId, $fieldName, $recordsArray)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->recordsArray = $recordsArray;
  }

}
