<?php

class DeleteSDKLog
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxLog $al
   * @access public
   */
  public $al;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxLog $al
   * @access public
   */
  public function __construct($SessionId, $al)
  {
    $this->SessionId = $SessionId;
    $this->al = $al;
  }

}
