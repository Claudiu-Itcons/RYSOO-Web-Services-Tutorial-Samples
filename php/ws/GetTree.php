<?php

class GetTree
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxTreeParam $param
   * @access public
   */
  public $param;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxTreeParam $param
   * @access public
   */
  public function __construct($SessionId, $param)
  {
    $this->SessionId = $SessionId;
    $this->param = $param;
  }

}
