<?php

class Combo_removeItem
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
   * @var string $descItem
   * @access public
   */
  public $descItem;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param string $descItem
   * @access public
   */
  public function __construct($SessionId, $fieldName, $descItem)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->descItem = $descItem;
  }

}
