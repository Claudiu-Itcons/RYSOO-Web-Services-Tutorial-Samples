<?php

class InsertData
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var int $parentRevId
   * @access public
   */
  public $parentRevId;

  /**
   * 
   * @var abxDataList $inputData
   * @access public
   */
  public $inputData;

  /**
   * 
   * @var string $masterId
   * @access public
   */
  public $masterId;

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
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @var abxVersioningList $avl
   * @access public
   */
  public $avl;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param int $parentRevId
   * @param abxDataList $inputData
   * @param string $masterId
   * @param abxProtocolUse $protocolUseData
   * @param string $abxSecurityId
   * @param string $note
   * @param abxVersioningList $avl
   * @access public
   */
  public function __construct($SessionId, $instanceName, $parentRevId, $inputData, $masterId, $protocolUseData, $abxSecurityId, $note, $avl)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->parentRevId = $parentRevId;
    $this->inputData = $inputData;
    $this->masterId = $masterId;
    $this->protocolUseData = $protocolUseData;
    $this->abxSecurityId = $abxSecurityId;
    $this->note = $note;
    $this->avl = $avl;
  }

}
