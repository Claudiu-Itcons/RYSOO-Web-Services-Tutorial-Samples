<?php

class InsertUSFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFileList $dataListInput
   * @access public
   */
  public $dataListInput;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFileList $dataListInput
   * @access public
   */
  public function __construct($SessionId, $dataListInput)
  {
    $this->SessionId = $SessionId;
    $this->dataListInput = $dataListInput;
  }

}
