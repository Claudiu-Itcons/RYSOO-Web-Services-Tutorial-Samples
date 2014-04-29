<?php

class GetContSign
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
   * @param IDtype $SessionId
   * @param string $instanceName
   * @access public
   */
  public function __construct($SessionId, $instanceName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
  }

}
