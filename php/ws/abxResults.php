<?php

class abxResults
{

  /**
   * 
   * @var abxQcHeadList $headColumn
   * @access public
   */
  public $headColumn;

  /**
   * 
   * @var abxQrowList $matrix
   * @access public
   */
  public $matrix;

  /**
   * 
   * @var string $containerName
   * @access public
   */
  public $containerName;

  /**
   * 
   * @param abxQcHeadList $headColumn
   * @param abxQrowList $matrix
   * @param string $containerName
   * @access public
   */
  public function __construct($headColumn, $matrix, $containerName)
  {
    $this->headColumn = $headColumn;
    $this->matrix = $matrix;
    $this->containerName = $containerName;
  }

}
