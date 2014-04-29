<?php

class GetDataFileContainerDetail
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
   * @var string $contAttachmentId
   * @access public
   */
  public $contAttachmentId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $objName
   * @param string $instanceName
   * @param string $contAttachmentId
   * @access public
   */
  public function __construct($SessionId, $objName, $instanceName, $contAttachmentId)
  {
    $this->SessionId = $SessionId;
    $this->objName = $objName;
    $this->instanceName = $instanceName;
    $this->contAttachmentId = $contAttachmentId;
  }

}
