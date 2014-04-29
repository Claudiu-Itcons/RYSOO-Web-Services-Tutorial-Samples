<?php

class abxExpressionList
{

  /**
   * 
   * @var abxExpression $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxExpression $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
