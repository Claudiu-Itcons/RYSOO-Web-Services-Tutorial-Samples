<?php

class abxQexpression
{

  /**
   * 
   * @var abxQnode $expression
   * @access public
   */
  public $expression;

  /**
   * 
   * @var abxOption4Query $option4Query
   * @access public
   */
  public $option4Query;

  /**
   * 
   * @var string $queryType
   * @access public
   */
  public $queryType;

  /**
   * 
   * @var string $queryTypeDetail
   * @access public
   */
  public $queryTypeDetail;

  /**
   * 
   * @var string $queryLimit
   * @access public
   */
  public $queryLimit;

  /**
   * 
   * @var string $queryOffset
   * @access public
   */
  public $queryOffset;

  /**
   * 
   * @param abxQnode $expression
   * @param abxOption4Query $option4Query
   * @param string $queryType
   * @param string $queryTypeDetail
   * @param string $queryLimit
   * @param string $queryOffset
   * @access public
   */
  public function __construct($expression, $option4Query, $queryType, $queryTypeDetail, $queryLimit, $queryOffset)
  {
    $this->expression = $expression;
    $this->option4Query = $option4Query;
    $this->queryType = $queryType;
    $this->queryTypeDetail = $queryTypeDetail;
    $this->queryLimit = $queryLimit;
    $this->queryOffset = $queryOffset;
  }

}
