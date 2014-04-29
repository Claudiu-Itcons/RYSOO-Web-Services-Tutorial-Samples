<?php

class GetArchiBoxInDomainByMatricola
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $matricola
   * @access public
   */
  public $matricola;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $matricola
   * @access public
   */
  public function __construct($SessionId, $matricola)
  {
    $this->SessionId = $SessionId;
    $this->matricola = $matricola;
  }

}
