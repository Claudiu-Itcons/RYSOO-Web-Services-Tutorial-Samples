<?php

class GetTranslationByRangeLabelCode
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $exLabelCodeFrom
   * @access public
   */
  public $exLabelCodeFrom;

  /**
   * 
   * @var string $exLabelCodeTo
   * @access public
   */
  public $exLabelCodeTo;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $exLabelCodeFrom
   * @param string $exLabelCodeTo
   * @access public
   */
  public function __construct($SessionId, $exLabelCodeFrom, $exLabelCodeTo)
  {
    $this->SessionId = $SessionId;
    $this->exLabelCodeFrom = $exLabelCodeFrom;
    $this->exLabelCodeTo = $exLabelCodeTo;
  }

}
