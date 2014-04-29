<?php

class ModifyArchSostRule
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxArchSostRule $archSostRule
   * @access public
   */
  public $archSostRule;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxArchSostRule $archSostRule
   * @access public
   */
  public function __construct($SessionId, $archSostRule)
  {
    $this->SessionId = $SessionId;
    $this->archSostRule = $archSostRule;
  }

}
