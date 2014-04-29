<?php

class GetSDKWatchFolderDirectories
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $serverURL
   * @access public
   */
  public $serverURL;

  /**
   * 
   * @var string $serverRoot
   * @access public
   */
  public $serverRoot;

  /**
   * 
   * @var string $serverType
   * @access public
   */
  public $serverType;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @var string $password
   * @access public
   */
  public $password;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $serverURL
   * @param string $serverRoot
   * @param string $serverType
   * @param string $username
   * @param string $password
   * @access public
   */
  public function __construct($SessionId, $serverURL, $serverRoot, $serverType, $username, $password)
  {
    $this->SessionId = $SessionId;
    $this->serverURL = $serverURL;
    $this->serverRoot = $serverRoot;
    $this->serverType = $serverType;
    $this->username = $username;
    $this->password = $password;
  }

}
