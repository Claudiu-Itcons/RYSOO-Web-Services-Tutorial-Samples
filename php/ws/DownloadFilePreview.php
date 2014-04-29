<?php

class DownloadFilePreview
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
   * @var string $dataAttachmentId
   * @access public
   */
  public $dataAttachmentId;

  /**
   * 
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @var int $previewType
   * @access public
   */
  public $previewType;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataAttachmentId
   * @param string $dChunk
   * @param int $previewType
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataAttachmentId, $dChunk, $previewType)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataAttachmentId = $dataAttachmentId;
    $this->dChunk = $dChunk;
    $this->previewType = $previewType;
  }

}
