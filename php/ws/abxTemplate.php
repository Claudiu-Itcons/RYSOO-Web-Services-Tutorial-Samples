<?php

class abxTemplate
{

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $defaultLanguage
   * @access public
   */
  public $defaultLanguage;

  /**
   * 
   * @var string $Description
   * @access public
   */
  public $Description;

  /**
   * 
   * @var allDescription $allDescription
   * @access public
   */
  public $allDescription;

  /**
   * 
   * @var string $joinWithType
   * @access public
   */
  public $joinWithType;

  /**
   * 
   * @var abxFieldList $fields
   * @access public
   */
  public $fields;

  /**
   * 
   * @var string $joinWithName
   * @access public
   */
  public $joinWithName;

  /**
   * 
   * @var boolean $revisionEnabled
   * @access public
   */
  public $revisionEnabled;

  /**
   * 
   * @var string $collation
   * @access public
   */
  public $collation;

  /**
   * 
   * @var abxExpressionList $expression
   * @access public
   */
  public $expression;

  /**
   * 
   * @var string $barcodePrefix
   * @access public
   */
  public $barcodePrefix;

  /**
   * 
   * @var boolean $enableProtocol
   * @access public
   */
  public $enableProtocol;

  /**
   * 
   * @var abxPermission $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @var string $objName
   * @access public
   */
  public $objName;

  /**
   * 
   * @var boolean $dynorgEnabled
   * @access public
   */
  public $dynorgEnabled;

  /**
   * 
   * @param string $name
   * @param string $defaultLanguage
   * @param string $Description
   * @param allDescription $allDescription
   * @param string $joinWithType
   * @param abxFieldList $fields
   * @param string $joinWithName
   * @param boolean $revisionEnabled
   * @param string $collation
   * @param abxExpressionList $expression
   * @param string $barcodePrefix
   * @param boolean $enableProtocol
   * @param abxPermission $permission
   * @param string $objName
   * @param boolean $dynorgEnabled
   * @access public
   */
  public function __construct($name, $defaultLanguage, $Description, $allDescription, $joinWithType, $fields, $joinWithName, $revisionEnabled, $collation, $expression, $barcodePrefix, $enableProtocol, $permission, $objName, $dynorgEnabled)
  {
    $this->name = $name;
    $this->defaultLanguage = $defaultLanguage;
    $this->Description = $Description;
    $this->allDescription = $allDescription;
    $this->joinWithType = $joinWithType;
    $this->fields = $fields;
    $this->joinWithName = $joinWithName;
    $this->revisionEnabled = $revisionEnabled;
    $this->collation = $collation;
    $this->expression = $expression;
    $this->barcodePrefix = $barcodePrefix;
    $this->enableProtocol = $enableProtocol;
    $this->permission = $permission;
    $this->objName = $objName;
    $this->dynorgEnabled = $dynorgEnabled;
  }

}
