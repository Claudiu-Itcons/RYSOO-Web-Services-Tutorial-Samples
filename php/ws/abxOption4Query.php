<?php

class abxOption4Query
{

  /**
   * 
   * @var string $rootContainerName
   * @access public
   */
  public $rootContainerName;

  /**
   * 
   * @var int $deepLevel
   * @access public
   */
  public $deepLevel;

  /**
   * 
   * @var fieldList $fieldList
   * @access public
   */
  public $fieldList;

  /**
   * 
   * @var string $selectOption
   * @access public
   */
  public $selectOption;

  /**
   * 
   * @var string $masterID
   * @access public
   */
  public $masterID;

  /**
   * 
   * @var sortFieldList $sortFieldList
   * @access public
   */
  public $sortFieldList;

  /**
   * 
   * @param string $rootContainerName
   * @param int $deepLevel
   * @param fieldList $fieldList
   * @param string $selectOption
   * @param string $masterID
   * @param sortFieldList $sortFieldList
   * @access public
   */
  public function __construct($rootContainerName, $deepLevel, $fieldList, $selectOption, $masterID, $sortFieldList)
  {
    $this->rootContainerName = $rootContainerName;
    $this->deepLevel = $deepLevel;
    $this->fieldList = $fieldList;
    $this->selectOption = $selectOption;
    $this->masterID = $masterID;
    $this->sortFieldList = $sortFieldList;
  }

}
