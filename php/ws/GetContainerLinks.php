<?php

class GetContainerLinks
{

  /**
   * 
   * @var IDtype $IDtype_SessionId
   * @access public
   */
  public $IDtype_SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $linkTypeName
   * @access public
   */
  public $linkTypeName;

  /**
   * 
   * @param IDtype $IDtype_SessionId
   * @param string $instanceName
   * @param string $linkTypeName
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName, $linkTypeName)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
    $this->linkTypeName = $linkTypeName;
  }

}
