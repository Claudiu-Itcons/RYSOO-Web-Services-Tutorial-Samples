<?php

class detailData
{

  /**
   * 
   * @var string $detailInstanceName
   * @access public
   */
  public $detailInstanceName;

  /**
   * 
   * @var string $detailDataId
   * @access public
   */
  public $detailDataId;

  /**
   * 
   * @param string $detailInstanceName
   * @param string $detailDataId
   * @access public
   */
  public function __construct($detailInstanceName, $detailDataId)
  {
    $this->detailInstanceName = $detailInstanceName;
    $this->detailDataId = $detailDataId;
  }

}
