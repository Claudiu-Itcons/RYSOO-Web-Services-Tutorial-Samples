<?php

class canModifyTemplate
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $Template2Update
   * @access public
   */
  public $Template2Update;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $Template2Update
   * @access public
   */
  public function __construct($SessionId, $Template2Update)
  {
    $this->SessionId = $SessionId;
    $this->Template2Update = $Template2Update;
  }

}
