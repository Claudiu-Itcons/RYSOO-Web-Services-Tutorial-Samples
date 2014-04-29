<?php

class InsertUSFileWithUser
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
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFileList $dataListInput
   * @param string $username
   * @access public
   */
  public function __construct($SessionId, $dataListInput, $username)
  {
    $this->SessionId = $SessionId;
    $this->dataListInput = $dataListInput;
    $this->username = $username;
  }

}
