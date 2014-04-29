<?php

class UploadWFSendChunk
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
   * @var base64Binary $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fileCode
   * @param base64Binary $objName
   * @access public
   */
  public function __construct($SessionId, $fileCode, $objName)
  {
    $this->SessionId = $SessionId;
    $this->fileCode = $fileCode;
    $this->objName = $objName;
  }

}
