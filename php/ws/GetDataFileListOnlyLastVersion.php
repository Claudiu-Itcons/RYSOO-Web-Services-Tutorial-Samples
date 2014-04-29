<?php

class GetDataFileListOnlyLastVersion
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
   * @var boolean $getLinkedFiles
   * @access public
   */
  public $getLinkedFiles;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataId
   * @param boolean $getLinkedFiles
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataId, $getLinkedFiles)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->getLinkedFiles = $getLinkedFiles;
  }

}
