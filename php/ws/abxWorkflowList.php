<?php

class abxWorkflowList
{

  /**
   * 
   * @var abxWorkflow $workflowList
   * @access public
   */
  public $workflowList;

  /**
   * 
   * @param abxWorkflow $workflowList
   * @access public
   */
  public function __construct($workflowList)
  {
    $this->workflowList = $workflowList;
  }

}
