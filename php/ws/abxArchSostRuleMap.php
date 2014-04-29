<?php

class abxArchSostRuleMap
{

  /**
   * 
   * @var string $mapId
   * @access public
   */
  public $mapId;

  /**
   * 
   * @var string $ruleId
   * @access public
   */
  public $ruleId;

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var boolean $isProtocol
   * @access public
   */
  public $isProtocol;

  /**
   * 
   * @var string $metadataClasseDocumentaleName
   * @access public
   */
  public $metadataClasseDocumentaleName;

  /**
   * 
   * @param string $mapId
   * @param string $ruleId
   * @param string $fieldName
   * @param boolean $isProtocol
   * @param string $metadataClasseDocumentaleName
   * @access public
   */
  public function __construct($mapId, $ruleId, $fieldName, $isProtocol, $metadataClasseDocumentaleName)
  {
    $this->mapId = $mapId;
    $this->ruleId = $ruleId;
    $this->fieldName = $fieldName;
    $this->isProtocol = $isProtocol;
    $this->metadataClasseDocumentaleName = $metadataClasseDocumentaleName;
  }

}
