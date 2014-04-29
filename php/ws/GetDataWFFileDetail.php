<?php

class GetDataWFFileDetail
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
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $objName
   * @param string $attachmentId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $objName, $attachmentId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->objName = $objName;
    $this->attachmentId = $attachmentId;
  }

}
