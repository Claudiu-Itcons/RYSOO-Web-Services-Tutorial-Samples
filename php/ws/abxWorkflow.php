<?php

class abxWorkflow
{

  /**
   * 
   * @var processoDefUsers $processoDefUsers
   * @access public
   */
  public $processoDefUsers;

  /**
   * 
   * @var signList $signList
   * @access public
   */
  public $signList;

  /**
   * 
   * @var userSettings $userSettings
   * @access public
   */
  public $userSettings;

  /**
   * 
   * @var variables $variables
   * @access public
   */
  public $variables;

  /**
   * 
   * @param processoDefUsers $processoDefUsers
   * @param signList $signList
   * @param userSettings $userSettings
   * @param variables $variables
   * @access public
   */
  public function __construct($processoDefUsers, $signList, $userSettings, $variables)
  {
    $this->processoDefUsers = $processoDefUsers;
    $this->signList = $signList;
    $this->userSettings = $userSettings;
    $this->variables = $variables;
  }

}
