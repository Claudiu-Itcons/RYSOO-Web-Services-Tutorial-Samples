<?php

class GetDataFileListWA
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
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $annotazioneId
   * @access public
   */
  public function __construct($SessionId, $instanceName, $annotazioneId)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->annotazioneId = $annotazioneId;
  }

}
