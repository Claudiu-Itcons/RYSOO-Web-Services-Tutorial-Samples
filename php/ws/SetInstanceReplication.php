<?php

class SetInstanceReplication
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
   * @var abxReplicationList $replicationList
   * @access public
   */
  public $replicationList;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param abxReplicationList $replicationList
   * @access public
   */
  public function __construct($SessionId, $instanceName, $replicationList)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->replicationList = $replicationList;
  }

}
