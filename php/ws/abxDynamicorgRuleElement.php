<?php

class abxDynamicorgRuleElement
{

  /**
   * 
   * @var string $ruleTypeName
   * @access public
   */
  public $ruleTypeName;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description;

  /**
   * 
   * @var int $orderId
   * @access public
   */
  public $orderId;

  /**
   * 
   * @var string $option
   * @access public
   */
  public $option;

  /**
   * 
   * @param string $ruleTypeName
   * @param string $Description
   * @param int $orderId
   * @param string $option
   * @access public
   */
  public function __construct($ruleTypeName, $Description, $orderId, $option)
  {
    $this->ruleTypeName = $ruleTypeName;
    $this->Description = $Description;
    $this->orderId = $orderId;
    $this->option = $option;
  }

}
