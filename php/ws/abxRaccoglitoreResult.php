<?php

class abxRaccoglitoreResult
{

  /**
   * 
   * @var int $result
   * @access public
   */
  public $result;

  /**
   * 
   * @var abxTemplateList $template
   * @access public
   */
  public $template;

  /**
   * 
   * @var abxContainerList $container
   * @access public
   */
  public $container;

  /**
   * 
   * @var abxDynamicorgRuleList $dynorg
   * @access public
   */
  public $dynorg;

  /**
   * 
   * @param int $result
   * @param abxTemplateList $template
   * @param abxContainerList $container
   * @param abxDynamicorgRuleList $dynorg
   * @access public
   */
  public function __construct($result, $template, $container, $dynorg)
  {
    $this->result = $result;
    $this->template = $template;
    $this->container = $container;
    $this->dynorg = $dynorg;
  }

}
