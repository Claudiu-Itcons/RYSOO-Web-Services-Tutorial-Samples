<?php

class GetDataUSFileDetail
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
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $attachmentId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $attachmentId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->attachmentId = $attachmentId;
  }

}
