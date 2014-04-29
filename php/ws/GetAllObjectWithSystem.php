<?php

class GetAllObjectWithSystem
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @param IDtype $SessionId
   * @access public
   */
  public function __construct($SessionId)
  {
    $this->SessionId = $SessionId;
  }

}
