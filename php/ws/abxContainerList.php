<?php

class abxContainerList
{

  /**
   * 
   * @var abxContainer $container
   * @access public
   */
  public $container;

  /**
   * 
   * @param abxContainer $container
   * @access public
   */
  public function __construct($container)
  {
    $this->container = $container;
  }

}
