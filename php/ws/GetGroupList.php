<?php

class GetGroupList
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxGroup $groupField
   * @access public
   */
  public $groupField;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxGroup $groupField
   * @access public
   */
  public function __construct($SessionId, $groupField)
  {
    $this->SessionId = $SessionId;
    $this->groupField = $groupField;
  }

}
