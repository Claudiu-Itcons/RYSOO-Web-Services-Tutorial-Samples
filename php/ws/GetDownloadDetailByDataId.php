<?php

class GetDownloadDetailByDataId
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
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
  }

}
