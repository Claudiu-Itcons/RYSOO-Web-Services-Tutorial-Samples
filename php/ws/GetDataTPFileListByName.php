<?php

class GetDataTPFileListByName
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $templateName
   * @access public
   */
  public $templateName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $templateName
   * @access public
   */
  public function __construct($SessionId, $templateName)
  {
    $this->SessionId = $SessionId;
    $this->templateName = $templateName;
  }

}
