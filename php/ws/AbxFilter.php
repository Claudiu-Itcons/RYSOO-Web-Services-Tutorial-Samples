<?php

class AbxFilter
{

  /**
   * 
   * @var string $instance_name
   * @access public
   */
  public $instance_name;

  /**
   * 
   * @var string $group_name
   * @access public
   */
  public $group_name;

  /**
   * 
   * @var string $field_name
   * @access public
   */
  public $field_name;

  /**
   * 
   * @var string $field_value
   * @access public
   */
  public $field_value;

  /**
   * 
   * @var string $filter_name
   * @access public
   */
  public $filter_name;

  /**
   * 
   * @var string $instance_description
   * @access public
   */
  public $instance_description;

  /**
   * 
   * @var string $field_description
   * @access public
   */
  public $field_description;

  /**
   * 
   * @var string $field_value_description
   * @access public
   */
  public $field_value_description;

  /**
   * 
   * @param string $instance_name
   * @param string $group_name
   * @param string $field_name
   * @param string $field_value
   * @param string $filter_name
   * @param string $instance_description
   * @param string $field_description
   * @param string $field_value_description
   * @access public
   */
  public function __construct($instance_name, $group_name, $field_name, $field_value, $filter_name, $instance_description, $field_description, $field_value_description)
  {
    $this->instance_name = $instance_name;
    $this->group_name = $group_name;
    $this->field_name = $field_name;
    $this->field_value = $field_value;
    $this->filter_name = $filter_name;
    $this->instance_description = $instance_description;
    $this->field_description = $field_description;
    $this->field_value_description = $field_value_description;
  }

}
