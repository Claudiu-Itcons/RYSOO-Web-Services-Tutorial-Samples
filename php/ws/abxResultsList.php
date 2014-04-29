<?php

class abxResultsList
{

  /**
   * 
   * @var abxResults $results
   * @access public
   */
  public $results;

  /**
   * 
   * @param abxResults $results
   * @access public
   */
  public function __construct($results)
  {
    $this->results = $results;
  }

}
