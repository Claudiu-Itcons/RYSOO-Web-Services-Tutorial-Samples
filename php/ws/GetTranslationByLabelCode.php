<?php

class GetTranslationByLabelCode
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $exLabelCode
   * @access public
   */
  public $exLabelCode;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $exLabelCode
   * @access public
   */
  public function __construct($SessionId, $exLabelCode)
  {
    $this->SessionId = $SessionId;
    $this->exLabelCode = $exLabelCode;
  }

}
