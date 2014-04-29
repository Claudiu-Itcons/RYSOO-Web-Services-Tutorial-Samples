<?php

class GetArchiBoxInDomainByMatricolaResponse
{

  /**
   * 
   * @var abxArchiBoxDomainResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxArchiBoxDomainResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
