<?php

class CreateContainer
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxContainer $Container2Update
   * @access public
   */
  public $Container2Update;

  /**
   * 
   * @var string $abxSecurityId
   * @access public
   */
  public $abxSecurityId;

  /**
   * 
   * @var abxVersioningList $avl
   * @access public
   */
  public $avl;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxContainer $Container2Update
   * @param string $abxSecurityId
   * @param abxVersioningList $avl
   * @access public
   */
  public function __construct($SessionId, $Container2Update, $abxSecurityId, $avl)
  {
    $this->SessionId = $SessionId;
    $this->Container2Update = $Container2Update;
    $this->abxSecurityId = $abxSecurityId;
    $this->avl = $avl;
  }

}
