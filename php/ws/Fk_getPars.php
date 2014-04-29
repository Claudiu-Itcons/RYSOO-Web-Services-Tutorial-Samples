<?php

class Fk_getPars
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
   * @var string $fkName
   * @access public
   */
  public $fkName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param string $fkName
   * @access public
   */
  public function __construct($SessionId, $fieldName, $fkName)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->fkName = $fkName;
  }

}
