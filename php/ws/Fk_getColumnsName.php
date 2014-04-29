<?php

class Fk_getColumnsName
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxFK $fk
   * @access public
   */
  public $fk;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxFK $fk
   * @access public
   */
  public function __construct($SessionId, $fk)
  {
    $this->SessionId = $SessionId;
    $this->fk = $fk;
  }

}
