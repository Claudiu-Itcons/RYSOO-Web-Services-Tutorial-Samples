<?php

class abxFKRaccRecord
{

  /**
   * 
   * @var string $dataIdValue
   * @access public
   */
  public $dataIdValue;

  /**
   * 
   * @var string $indexValue
   * @access public
   */
  public $indexValue;

  /**
   * 
   * @var string $descValue
   * @access public
   */
  public $descValue;

  /**
   * 
   * @param string $dataIdValue
   * @param string $indexValue
   * @param string $descValue
   * @access public
   */
  public function __construct($dataIdValue, $indexValue, $descValue)
  {
    $this->dataIdValue = $dataIdValue;
    $this->indexValue = $indexValue;
    $this->descValue = $descValue;
  }

}
