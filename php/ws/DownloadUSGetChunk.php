<?php

class DownloadUSGetChunk
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
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @var string $oset
   * @access public
   */
  public $oset;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fileCode
   * @param string $dChunk
   * @param string $oset
   * @access public
   */
  public function __construct($SessionId, $fileCode, $dChunk, $oset)
  {
    $this->SessionId = $SessionId;
    $this->fileCode = $fileCode;
    $this->dChunk = $dChunk;
    $this->oset = $oset;
  }

}
