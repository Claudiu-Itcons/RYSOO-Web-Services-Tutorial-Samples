<?php

class abxComboRecord
{

  /**
   * 
   * @var string $idRecord
   * @access public
   */
  public $idRecord;

  /**
   * 
   * @var string $fieldTypeId
   * @access public
   */
  public $fieldTypeId;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var boolean $default
   * @access public
   */
  public $default;

  /**
   * 
   * @param string $idRecord
   * @param string $fieldTypeId
   * @param string $description
   * @param boolean $default
   * @access public
   */
  public function __construct($idRecord, $fieldTypeId, $description, $default)
  {
    $this->idRecord = $idRecord;
    $this->fieldTypeId = $fieldTypeId;
    $this->description = $description;
    $this->default = $default;
  }

}
