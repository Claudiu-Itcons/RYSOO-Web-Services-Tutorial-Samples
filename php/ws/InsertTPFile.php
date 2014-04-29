<?php

class InsertTPFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFileTpList $dataListInput
   * @access public
   */
  public $dataListInput;

  /**
   * 
   * @var string $abxSecurityId
   * @access public
   */
  public $abxSecurityId;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFileTpList $dataListInput
   * @param string $abxSecurityId
   * @access public
   */
  public function __construct($SessionId, $dataListInput, $abxSecurityId)
  {
    $this->SessionId = $SessionId;
    $this->dataListInput = $dataListInput;
    $this->abxSecurityId = $abxSecurityId;
  }

}
