<?php

class Fk_getAllRecordByIndexDesc
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
   * @param abxFK $fkp
   * @param int $numTotRecord
   * @param string $orderBy
   * @param boolean $directionDesc
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $fkp, $numTotRecord, $orderBy, $directionDesc, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->fkp = $fkp;
    $this->numTotRecord = $numTotRecord;
    $this->orderBy = $orderBy;
    $this->directionDesc = $directionDesc;
    $this->InstanceName = $InstanceName;
  }

}
