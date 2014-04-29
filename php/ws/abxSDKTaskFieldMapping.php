<?php

class abxSDKTaskFieldMapping
{

  /**
   * 
   * @var string $fieldMappingId
   * @access public
   */
  public $fieldMappingId;

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var string $previewXML
   * @access public
   */
  public $previewXML;

  /**
   * 
   * @var abxSDKTaskFieldMappingRule $fieldMappingRules
   * @access public
   */
  public $fieldMappingRules;

  /**
   * 
   * @param string $fieldMappingId
   * @param string $fieldName
   * @param string $previewXML
   * @param abxSDKTaskFieldMappingRule $fieldMappingRules
   * @access public
   */
  public function __construct($fieldMappingId, $fieldName, $previewXML, $fieldMappingRules)
  {
    $this->fieldMappingId = $fieldMappingId;
    $this->fieldName = $fieldName;
    $this->previewXML = $previewXML;
    $this->fieldMappingRules = $fieldMappingRules;
  }

}
