<?php

class IfFileExist
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $pathfilename
   * @access public
   */
  public $pathfilename;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $pathfilename
   * @access public
   */
  public function __construct($SessionId, $pathfilename)
  {
    $this->SessionId = $SessionId;
    $this->pathfilename = $pathfilename;
  }

}
