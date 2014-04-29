<?php

class abxArchSostRule
{

  /**
   * 
   * @var abxArchSostRuleFilters $abxArchSostRuleFilters
   * @access public
   */
  public $abxArchSostRuleFilters;

  /**
   * 
   * @var abxArchSostRuleMap $abxArchSostRuleMap
   * @access public
   */
  public $abxArchSostRuleMap;

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var string $classeDocumentaleName
   * @access public
   */
  public $classeDocumentaleName;

  /**
   * 
   * @var boolean $getSignedFile
   * @access public
   */
  public $getSignedFile;

  /**
   * 
   * @var boolean $zipFile
   * @access public
   */
  public $zipFile;

  /**
   * 
   * @param abxArchSostRuleFilters $abxArchSostRuleFilters
   * @param abxArchSostRuleMap $abxArchSostRuleMap
   * @param string $id
   * @param string $name
   * @param string $instanceName
   * @param string $classeDocumentaleName
   * @param boolean $getSignedFile
   * @param boolean $zipFile
   * @access public
   */
  public function __construct($abxArchSostRuleFilters, $abxArchSostRuleMap, $id, $name, $instanceName, $classeDocumentaleName, $getSignedFile, $zipFile)
  {
    $this->abxArchSostRuleFilters = $abxArchSostRuleFilters;
    $this->abxArchSostRuleMap = $abxArchSostRuleMap;
    $this->id = $id;
    $this->name = $name;
    $this->instanceName = $instanceName;
    $this->classeDocumentaleName = $classeDocumentaleName;
    $this->getSignedFile = $getSignedFile;
    $this->zipFile = $zipFile;
  }

}
