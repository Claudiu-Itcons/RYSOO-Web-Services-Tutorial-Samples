<?php

class DownloadFileContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $containerAttachmentId
   * @access public
   */
  public $containerAttachmentId;

  /**
   * 
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $containerAttachmentId
   * @param string $dChunk
   * @access public
   */
  public function __construct($SessionId, $containerAttachmentId, $dChunk)
  {
    $this->SessionId = $SessionId;
    $this->containerAttachmentId = $containerAttachmentId;
    $this->dChunk = $dChunk;
  }

}
