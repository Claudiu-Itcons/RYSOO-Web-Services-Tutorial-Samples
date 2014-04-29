<?php

class VerifyExpression
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxExpression $expr
   * @access public
   */
  public $expr;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxExpression $expr
   * @access public
   */
  public function __construct($SessionId, $expr)
  {
    $this->SessionId = $SessionId;
    $this->expr = $expr;
  }

}
