<?php

class abxFKDbRecord
{

  /**
   * 
   * @var abxFKDbField $fieldList
   * @access public
   */
  public $fieldList;

  /**
   * 
   * @var string $indexValue
   * @access public
   */
  public $indexValue;

  /**
   * 
   * @var string $descValue
   * @access public
   */
  public $descValue;

  /**
   * 
   * @var string $count
   * @access public
   */
  public $count;

  /**
   * 
   * @param abxFKDbField $fieldList
   * @param string $indexValue
   * @param string $descValue
   * @param string $count
   * @access public
   */
  public function __construct($fieldList, $indexValue, $descValue, $count)
  {
    $this->fieldList = $fieldList;
    $this->indexValue = $indexValue;
    $this->descValue = $descValue;
    $this->count = $count;
  }

}
