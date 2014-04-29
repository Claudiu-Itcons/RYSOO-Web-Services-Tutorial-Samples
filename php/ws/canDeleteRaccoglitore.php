<?php

class canDeleteRaccoglitore
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $TemplateName
   * @access public
   */
  public $TemplateName;

  /**
   * 
   * @var string $ContainerName
   * @access public
   */
  public $ContainerName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $TemplateName
   * @param string $ContainerName
   * @access public
   */
  public function __construct($SessionId, $TemplateName, $ContainerName)
  {
    $this->SessionId = $SessionId;
    $this->TemplateName = $TemplateName;
    $this->ContainerName = $ContainerName;
  }

}
