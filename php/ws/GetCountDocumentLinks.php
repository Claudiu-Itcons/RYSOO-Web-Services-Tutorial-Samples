<?php

class GetCountDocumentLinks
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
   * @var string $dataId
   * @access public
   */
  public $dataId;

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
   * @param string $dataId
   * @param string $linkTypeName
   * @access public
   */
  public function __construct($IDtype_SessionId, $instanceName, $dataId, $linkTypeName)
  {
    $this->IDtype_SessionId = $IDtype_SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->linkTypeName = $linkTypeName;
  }

}
