<?php

class abxFkArchiboxUtenti
{

  /**
   * 
   * @var string $groupIndex
   * @access public
   */
  public $groupIndex;

  /**
   * 
   * @var string $groupDesc
   * @access public
   */
  public $groupDesc;

  /**
   * 
   * @var string $userIndex
   * @access public
   */
  public $userIndex;

  /**
   * 
   * @var string $userDesc
   * @access public
   */
  public $userDesc;

  /**
   * 
   * @var string $groupIndexValue
   * @access public
   */
  public $groupIndexValue;

  /**
   * 
   * @var string $groupDescValue
   * @access public
   */
  public $groupDescValue;

  /**
   * 
   * @var string $userIndexValue
   * @access public
   */
  public $userIndexValue;

  /**
   * 
   * @var string $userDescValue
   * @access public
   */
  public $userDescValue;

  /**
   * 
   * @var abxRmFieldList $localFields
   * @access public
   */
  public $localFields;

  /**
   * 
   * @var abxFKUtentiRecord $recordList
   * @access public
   */
  public $recordList;

  /**
   * 
   * @var string $count
   * @access public
   */
  public $count;

  /**
   * 
   * @var abxMultiFKList $multiFKList
   * @access public
   */
  public $multiFKList;

  /**
   * 
   * @param string $groupIndex
   * @param string $groupDesc
   * @param string $userIndex
   * @param string $userDesc
   * @param string $groupIndexValue
   * @param string $groupDescValue
   * @param string $userIndexValue
   * @param string $userDescValue
   * @param abxRmFieldList $localFields
   * @param abxFKUtentiRecord $recordList
   * @param string $count
   * @param abxMultiFKList $multiFKList
   * @access public
   */
  public function __construct($groupIndex, $groupDesc, $userIndex, $userDesc, $groupIndexValue, $groupDescValue, $userIndexValue, $userDescValue, $localFields, $recordList, $count, $multiFKList)
  {
    $this->groupIndex = $groupIndex;
    $this->groupDesc = $groupDesc;
    $this->userIndex = $userIndex;
    $this->userDesc = $userDesc;
    $this->groupIndexValue = $groupIndexValue;
    $this->groupDescValue = $groupDescValue;
    $this->userIndexValue = $userIndexValue;
    $this->userDescValue = $userDescValue;
    $this->localFields = $localFields;
    $this->recordList = $recordList;
    $this->count = $count;
    $this->multiFKList = $multiFKList;
  }

}
