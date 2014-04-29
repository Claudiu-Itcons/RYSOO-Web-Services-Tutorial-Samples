<?php

class ModifyDataWA
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
   * @var string $annotazione
   * @access public
   */
  public $annotazione;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $annotazioneId
   * @param string $annotazione
   * @access public
   */
  public function __construct($SessionId, $instanceName, $annotazioneId, $annotazione)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->annotazioneId = $annotazioneId;
    $this->annotazione = $annotazione;
  }

}
