<?php

class RegenerateDynOrg
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxDynamicorgRuleList $DynorgParam
   * @access public
   */
  public $DynorgParam;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxDynamicorgRuleList $DynorgParam
   * @access public
   */
  public function __construct($SessionId, $DynorgParam)
  {
    $this->SessionId = $SessionId;
    $this->DynorgParam = $DynorgParam;
  }

}
