<?php

class GetDataFileDetail
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $dataAttachmentId
   * @access public
   */
  public $dataAttachmentId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $objName
   * @param string $instanceName
   * @param string $dataAttachmentId
   * @access public
   */
  public function __construct($SessionId, $objName, $instanceName, $dataAttachmentId)
  {
    $this->SessionId = $SessionId;
    $this->objName = $objName;
    $this->instanceName = $instanceName;
    $this->dataAttachmentId = $dataAttachmentId;
  }

}
