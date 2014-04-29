<?php

class Fk_DB_delete
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
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param abxFK $fk
   * @access public
   */
  public function __construct($SessionId, $fieldName, $fk)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->fk = $fk;
  }

}
