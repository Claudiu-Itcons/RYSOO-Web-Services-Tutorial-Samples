<?php

class DeleteWFFileById
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $fileId
   * @access public
   */
  public $fileId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $fileId
   * @access public
   */
  public function __construct($SessionId, $fileId)
  {
    $this->SessionId = $SessionId;
    $this->fileId = $fileId;
  }

}
