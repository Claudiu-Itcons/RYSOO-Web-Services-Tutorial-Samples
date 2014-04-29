<?php

class DeleteFilter
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var AbxFilterList $filters
   * @access public
   */
  public $filters;

  /**
   * 
   * @param IDtype $SessionId
   * @param AbxFilterList $filters
   * @access public
   */
  public function __construct($SessionId, $filters)
  {
    $this->SessionId = $SessionId;
    $this->filters = $filters;
  }

}
