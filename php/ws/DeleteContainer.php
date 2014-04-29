<?php

class DeleteContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $ContainerName
   * @access public
   */
  public $ContainerName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $ContainerName
   * @access public
   */
  public function __construct($SessionId, $ContainerName)
  {
    $this->SessionId = $SessionId;
    $this->ContainerName = $ContainerName;
  }

}
