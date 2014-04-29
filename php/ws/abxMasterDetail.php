<?php

class abxMasterDetail
{

  /**
   * 
   * @var masterList $masterList
   * @access public
   */
  public $masterList;

  /**
   * 
   * @var detailList $detailList
   * @access public
   */
  public $detailList;

  /**
   * 
   * @param masterList $masterList
   * @param detailList $detailList
   * @access public
   */
  public function __construct($masterList, $detailList)
  {
    $this->masterList = $masterList;
    $this->detailList = $detailList;
  }

}
