<?php

class ModifyFilter
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var AbxFilter $filter
   * @access public
   */
  public $filter;

  /**
   * 
   * @param IDtype $SessionId
   * @param AbxFilter $filter
   * @access public
   */
  public function __construct($SessionId, $filter)
  {
    $this->SessionId = $SessionId;
    $this->filter = $filter;
  }

}
