<?php

class ModUserSettings
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxWorkflow $aw
   * @access public
   */
  public $aw;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxWorkflow $aw
   * @access public
   */
  public function __construct($SessionId, $aw)
  {
    $this->SessionId = $SessionId;
    $this->aw = $aw;
  }

}
