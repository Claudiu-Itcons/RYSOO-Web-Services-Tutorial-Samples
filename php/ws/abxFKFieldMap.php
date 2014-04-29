<?php

class abxFKFieldMap
{

  /**
   * 
   * @var string $remoteField
   * @access public
   */
  public $remoteField;

  /**
   * 
   * @var string $localField
   * @access public
   */
  public $localField;

  /**
   * 
   * @param string $remoteField
   * @param string $localField
   * @access public
   */
  public function __construct($remoteField, $localField)
  {
    $this->remoteField = $remoteField;
    $this->localField = $localField;
  }

}
