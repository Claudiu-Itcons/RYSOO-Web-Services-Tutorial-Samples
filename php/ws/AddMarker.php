<?php

class AddMarker
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $marker
   * @access public
   */
  public $marker;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $marker
   * @access public
   */
  public function __construct($SessionId, $marker)
  {
    $this->SessionId = $SessionId;
    $this->marker = $marker;
  }

}
