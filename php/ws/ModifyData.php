<?php

class ModifyData
{

  /**
   * 
   * @var IDtype $IDtype_SessionId
   * @access public
   */
  public $IDtype_SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var abxDataList $inputData
   * @access public
   */
  public $inputData;

  /**
   * 
   * @var abxProtocolUse $protocolUseData
   * @access public
   */
  public $protocolUseData;

  /**
   * 
   * @var string $abxSecurityId
   * @access public
   */
  public $abxSecurityId;

  /**
   * 
   * @var string $masterId
   * @access public
   */
  public $masterId;

  /**
   * 
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceName
   * @param string $dataId
   * @param abxDataList $inputData
   * @param abxProtocolUse $protocolUseData
   * @param string $abxSecurityId
   * @param string $masterId
   * @param string $note
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName, $dataId, $inputData, $protocolUseData, $abxSecurityId, $masterId, $note)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->inputData = $inputData;
    $this->protocolUseData = $protocolUseData;
    $this->abxSecurityId = $abxSecurityId;
    $this->masterId = $masterId;
    $this->note = $note;
  }

}
