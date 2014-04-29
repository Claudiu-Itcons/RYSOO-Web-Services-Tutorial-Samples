<?php

class DownloadFileContainerUnc
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $UNCPath
   * @access public
   */
  public $UNCPath;

  /**
   * 
   * @var string $dChunk
   * @access public
   */
  public $dChunk;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $UNCPath
   * @param string $dChunk
   * @access public
   */
  public function __construct($SessionId, $UNCPath, $dChunk)
  {
    $this->SessionId = $SessionId;
    $this->UNCPath = $UNCPath;
    $this->dChunk = $dChunk;
  }

}
