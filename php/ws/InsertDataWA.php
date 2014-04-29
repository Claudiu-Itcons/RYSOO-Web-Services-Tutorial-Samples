<?php

class InsertDataWA
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
   * @var string $annotazione
   * @access public
   */
  public $annotazione;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $instanceName
   * @param string $dataId
   * @param string $annotazione
   * @access public
   */
  public function __construct($SessionId, $instanceName, $dataId, $annotazione)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->dataId = $dataId;
    $this->annotazione = $annotazione;
  }

}
