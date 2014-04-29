<?php

class QueryHeader
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxQexpression $option4query
   * @access public
   */
  public $option4query;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxQexpression $option4query
   * @access public
   */
  public function __construct($SessionId, $option4query)
  {
    $this->SessionId = $SessionId;
    $this->option4query = $option4query;
  }

}
