<?php

class CopyData
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
   * @var string $instanceNameDest
   * @access public
   */
  public $instanceNameDest;

  /**
   * 
   * @var abxData $document
   * @access public
   */
  public $document;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $instanceNameDest
   * @param abxData $document
   * @access public
   */
  public function __construct($SessionId, $instanceName, $instanceNameDest, $document)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->instanceNameDest = $instanceNameDest;
    $this->document = $document;
  }

}
