<?php

class GetExpressionValue
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

  /**
   * 
   * @var string $dataid
   * @access public
   */
  public $dataid;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $expressionName
   * @access public
   */
  public $expressionName;

  /**
   * 
   * @param IDtype $SessionId
   * @param string $dataid
   * @param string $instanceName
   * @param string $expressionName
   * @access public
   */
  public function __construct($SessionId, $dataid, $instanceName, $expressionName)
  {
    $this->SessionId = $SessionId;
    $this->dataid = $dataid;
    $this->instanceName = $instanceName;
    $this->expressionName = $expressionName;
  }

}
