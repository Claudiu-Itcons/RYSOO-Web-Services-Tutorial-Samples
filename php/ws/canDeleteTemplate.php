<?php

class canDeleteTemplate
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
   * @param IDtype $SessionId
   * @param string $TemplateName
   * @access public
   */
  public function __construct($SessionId, $TemplateName)
  {
    $this->SessionId = $SessionId;
    $this->TemplateName = $TemplateName;
  }

}
