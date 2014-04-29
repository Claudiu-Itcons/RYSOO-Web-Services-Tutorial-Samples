<?php

class CheckOut_attachContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $ObjName
   * @access public
   */
  public $ObjName;

  /**
   * 
   * @var string $Path
   * @access public
   */
  public $Path;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $ObjName
   * @param string $Path
   * @access public
   */
  public function __construct($SessionId, $ObjName, $Path)
  {
    $this->SessionId = $SessionId;
    $this->ObjName = $ObjName;
    $this->Path = $Path;
  }

}
