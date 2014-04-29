<?php

class abxRmViewList
{

  /**
   * 
   * @var string $viewName
   * @access public
   */
  public $viewName;

  /**
   * 
   * @param string $viewName
   * @access public
   */
  public function __construct($viewName)
  {
    $this->viewName = $viewName;
  }

}
