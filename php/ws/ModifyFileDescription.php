<?php

class ModifyFileDescription
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
   * @var string $dataId
   * @access public
   */
  public $dataId;

  /**
   * 
   * @var abxFile $file
   * @access public
   */
  public $file;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataId
   * @param abxFile $file
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataId, $file)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->file = $file;
  }

}
