<?php

class canDeleteField
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $FieldName
   * @access public
   */
  public $FieldName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $FieldName
   * @access public
   */
  public function __construct($SessionId, $FieldName)
  {
    $this->SessionId = $SessionId;
    $this->FieldName = $FieldName;
  }

}
