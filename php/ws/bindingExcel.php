<?php

class bindingExcel
{

  /**
   * 
   * @var string $ContainerField
   * @access public
   */
  public $ContainerField;

  /**
   * 
   * @var boolean $UserField
   * @access public
   */
  public $UserField;

  /**
   * 
   * @var string $DescriptionField
   * @access public
   */
  public $DescriptionField;

  /**
   * 
   * @var int $Column
   * @access public
   */
  public $Column;

  /**
   * 
   * @var int $Row
   * @access public
   */
  public $Row;

  /**
   * 
   * @var int $Sheet
   * @access public
   */
  public $Sheet;

  /**
   * 
   * @param string $ContainerField
   * @param boolean $UserField
   * @param string $DescriptionField
   * @param int $Column
   * @param int $Row
   * @param int $Sheet
   * @access public
   */
  public function __construct($ContainerField, $UserField, $DescriptionField, $Column, $Row, $Sheet)
  {
    $this->ContainerField = $ContainerField;
    $this->UserField = $UserField;
    $this->DescriptionField = $DescriptionField;
    $this->Column = $Column;
    $this->Row = $Row;
    $this->Sheet = $Sheet;
  }

}
