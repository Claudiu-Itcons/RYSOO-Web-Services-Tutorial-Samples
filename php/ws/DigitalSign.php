<?php

class DigitalSign
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
   * @var string $dataIds
   * @access public
   */
  public $dataIds;

  /**
   * 
   * @var string $fileCodes
   * @access public
   */
  public $fileCodes;

  /**
   * 
   * @var string $signUsername
   * @access public
   */
  public $signUsername;

  /**
   * 
   * @var string $signPassword
   * @access public
   */
  public $signPassword;

  /**
   * 
   * @var int $signType
   * @access public
   */
  public $signType;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataIds
   * @param string $fileCodes
   * @param string $signUsername
   * @param string $signPassword
   * @param int $signType
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataIds, $fileCodes, $signUsername, $signPassword, $signType)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataIds = $dataIds;
    $this->fileCodes = $fileCodes;
    $this->signUsername = $signUsername;
    $this->signPassword = $signPassword;
    $this->signType = $signType;
  }

}
