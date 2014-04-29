<?php

class Metadata
{

  /**
   * 
   * @var string $name
   * @access public
   */
  public $name;

  /**
   * 
   * @var string $type
   * @access public
   */
  public $type;

  /**
   * 
   * @var int $index
   * @access public
   */
  public $index;

  /**
   * 
   * @var boolean $optional
   * @access public
   */
  public $optional;

  /**
   * 
   * @param string $name
   * @param string $type
   * @param int $index
   * @param boolean $optional
   * @access public
   */
  public function __construct($name, $type, $index, $optional)
  {
    $this->name = $name;
    $this->type = $type;
    $this->index = $index;
    $this->optional = $optional;
  }

}
