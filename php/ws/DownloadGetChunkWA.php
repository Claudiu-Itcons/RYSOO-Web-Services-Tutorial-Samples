<?php

class DownloadGetChunkWA
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
   * @var string $dimChunk
   * @access public
   */
  public $dimChunk;

  /**
   * 
   * @var string $offset
   * @access public
   */
  public $offset;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fileCode
   * @param string $dimChunk
   * @param string $offset
   * @access public
   */
  public function __construct($SessionId, $fileCode, $dimChunk, $offset)
  {
    $this->SessionId = $SessionId;
    $this->fileCode = $fileCode;
    $this->dimChunk = $dimChunk;
    $this->offset = $offset;
  }

}
