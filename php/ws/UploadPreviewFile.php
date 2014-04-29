<?php

class UploadPreviewFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var base64Binary $file
   * @access public
   */
  public $file;

  /**
   * 
   * @var string $fileName
   * @access public
   */
  public $fileName;

  /**
   * 
   * @param IDtype $SessionId
   * @param base64Binary $file
   * @param string $fileName
   * @access public
   */
  public function __construct($SessionId, $file, $fileName)
  {
    $this->SessionId = $SessionId;
    $this->file = $file;
    $this->fileName = $fileName;
  }

}
