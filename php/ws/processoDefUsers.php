<?php

class processoDefUsers
{

  /**
   * 
   * @var string $idTable
   * @access public
   */
  public $idTable;

  /**
   * 
   * @var string $idPacchetto
   * @access public
   */
  public $idPacchetto;

  /**
   * 
   * @var string $idProcesso
   * @access public
   */
  public $idProcesso;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $nomePacchetto
   * @access public
   */
  public $nomePacchetto;

  /**
   * 
   * @var string $nomeProcesso
   * @access public
   */
  public $nomeProcesso;

  /**
   * 
   * @var string $username
   * @access public
   */
  public $username;

  /**
   * 
   * @param string $idTable
   * @param string $idPacchetto
   * @param string $idProcesso
   * @param string $instanceName
   * @param string $nomePacchetto
   * @param string $nomeProcesso
   * @param string $username
   * @access public
   */
  public function __construct($idTable, $idPacchetto, $idProcesso, $instanceName, $nomePacchetto, $nomeProcesso, $username)
  {
    $this->idTable = $idTable;
    $this->idPacchetto = $idPacchetto;
    $this->idProcesso = $idProcesso;
    $this->instanceName = $instanceName;
    $this->nomePacchetto = $nomePacchetto;
    $this->nomeProcesso = $nomeProcesso;
    $this->username = $username;
  }

}
