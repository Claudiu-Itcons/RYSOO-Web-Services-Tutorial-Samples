<?php

class InsertSchedulerTask
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxSchedulerTask $abxSchedulerTask
   * @access public
   */
  public $abxSchedulerTask;

  /**
   * 
   * @var abxArchSostDocumentList $abxDocuments
   * @access public
   */
  public $abxDocuments;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxSchedulerTask $abxSchedulerTask
   * @param abxArchSostDocumentList $abxDocuments
   * @access public
   */
  public function __construct($SessionId, $abxSchedulerTask, $abxDocuments)
  {
    $this->SessionId = $SessionId;
    $this->abxSchedulerTask = $abxSchedulerTask;
    $this->abxDocuments = $abxDocuments;
  }

}
