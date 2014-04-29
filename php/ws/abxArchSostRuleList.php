<?php

class abxArchSostRuleList
{

  /**
   * 
   * @var abxArchSostRule $dataList
   * @access public
   */
  public $dataList;

  /**
   * 
   * @param abxArchSostRule $dataList
   * @access public
   */
  public function __construct($dataList)
  {
    $this->dataList = $dataList;
  }

}
