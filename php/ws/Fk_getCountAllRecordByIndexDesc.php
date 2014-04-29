<?php

class Fk_getCountAllRecordByIndexDesc
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFK $fkp
   * @access public
   */
  public $fkp;

  /**
   * 
   * @var string $InstanceName
   * @access public
   */
  public $InstanceName;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFK $fkp
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $fkp, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->fkp = $fkp;
    $this->InstanceName = $InstanceName;
  }

}
