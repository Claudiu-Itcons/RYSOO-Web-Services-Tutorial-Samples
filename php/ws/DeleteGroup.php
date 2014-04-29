<?php

class DeleteGroup
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $name
   * @access public
   */
  public function __construct($SessionId, $name)
  {
    $this->SessionId = $SessionId;
    $this->name = $name;
  }

}
