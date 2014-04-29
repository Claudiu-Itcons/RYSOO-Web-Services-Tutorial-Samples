<?php

class DeleteTPFileByIdResponse
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
