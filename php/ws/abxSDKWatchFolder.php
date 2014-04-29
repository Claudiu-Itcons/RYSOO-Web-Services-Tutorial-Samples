<?php

class abxSDKWatchFolder
{

  /**
   * 
   * @var string $watchFolderId
   * @access public
   */
  public $watchFolderId;

  /**
   * 
   * @var string $taskId
   * @access public
   */
  public $taskId;

  /**
   * 
   * @var string $serverType
   * @access public
   */
  public $serverType;

  /**
   * 
   * @var string $configXML
   * @access public
   */
  public $configXML;

  /**
   * 
   * @param string $watchFolderId
   * @param string $taskId
   * @param string $serverType
   * @param string $configXML
   * @access public
   */
  public function __construct($watchFolderId, $taskId, $serverType, $configXML)
  {
    $this->watchFolderId = $watchFolderId;
    $this->taskId = $taskId;
    $this->serverType = $serverType;
    $this->configXML = $configXML;
  }

}
