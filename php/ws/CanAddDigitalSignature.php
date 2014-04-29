<?php

class CanAddDigitalSignature
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
   * @var abxFileList $dataListInput
   * @access public
   */
  public $dataListInput;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param abxFileList $dataListInput
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataListInput)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataListInput = $dataListInput;
  }

}
