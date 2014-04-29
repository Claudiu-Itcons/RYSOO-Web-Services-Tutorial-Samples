<?php

class abxSDKVariableList
{

  /**
   * 
   * @var abxSDKVariable $variables
   * @access public
   */
  public $variables;

  /**
   * 
   * @param abxSDKVariable $variables
   * @access public
   */
  public function __construct($variables)
  {
    $this->variables = $variables;
  }

}
