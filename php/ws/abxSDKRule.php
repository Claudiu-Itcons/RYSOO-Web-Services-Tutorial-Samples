<?php

class abxSDKRule
{

  /**
   * 
   * @var string $id
   * @access public
   */
  public $id;

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $name_description
   * @access public
   */
  public $name_description;

  /**
   * 
   * @var string $description
   * @access public
   */
  public $description;

  /**
   * 
   * @var string $parametersXML
   * @access public
   */
  public $parametersXML;

  /**
   * 
   * @param string $id
   * @param string $name
   * @param string $name_description
   * @param string $description
   * @param string $parametersXML
   * @access public
   */
  public function __construct($id, $name, $name_description, $description, $parametersXML)
  {
    $this->id = $id;
    $this->name = $name;
    $this->name_description = $name_description;
    $this->description = $description;
    $this->parametersXML = $parametersXML;
  }

}
