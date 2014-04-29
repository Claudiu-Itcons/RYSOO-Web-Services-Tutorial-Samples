<?php

class InsertFileWA
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $annotazioneId
   * @access public
   */
  public $annotazioneId;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var abxFileList $dataListInput
   * @access public
   */
  public $dataListInput;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $annotazioneId
   * @param string $objName
   * @param abxFileList $dataListInput
   * @access public
   */
  public function __construct($SessionId, $instanceName, $annotazioneId, $objName, $dataListInput)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->annotazioneId = $annotazioneId;
    $this->objName = $objName;
    $this->dataListInput = $dataListInput;
  }

}
