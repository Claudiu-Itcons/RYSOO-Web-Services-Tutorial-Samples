<?php

class abxQtemplate
{

  /**
   * 
   * @var string $templateName
   * @access public
   */
  public $templateName;

  /**
   * 
   * @var abxQFieldList $fields
   * @access public
   */
  public $fields;

  /**
   * 
   * @param string $templateName
   * @param abxQFieldList $fields
   * @access public
   */
  public function __construct($templateName, $fields)
  {
    $this->templateName = $templateName;
    $this->fields = $fields;
  }

}
