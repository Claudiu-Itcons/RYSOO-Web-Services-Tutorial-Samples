<?php

class AddFileToSyncByArcCue
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
   * @var string $fromArchiboxId
   * @access public
   */
  public $fromArchiboxId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $fileCode
   * @param string $fromArchiboxId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $fileCode, $fromArchiboxId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->fileCode = $fileCode;
    $this->fromArchiboxId = $fromArchiboxId;
  }

}
