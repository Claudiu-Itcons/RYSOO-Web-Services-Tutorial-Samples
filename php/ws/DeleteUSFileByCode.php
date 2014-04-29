<?php

class DeleteUSFileByCode
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
   * @param IDtype $SessionId
   * @param string $fileCode
   * @access public
   */
  public function __construct($SessionId, $fileCode)
  {
    $this->SessionId = $SessionId;
    $this->fileCode = $fileCode;
  }

}
