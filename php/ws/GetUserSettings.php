<?php

class GetUserSettings
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
   * @var string $userName
   * @access public
   */
  public $userName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $userName
   * @access public
   */
  public function __construct($SessionId, $instanceName, $userName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->userName = $userName;
  }

}
