<?php

class Fk_getCountAllRecord
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFK $fk
   * @access public
   */
  public $fk;

  /**
   * 
   * @var string $InstanceName
   * @access public
   */
  public $InstanceName;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFK $fk
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $fk, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->fk = $fk;
    $this->InstanceName = $InstanceName;
  }

}
