<?php

class Combo_isCombo
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
   * @param IDtype $SessionId
   * @param string $fieldName
   * @access public
   */
  public function __construct($SessionId, $fieldName)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
  }

}
