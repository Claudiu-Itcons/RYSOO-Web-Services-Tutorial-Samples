<?php

class StoreSDKVariable
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $variableKey
   * @access public
   */
  public $variableKey;

  /**
   * 
   * @var string $variableValue
   * @access public
   */
  public $variableValue;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $variableKey
   * @param string $variableValue
   * @access public
   */
  public function __construct($SessionId, $variableKey, $variableValue)
  {
    $this->SessionId = $SessionId;
    $this->variableKey = $variableKey;
    $this->variableValue = $variableValue;
  }

}
