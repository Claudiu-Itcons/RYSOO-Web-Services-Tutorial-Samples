<?php

class GetCountFileList
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceId
   * @access public
   */
  public $instanceId;

  /**
   * 
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceId
   * @param string $dataId
   * @access public
   */
  public function __construct($SessionId, $instanceId, $dataId)
  {
    $this->SessionId = $SessionId;
    $this->instanceId = $instanceId;
    $this->dataId = $dataId;
  }

}
