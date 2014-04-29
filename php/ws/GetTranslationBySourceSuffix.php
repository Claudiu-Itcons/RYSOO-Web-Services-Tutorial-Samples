<?php

class GetTranslationBySourceSuffix
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $exSourceSuffix
   * @access public
   */
  public $exSourceSuffix;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $exSourceSuffix
   * @access public
   */
  public function __construct($SessionId, $exSourceSuffix)
  {
    $this->SessionId = $SessionId;
    $this->exSourceSuffix = $exSourceSuffix;
  }

}
