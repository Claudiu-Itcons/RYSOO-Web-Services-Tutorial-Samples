<?php

class QueryTotAttach
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
   * @var abxProtocolUse $protuse
   * @access public
   */
  public $protuse;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxQexpression $option4query
   * @param abxProtocolUse $protuse
   * @access public
   */
  public function __construct($SessionId, $option4query, $protuse)
  {
    $this->SessionId = $SessionId;
    $this->option4query = $option4query;
    $this->protuse = $protuse;
  }

}
