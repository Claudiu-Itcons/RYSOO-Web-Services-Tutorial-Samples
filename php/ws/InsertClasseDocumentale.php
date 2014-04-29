<?php

class InsertClasseDocumentale
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var abxClasseDocumentale $classeDocumentale
   * @access public
   */
  public $classeDocumentale;

  /**
   * 
   * @param IDtype $SessionId
   * @param abxClasseDocumentale $classeDocumentale
   * @access public
   */
  public function __construct($SessionId, $classeDocumentale)
  {
    $this->SessionId = $SessionId;
    $this->classeDocumentale = $classeDocumentale;
  }

}
