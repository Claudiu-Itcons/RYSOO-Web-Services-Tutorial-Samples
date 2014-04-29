<?php

class permissionSingleList
{

  /**
   * 
   * @var string $positionId
   * @access public
   */
  public $positionId;

  /**
   * 
   * @var string $value
   * @access public
   */
  public $value;

  /**
   * 
   * @param string $positionId
   * @param string $value
   * @access public
   */
  public function __construct($positionId, $value)
  {
    $this->positionId = $positionId;
    $this->value = $value;
  }

}
