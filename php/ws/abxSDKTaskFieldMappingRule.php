<?php

class abxSDKTaskFieldMappingRule
{

  /**
   * 
   * @var string $fieldMappingRuleId
   * @access public
   */
  public $fieldMappingRuleId;

  /**
   * 
   * @var string $ruleId
   * @access public
   */
  public $ruleId;

  /**
   * 
   * @var string $ruleName
   * @access public
   */
  public $ruleName;

  /**
   * 
   * @var string $parametersXML
   * @access public
   */
  public $parametersXML;

  /**
   * 
   * @param string $fieldMappingRuleId
   * @param string $ruleId
   * @param string $ruleName
   * @param string $parametersXML
   * @access public
   */
  public function __construct($fieldMappingRuleId, $ruleId, $ruleName, $parametersXML)
  {
    $this->fieldMappingRuleId = $fieldMappingRuleId;
    $this->ruleId = $ruleId;
    $this->ruleName = $ruleName;
    $this->parametersXML = $parametersXML;
  }

}
