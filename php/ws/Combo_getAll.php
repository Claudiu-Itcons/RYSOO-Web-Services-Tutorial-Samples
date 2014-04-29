<?php

class Combo_getAll
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
   * @var string $InstanceName
   * @access public
   */
  public $InstanceName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fieldName
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $fieldName, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->fieldName = $fieldName;
    $this->InstanceName = $InstanceName;
  }

}
