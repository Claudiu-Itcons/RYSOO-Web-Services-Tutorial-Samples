<?php

class CheckOut_attach
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $InstanceName
   * @access public
   */
  public $InstanceName;

  /**
   * 
   * @var string $Path
   * @access public
   */
  public $Path;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $InstanceName
   * @param string $Path
   * @access public
   */
  public function __construct($SessionId, $InstanceName, $Path)
  {
    $this->SessionId = $SessionId;
    $this->InstanceName = $InstanceName;
    $this->Path = $Path;
  }

}
