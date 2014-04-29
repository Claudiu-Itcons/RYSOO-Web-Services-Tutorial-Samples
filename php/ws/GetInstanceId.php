<?php

class GetInstanceId
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $InstanceName
   * @access public
   */
  public $InstanceName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $InstanceName
   * @access public
   */
  public function __construct($SessionId, $InstanceName)
  {
    $this->SessionId = $SessionId;
    $this->InstanceName = $InstanceName;
  }

}
