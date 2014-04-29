<?php

class Fk_getAllRecordByDesc
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
   * @var int $numTotRecord
   * @access public
   */
  public $numTotRecord;

  /**
   * 
   * @var string $orderBy
   * @access public
   */
  public $orderBy;

  /**
   * 
   * @var boolean $directionDesc
   * @access public
   */
  public $directionDesc;

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
   * @param int $numTotRecord
   * @param string $orderBy
   * @param boolean $directionDesc
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $fk, $numTotRecord, $orderBy, $directionDesc, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->fk = $fk;
    $this->numTotRecord = $numTotRecord;
    $this->orderBy = $orderBy;
    $this->directionDesc = $directionDesc;
    $this->InstanceName = $InstanceName;
  }

}
