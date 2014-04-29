<?php

class abxQnode
{

  /**
   * 
   * @var string $qOperator
   * @access public
   */
  public $qOperator;

  /**
   * 
   * @var abxQnode $operandSX
   * @access public
   */
  public $operandSX;

  /**
   * 
   * @var abxQnode $operandDX
   * @access public
   */
  public $operandDX;

  /**
   * 
   * @var abxQField $field
   * @access public
   */
  public $field;

  /**
   * 
   * @param string $qOperator
   * @param abxQnode $operandSX
   * @param abxQnode $operandDX
   * @param abxQField $field
   * @access public
   */
  public function __construct($qOperator, $operandSX, $operandDX, $field)
  {
    $this->qOperator = $qOperator;
    $this->operandSX = $operandSX;
    $this->operandDX = $operandDX;
    $this->field = $field;
  }

}
