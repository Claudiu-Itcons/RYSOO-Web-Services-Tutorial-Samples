<?php

class abxData
{

  /**
   * 
   * @var data $data
   * @access public
   */
  public $data;

  /**
   * 
   * @var abxProtocolUse $protocol
   * @access public
   */
  public $protocol;

  /**
   * 
   * @var string $totRecordFound
   * @access public
   */
  public $totRecordFound;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var string $securityId
   * @access public
   */
  public $securityId;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $masterDataId
   * @access public
   */
  public $masterDataId;

  /**
   * 
   * @var detailData $detailData
   * @access public
   */
  public $detailData;

  /**
   * 
   * @var string $note
   * @access public
   */
  public $note;

  /**
   * 
   * @var abxAllPermission $allPermission
   * @access public
   */
  public $allPermission;

  /**
   * 
   * @var dateTime $creationTimeStamp
   * @access public
   */
  public $creationTimeStamp;

  /**
   * 
   * @var dateTime $modifyTimeStamp
   * @access public
   */
  public $modifyTimeStamp;

  /**
   * 
   * @param data $data
   * @param abxProtocolUse $protocol
   * @param string $totRecordFound
   * @param string $dataId
   * @param string $securityId
   * @param string $username
   * @param string $masterDataId
   * @param detailData $detailData
   * @param string $note
   * @param abxAllPermission $allPermission
   * @param dateTime $creationTimeStamp
   * @param dateTime $modifyTimeStamp
   * @access public
   */
  public function __construct($data, $protocol, $totRecordFound, $dataId, $securityId, $username, $masterDataId, $detailData, $note, $allPermission, $creationTimeStamp, $modifyTimeStamp)
  {
    $this->data = $data;
    $this->protocol = $protocol;
    $this->totRecordFound = $totRecordFound;
    $this->dataId = $dataId;
    $this->securityId = $securityId;
    $this->username = $username;
    $this->masterDataId = $masterDataId;
    $this->detailData = $detailData;
    $this->note = $note;
    $this->allPermission = $allPermission;
    $this->creationTimeStamp = $creationTimeStamp;
    $this->modifyTimeStamp = $modifyTimeStamp;
  }

}
