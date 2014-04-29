<?php

class abxArchSostDocument
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $schedulerDailyId
   * @access public
   */
  public $schedulerDailyId;

  /**
   * 
   * @var string $schedulerWeeklyId
   * @access public
   */
  public $schedulerWeeklyId;

  /**
   * 
   * @var string $schedulerMonthlyId
   * @access public
   */
  public $schedulerMonthlyId;

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
   * @var string $tdocDocumentId
   * @access public
   */
  public $tdocDocumentId;

  /**
   * 
   * @param string $id
   * @param string $schedulerDailyId
   * @param string $schedulerWeeklyId
   * @param string $schedulerMonthlyId
   * @param string $instanceName
   * @param string $dataId
   * @param string $tdocDocumentId
   * @access public
   */
  public function __construct($id, $schedulerDailyId, $schedulerWeeklyId, $schedulerMonthlyId, $instanceName, $dataId, $tdocDocumentId)
  {
    $this->id = $id;
    $this->schedulerDailyId = $schedulerDailyId;
    $this->schedulerWeeklyId = $schedulerWeeklyId;
    $this->schedulerMonthlyId = $schedulerMonthlyId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->tdocDocumentId = $tdocDocumentId;
  }

}
