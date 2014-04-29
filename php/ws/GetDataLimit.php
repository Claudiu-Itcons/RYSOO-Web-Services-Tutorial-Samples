<?php

class GetDataLimit
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
   * @var int $numTotRecord
   * @access public
   */
  public $numTotRecord;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceName
   * @param int $numTotRecord
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName, $numTotRecord)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
    $this->numTotRecord = $numTotRecord;
  }

}
