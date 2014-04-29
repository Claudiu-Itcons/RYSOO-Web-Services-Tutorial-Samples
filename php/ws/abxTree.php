<?php

class abxTree
{

  /**
   * 
   * @var abxTreeParam $queryParam
   * @access public
   */
  public $queryParam;

  /**
   * 
   * @var abxTreeElement $tree
   * @access public
   */
  public $tree;

  /**
   * 
   * @param abxTreeParam $queryParam
   * @param abxTreeElement $tree
   * @access public
   */
  public function __construct($queryParam, $tree)
  {
    $this->queryParam = $queryParam;
    $this->tree = $tree;
  }

}
