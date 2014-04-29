<?php

class ModifyRaccoglitore
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxTemplate $Template2Update
   * @access public
   */
  public $Template2Update;

  /**
   * 
   * @var abxContainer $Container2Update
   * @access public
   */
  public $Container2Update;

  /**
   * 
   * @var abxDynamicorgRuleList $DynorgParam
   * @access public
   */
  public $DynorgParam;

  /**
   * 
   * @var string $abxSecurityId
   * @access public
   */
  public $abxSecurityId;

  /**
   * 
   * @var abxExpression $expr
   * @access public
   */
  public $expr;

  /**
   * 
   * @var abxReplicationList $replicationList
   * @access public
   */
  public $replicationList;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxTemplate $Template2Update
   * @param abxContainer $Container2Update
   * @param abxDynamicorgRuleList $DynorgParam
   * @param string $abxSecurityId
   * @param abxExpression $expr
   * @param abxReplicationList $replicationList
   * @access public
   */
  public function __construct($SessionId, $Template2Update, $Container2Update, $DynorgParam, $abxSecurityId, $expr, $replicationList)
  {
    $this->SessionId = $SessionId;
    $this->Template2Update = $Template2Update;
    $this->Container2Update = $Container2Update;
    $this->DynorgParam = $DynorgParam;
    $this->abxSecurityId = $abxSecurityId;
    $this->expr = $expr;
    $this->replicationList = $replicationList;
  }

}
