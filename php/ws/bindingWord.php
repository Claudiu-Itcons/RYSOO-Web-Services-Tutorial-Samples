<?php

class bindingWord
{

  /**
   * 
   * @var string $ContainerField
   * @access public
   */
  public $ContainerField;

  /**
   * 
   * @var string $DocumentField
   * @access public
   */
  public $DocumentField;

  /**
   * 
   * @var string $DocumentFieldType
   * @access public
   */
  public $DocumentFieldType;

  /**
   * 
   * @var boolean $UserField
   * @access public
   */
  public $UserField;

  /**
   * 
   * @param string $ContainerField
   * @param string $DocumentField
   * @param string $DocumentFieldType
   * @param boolean $UserField
   * @access public
   */
  public function __construct($ContainerField, $DocumentField, $DocumentFieldType, $UserField)
  {
    $this->ContainerField = $ContainerField;
    $this->DocumentField = $DocumentField;
    $this->DocumentFieldType = $DocumentFieldType;
    $this->UserField = $UserField;
  }

}
