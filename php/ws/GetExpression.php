<?php

class GetExpression
{

  /**
   * 
   * @var IDtype $SessionId
   * @access public
   */
  public $SessionId;

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
   * @param string $instanceName
   * @param string $expressionName
   * @access public
   */
  public function __construct($SessionId, $instanceName, $expressionName)
  {
    $this->SessionId = $SessionId;
    $this->instanceName = $instanceName;
    $this->expressionName = $expressionName;
  }

}
