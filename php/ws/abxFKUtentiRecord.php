<?php

class abxFKUtentiRecord
{

  /**
   * 
   * @var string $userGroupIdValue
   * @access public
   */
  public $userGroupIdValue;

  /**
   * 
   * @var abxFKUtentiField $fieldList
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
   * @param string $userGroupIdValue
   * @param abxFKUtentiField $fieldList
   * @param string $indexValue
   * @param string $descValue
   * @access public
   */
  public function __construct($userGroupIdValue, $fieldList, $indexValue, $descValue)
  {
    $this->userGroupIdValue = $userGroupIdValue;
    $this->fieldList = $fieldList;
    $this->indexValue = $indexValue;
    $this->descValue = $descValue;
  }

}
