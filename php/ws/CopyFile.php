<?php

class CopyFile
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $instanceNameSource
   * @access public
   */
  public $instanceNameSource;

  /**
   * 
   * @var string $dataIdSource
   * @access public
   */
  public $dataIdSource;

  /**
   * 
   * @var abxFile $file
   * @access public
   */
  public $file;

  /**
   * 
   * @var string $instanceNameDest
   * @access public
   */
  public $instanceNameDest;

  /**
   * 
   * @var string $dataIdDest
   * @access public
   */
  public $dataIdDest;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceNameSource
   * @param string $dataIdSource
   * @param abxFile $file
   * @param string $instanceNameDest
   * @param string $dataIdDest
   * @access public
   */
  public function __construct($SessionId, $instanceNameSource, $dataIdSource, $file, $instanceNameDest, $dataIdDest)
  {
    $this->SessionId = $SessionId;
    $this->instanceNameSource = $instanceNameSource;
    $this->dataIdSource = $dataIdSource;
    $this->file = $file;
    $this->instanceNameDest = $instanceNameDest;
    $this->dataIdDest = $dataIdDest;
  }

}
