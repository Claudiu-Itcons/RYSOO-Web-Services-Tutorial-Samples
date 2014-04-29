<?php

class GetInstancePathname
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $HexInstanceId
   * @access public
   */
  public $HexInstanceId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $HexInstanceId
   * @access public
   */
  public function __construct($SessionId, $HexInstanceId)
  {
    $this->SessionId = $SessionId;
    $this->HexInstanceId = $HexInstanceId;
  }

}
