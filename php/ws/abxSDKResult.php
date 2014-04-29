<?php

class abxSDKResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxSDKTaskList $listTask
   * @access public
   */
  public $listTask;

  /**
   * 
   * @var abxSDKRuleList $listRule
   * @access public
   */
  public $listRule;

  /**
   * 
   * @var abxSDKVariableList $listVariable
   * @access public
   */
  public $listVariable;

  /**
   * 
   * @var abxSDKWatchFolderDirectoryList $listWatchFolderDirectory
   * @access public
   */
  public $listWatchFolderDirectory;

  /**
   * 
   * @param int $result
   * @param abxSDKTaskList $listTask
   * @param abxSDKRuleList $listRule
   * @param abxSDKVariableList $listVariable
   * @param abxSDKWatchFolderDirectoryList $listWatchFolderDirectory
   * @access public
   */
  public function __construct($result, $listTask, $listRule, $listVariable, $listWatchFolderDirectory)
  {
    $this->result = $result;
    $this->listTask = $listTask;
    $this->listRule = $listRule;
    $this->listVariable = $listVariable;
    $this->listWatchFolderDirectory = $listWatchFolderDirectory;
  }

}
