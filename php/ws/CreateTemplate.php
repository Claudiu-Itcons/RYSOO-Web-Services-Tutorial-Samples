<?php

class CreateTemplate
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxTemplate $Template2Update
   * @access public
   */
  public $Template2Update;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxTemplate $Template2Update
   * @access public
   */
  public function __construct($SessionId, $Template2Update)
  {
    $this->SessionId = $SessionId;
    $this->Template2Update = $Template2Update;
  }

}
