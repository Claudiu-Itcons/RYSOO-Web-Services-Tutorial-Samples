<?php

class abxExpression
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $instanceName
   * @access public
   */
  public $instanceName;

  /**
   * 
   * @var abxTranslation $translationList
   * @access public
   */
  public $translationList;

  /**
   * 
   * @var string $expressionName
   * @access public
   */
  public $expressionName;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $defaultExpression
   * @access public
   */
  public $defaultExpression;

  /**
   * 
   * @var returnWrongKeys $returnWrongKeys
   * @access public
   */
  public $returnWrongKeys;

  /**
   * 
   * @param string $id
   * @param string $instanceName
   * @param abxTranslation $translationList
   * @param string $expressionName
   * @param string $defaultLanguage
   * @param string $defaultExpression
   * @param returnWrongKeys $returnWrongKeys
   * @access public
   */
  public function __construct($id, $instanceName, $translationList, $expressionName, $defaultLanguage, $defaultExpression, $returnWrongKeys)
  {
    $this->id = $id;
    $this->instanceName = $instanceName;
    $this->translationList = $translationList;
    $this->expressionName = $expressionName;
    $this->defaultLanguage = $defaultLanguage;
    $this->defaultExpression = $defaultExpression;
    $this->returnWrongKeys = $returnWrongKeys;
  }

}
