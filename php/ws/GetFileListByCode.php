<?php

class GetFileListByCode
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
   * @var string $fileCode
   * @access public
   */
  public $fileCode;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $fileCode
   * @access public
   */
  public function __construct($SessionId, $instanceName, $fileCode)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->fileCode = $fileCode;
  }

}
