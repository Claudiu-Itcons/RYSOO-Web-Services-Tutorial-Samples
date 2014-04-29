<?php

class sortFieldList
{

  /**
   * 
   * @var string $fieldName
   * @access public
   */
  public $fieldName;

  /**
   * 
   * @var boolean $isDataId
   * @access public
   */
  public $isDataId;

  /**
   * 
   * @var string $sortOrder
   * @access public
   */
  public $sortOrder;

  /**
   * 
   * @param string $fieldName
   * @param boolean $isDataId
   * @param string $sortOrder
   * @access public
   */
  public function __construct($fieldName, $isDataId, $sortOrder)
  {
    $this->fieldName = $fieldName;
    $this->isDataId = $isDataId;
    $this->sortOrder = $sortOrder;
  }

}
