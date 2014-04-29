<?php

class DownloadUSFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $attachmentId
   * @access public
   */
  public $attachmentId;

  /**
   * 
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $attachmentId
   * @param string $dChunk
   * @access public
   */
  public function __construct($SessionId, $attachmentId, $dChunk)
  {
    $this->SessionId = $SessionId;
    $this->attachmentId = $attachmentId;
    $this->dChunk = $dChunk;
  }

}
