<?php

class abxFK
{

  /**
   * 
   * @var abxFkDb $fkDb
   * @access public
   */
  public $fkDb;

  /**
   * 
   * @var abxFkArchiboxRacc $fkArchiboxRacc
   * @access public
   */
  public $fkArchiboxRacc;

  /**
   * 
   * @var abxFkArchiboxUtenti $fkArchiboxUtenti
   * @access public
   */
  public $fkArchiboxUtenti;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @param abxFkDb $fkDb
   * @param abxFkArchiboxRacc $fkArchiboxRacc
   * @param abxFkArchiboxUtenti $fkArchiboxUtenti
   * @param string $name
   * @access public
   */
  public function __construct($fkDb, $fkArchiboxRacc, $fkArchiboxUtenti, $name)
  {
    $this->fkDb = $fkDb;
    $this->fkArchiboxRacc = $fkArchiboxRacc;
    $this->fkArchiboxUtenti = $fkArchiboxUtenti;
    $this->name = $name;
  }

}
