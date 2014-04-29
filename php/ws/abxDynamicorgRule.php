<?php

class abxDynamicorgRule
{

  /**
   * 
   * @var string $ruleName
   * @access public
   */
  public $ruleName;

  /**
   * 
   * @var string $user
   * @access public
   */
  public $user;

  /**
   * 
   * @var string $templateName
   * @access public
   */
  public $templateName;

  /**
   * 
   * @var string $rootInstanceName
   * @access public
   */
  public $rootInstanceName;

  /**
   * 
   * @var abxDynamicorgRuleElement $elements
   * @access public
   */
  public $elements;

  /**
   * 
   * @var abxPermission $permission
   * @access public
   */
  public $permission;

  /**
   * 
   * @param string $ruleName
   * @param string $user
   * @param string $templateName
   * @param string $rootInstanceName
   * @param abxDynamicorgRuleElement $elements
   * @param abxPermission $permission
   * @access public
   */
  public function __construct($ruleName, $user, $templateName, $rootInstanceName, $elements, $permission)
  {
    $this->ruleName = $ruleName;
    $this->user = $user;
    $this->templateName = $templateName;
    $this->rootInstanceName = $rootInstanceName;
    $this->elements = $elements;
    $this->permission = $permission;
  }

}
