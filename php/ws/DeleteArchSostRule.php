<?php

class DeleteArchSostRule
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $ruleId
   * @access public
   */
  public $ruleId;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $ruleId
   * @access public
   */
  public function __construct($SessionId, $ruleId)
  {
    $this->SessionId = $SessionId;
    $this->ruleId = $ruleId;
  }

}
