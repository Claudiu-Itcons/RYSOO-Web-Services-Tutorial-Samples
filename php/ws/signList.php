<?php

class signList
{

  /**
   * 
   * @var string $idTable
   * @access public
   */
  public $idTable;

  /**
   * 
   * @var string $userName
   * @access public
   */
  public $userName;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $tipologia
   * @access public
   */
  public $tipologia;

  /**
   * 
   * @var string $allineamento
   * @access public
   */
  public $allineamento;

  /**
   * 
   * @var string $marker
   * @access public
   */
  public $marker;

  /**
   * 
   * @var int $posX
   * @access public
   */
  public $posX;

  /**
   * 
   * @var int $posY
   * @access public
   */
  public $posY;

  /**
   * 
   * @param string $idTable
   * @param string $userName
   * @param string $instanceName
   * @param string $tipologia
   * @param string $allineamento
   * @param string $marker
   * @param int $posX
   * @param int $posY
   * @access public
   */
  public function __construct($idTable, $userName, $instanceName, $tipologia, $allineamento, $marker, $posX, $posY)
  {
    $this->idTable = $idTable;
    $this->userName = $userName;
    $this->instanceName = $instanceName;
    $this->tipologia = $tipologia;
    $this->allineamento = $allineamento;
    $this->marker = $marker;
    $this->posX = $posX;
    $this->posY = $posY;
  }

}
