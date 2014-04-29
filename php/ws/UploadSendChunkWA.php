<?php

class UploadSendChunkWA
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $fileCode
   * @access public
   */
  public $fileCode;

  /**
   * 
   * @var base64Binary $chunk
   * @access public
   */
  public $chunk;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fileCode
   * @param base64Binary $chunk
   * @access public
   */
  public function __construct($SessionId, $fileCode, $chunk)
  {
    $this->SessionId = $SessionId;
    $this->fileCode = $fileCode;
    $this->chunk = $chunk;
  }

}
