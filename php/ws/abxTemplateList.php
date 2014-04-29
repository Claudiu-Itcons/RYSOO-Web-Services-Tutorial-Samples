<?php

class abxTemplateList
{

  /**
   * 
   * @var abxTemplate $template
   * @access public
   */
  public $template;

  /**
   * 
   * @param abxTemplate $template
   * @access public
   */
  public function __construct($template)
  {
    $this->template = $template;
  }

}
