<?php

class ModifyGroup
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxGroup $group
   * @access public
   */
  public $group;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxGroup $group
   * @access public
   */
  public function __construct($SessionId, $group)
  {
    $this->SessionId = $SessionId;
    $this->group = $group;
  }

}
