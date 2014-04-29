<?php

class FullTreePathName
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
   * @var string $targetObjName
   * @access public
   */
  public $targetObjName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $targetObjName
   * @access public
   */
  public function __construct($SessionId, $instanceName, $targetObjName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->targetObjName = $targetObjName;
  }

}
