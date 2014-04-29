<?php

class DeleteClasseDocumentale
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $ClasseDocumentaleName
   * @access public
   */
  public $ClasseDocumentaleName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $ClasseDocumentaleName
   * @access public
   */
  public function __construct($SessionId, $ClasseDocumentaleName)
  {
    $this->SessionId = $SessionId;
    $this->ClasseDocumentaleName = $ClasseDocumentaleName;
  }

}
