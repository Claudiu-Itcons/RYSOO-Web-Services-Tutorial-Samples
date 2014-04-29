<?php

class canModifyDynorg
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $RuleName
   * @access public
   */
  public $RuleName;

  /**
   * 
   * @var string $TemplateName
   * @access public
   */
  public $TemplateName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $RuleName
   * @param string $TemplateName
   * @access public
   */
  public function __construct($SessionId, $RuleName, $TemplateName)
  {
    $this->SessionId = $SessionId;
    $this->RuleName = $RuleName;
    $this->TemplateName = $TemplateName;
  }

}
