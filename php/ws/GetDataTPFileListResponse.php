<?php

class GetDataTPFileListResponse
{

  /**
   * 
   * @var abxFileTpResult $return
   * @access public
   */
  public $return;

  /**
   * 
   * @param abxFileTpResult $return
   * @access public
   */
  public function __construct($return)
  {
    $this->return = $return;
  }

}
